/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaproject;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

/**
 *
 * @author tyhak
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton27 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        librairyButton = new javax.swing.JButton();
        mainPanel1 = new javaproject.MainPanel();
        jLabel1 = new javax.swing.JLabel();
        artist1 = new javax.swing.JButton();
        artist2 = new javax.swing.JButton();
        artist3 = new javax.swing.JButton();
        artist4 = new javax.swing.JButton();
        artist5 = new javax.swing.JButton();
        artist6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        album1 = new javax.swing.JButton();
        album2 = new javax.swing.JButton();
        album3 = new javax.swing.JButton();
        album4 = new javax.swing.JButton();
        album5 = new javax.swing.JButton();
        album6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        title1 = new javax.swing.JButton();
        title2 = new javax.swing.JButton();
        title3 = new javax.swing.JButton();
        title4 = new javax.swing.JButton();
        title5 = new javax.swing.JButton();
        title6 = new javax.swing.JButton();

        jButton27.setText("jButton1");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaProject");

        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(640, 40));

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeButton.setFocusPainted(false);
        homeButton.setFocusable(false);
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        homeButton.setIconTextGap(0);
        homeButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        homeButton.setMaximumSize(new java.awt.Dimension(100, 100));
        homeButton.setMinimumSize(new java.awt.Dimension(50, 50));
        homeButton.setSelected(true);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(homeButton);
        homeButton.getAccessibleContext().setAccessibleName("Home");

        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backward.png"))); // NOI18N
        previousButton.setToolTipText("");
        previousButton.setBorder(null);
        previousButton.setBorderPainted(false);
        previousButton.setFocusPainted(false);
        previousButton.setFocusable(false);
        previousButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        previousButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        previousButton.setIconTextGap(0);
        previousButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        previousButton.setMaximumSize(new java.awt.Dimension(100, 100));
        previousButton.setMinimumSize(new java.awt.Dimension(50, 50));
        previousButton.setPreferredSize(new java.awt.Dimension(30, 30));
        previousButton.setRequestFocusEnabled(false);
        previousButton.setRolloverEnabled(false);
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });
        jPanel2.add(previousButton);
        previousButton.getAccessibleContext().setAccessibleName("BackwardHistory");

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/forward.png"))); // NOI18N
        nextButton.setToolTipText("");
        nextButton.setBorder(null);
        nextButton.setBorderPainted(false);
        nextButton.setFocusPainted(false);
        nextButton.setFocusable(false);
        nextButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nextButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nextButton.setMaximumSize(new java.awt.Dimension(100, 100));
        nextButton.setMinimumSize(new java.awt.Dimension(50, 50));
        nextButton.setPreferredSize(new java.awt.Dimension(30, 30));
        nextButton.setVerifyInputWhenFocusTarget(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nextButton);
        nextButton.getAccessibleContext().setAccessibleName("ForwardHistory");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Recherche");
        jTextField1.setActionCommand("<Not Set>");
        jTextField1.setPreferredSize(new java.awt.Dimension(400, 22));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);

        jButton10.setText("...");
        jButton10.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);

        librairyButton.setText("LIB");
        librairyButton.setToolTipText("");
        librairyButton.setBorder(null);
        librairyButton.setBorderPainted(false);
        librairyButton.setFocusPainted(false);
        librairyButton.setFocusable(false);
        librairyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        librairyButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        librairyButton.setMaximumSize(new java.awt.Dimension(100, 100));
        librairyButton.setMinimumSize(new java.awt.Dimension(50, 50));
        librairyButton.setPreferredSize(new java.awt.Dimension(30, 30));
        librairyButton.setVerifyInputWhenFocusTarget(false);
        librairyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librairyButtonActionPerformed(evt);
            }
        });
        jPanel2.add(librairyButton);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        mainPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Artistes recommandés");

        artist1.setText("artist1");

        artist2.setText("artist2");

        artist3.setText("artist3");

        artist4.setText("artist4");

        artist5.setText("artist5");

        artist6.setText("artist6");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Les albums qui risquent de vous plaire");

        album1.setText("album1");

        album2.setText("album2");

        album3.setText("album3");

        album4.setText("album4");

        album5.setText("album5");

        album6.setText("album6");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Titres selon vos goûts récents");

        title1.setText("title1");

        title2.setText("title2");
        title2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                title2ActionPerformed(evt);
            }
        });

        title3.setText("title3");
        title3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                title3ActionPerformed(evt);
            }
        });

        title4.setText("title4");

        title5.setText("title5");
        title5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                title5ActionPerformed(evt);
            }
        });

        title6.setText("title6");
        title6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                title6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel1Layout = new javax.swing.GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(title4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(title5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(title6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addComponent(album1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(album2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(album3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(album4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(album5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(album6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addComponent(artist1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(artist2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(artist3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(artist4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(artist5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(artist6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanel1Layout.setVerticalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artist1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artist2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artist3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artist4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artist5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artist6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(album1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(album2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(album3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(album4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(album5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(album6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        getContentPane().add(mainPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previousButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void title5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_title5ActionPerformed

    private void title3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_title3ActionPerformed

    private void title6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_title6ActionPerformed

    private void title2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_title2ActionPerformed

    private void librairyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librairyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_librairyButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton album1;
    private javax.swing.JButton album2;
    private javax.swing.JButton album3;
    private javax.swing.JButton album4;
    private javax.swing.JButton album5;
    private javax.swing.JButton album6;
    private javax.swing.JButton artist1;
    private javax.swing.JButton artist2;
    private javax.swing.JButton artist3;
    private javax.swing.JButton artist4;
    private javax.swing.JButton artist5;
    private javax.swing.JButton artist6;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton27;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton librairyButton;
    private javaproject.MainPanel mainPanel1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton title1;
    private javax.swing.JButton title2;
    private javax.swing.JButton title3;
    private javax.swing.JButton title4;
    private javax.swing.JButton title5;
    private javax.swing.JButton title6;
    // End of variables declaration//GEN-END:variables
}
