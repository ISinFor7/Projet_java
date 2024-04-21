package ui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Affichage {
	static boolean fullscreen = true;
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      //>>>>>>>>>>>>>>>>>>Construction de la fenêtre de base<<<<<<<<<<<<<<<<<<<//
      JFrame fenetre = new JFrame();
      fenetre.setUndecorated(true); // Retire la barre de base et les bordures
      fenetre.setResizable(true);
      
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Récupère la taille de l'écran
      
      // Défini la taille de la fenêtre et sa position
      fenetre.setSize(screenSize.width, screenSize.height);
      fenetre.setLocationRelativeTo(null); // Centre la fenêtre
      fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH); // Met la fenêtre en plein écran
      
      //-----------------Construction de la barre custom---------------------//
      JPanel barre = new JPanel(new FlowLayout());
      barre.setBackground(Color.BLACK);
      
      // Ajoute un titre à la Barre
      JLabel titreBarre = new JLabel("XXX : L'application de recherche musicale");
      titreBarre.setForeground(Color.WHITE);
      titreBarre.setHorizontalAlignment(SwingConstants.LEFT);
      barre.add(titreBarre, BorderLayout.CENTER);
      
      // Ajoute un bouton pour enlever le plein écran de la fenêtre à la barre
      JButton exitFullScreenButton = new JButton("=");
      exitFullScreenButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (fullscreen) {
            fenetre.setExtendedState(JFrame.NORMAL);
            fullscreen = false;
          } else {
        	  fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
            fullscreen = true;
          }
        }
      });
      barre.add(exitFullScreenButton, BorderLayout.EAST);
      
      // Ajoute un bouton pour fermer la fenêtre à la barre
      JButton closeButton = new JButton("X");
      closeButton.setForeground(Color.WHITE);
      closeButton.setBackground(Color.RED);
      closeButton.setFocusPainted(false);
      closeButton.addActionListener(e -> System.exit(0));
      barre.add(closeButton, BorderLayout.EAST);

      // Rend la fenêtre déplaçable en glissant la souris après avoir cliqué sur la barre
        MouseAdapter mouseAdapter = new MouseAdapter() {
          private Point mouseOffset;

          @Override
          public void mousePressed(MouseEvent e) {
            mouseOffset = e.getPoint();
          }

          @Override
          public void mouseDragged(MouseEvent e) {
            Point newLocation = e.getLocationOnScreen();
            newLocation.translate(-mouseOffset.x, -mouseOffset.y);
            fenetre.setLocation(newLocation);
          }
        };
        titreBarre.addMouseListener(mouseAdapter);
        titreBarre.addMouseMotionListener(mouseAdapter);
    
      // Ajoute la barre sur la fenêtre
      fenetre.add(barre, BorderLayout.NORTH);
      
      //------------Construction de l'intérieur de la fenêtre---------------//
      JTextArea texte = new JTextArea("Test");
      fenetre.add(new JScrollPane(texte), BorderLayout.CENTER);

      
      
      // Affiche la fenêtre
      fenetre.setVisible(true);
    });
  }
}
