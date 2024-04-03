package DB;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.json.simple.parser.ParseException;

public class MainUI {

    private Controleur controleur;

    public MainUI(Controleur controleur) {
        this.controleur = controleur;

        JFrame frame = new JFrame("Gestion de bibliothèque");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
        
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Nom d'utilisateur:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        JTextField usernameField = new JTextField(20);
        panel.add(usernameField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Âge:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 0, 150, 1));
        panel.add(ageSpinner, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Adresse mail :"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        JTextField adressemailtTextField = new JTextField(25);
        panel.add(adressemailtTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        JButton creerUtilisateurBtn = new JButton("Créer un nouvel utilisateur");
        creerUtilisateurBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomUtilisateur = usernameField.getText();
                int age = (int) ageSpinner.getValue();
                String adresse = adressemailtTextField.getText();
                controleur.creerNouvelUtilisateur(nomUtilisateur, age, adresse);
                JOptionPane.showMessageDialog(frame, "Utilisateur créé avec succès!");
            }
        });
        panel.add(creerUtilisateurBtn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        JButton afficherartisteButton = new JButton("Afficher les artistes disponibles");
        afficherartisteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    controleur.artistesdispo("BASE/base.json");
                    JOptionPane.showMessageDialog(frame, "regardez votre terminal !");
                } catch (ParseException | java.text.ParseException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(afficherartisteButton, gbc);

        frame.getContentPane().add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null); // Centrer la fenêtre sur l'écran de bibliotheque 
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Controleur controleur = new Controleur();
        MainUI ui = new MainUI(controleur);
    }
}
