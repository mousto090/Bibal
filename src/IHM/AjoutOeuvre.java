/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Utility.BibalExceptions;
import Utility.DBConnection;
import static Utility.Utility.closeStatementResultSet;
import static Utility.Utility.initialiseRequetePreparee;
import control.OeuvreControl;
import control.UsagerControl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objets_metiers.Livre;
import objets_metiers.Magazine;
import objets_metiers.Usager;

/**
 *
 * @author Jalloh
 */
public class AjoutOeuvre extends javax.swing.JDialog {

    /**
     * Creates new form AjoutOe
     */
    public AjoutOeuvre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIdentifiant(); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panAjoutOeuvre = new javax.swing.JPanel();
        panAjoutBas = new javax.swing.JPanel();
        typeOeuvreLabel = new javax.swing.JLabel();
        identifiantLabel = new javax.swing.JLabel();
        auteurField = new javax.swing.JFormattedTextField();
        identifiantField = new javax.swing.JFormattedTextField();
        auteurLabel = new javax.swing.JLabel();
        titreLabel = new javax.swing.JLabel();
        titreField = new javax.swing.JFormattedTextField();
        typeOeuvreCombo = new javax.swing.JComboBox();
        categorieLabel = new javax.swing.JLabel();
        categorieField = new javax.swing.JFormattedTextField();
        ajouterBouton = new javax.swing.JButton();
        annulerBouton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("Gestion personnel"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 608));
        jPanel1.setRequestFocusEnabled(false);

        panAjoutOeuvre.setBackground(new java.awt.Color(255, 255, 255));

        panAjoutBas.setBackground(new java.awt.Color(255, 255, 255));
        panAjoutBas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        typeOeuvreLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        typeOeuvreLabel.setForeground(new java.awt.Color(0, 0, 255));
        typeOeuvreLabel.setText("Type de l'oeuvre : ");

        identifiantLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        identifiantLabel.setForeground(new java.awt.Color(0, 0, 255));
        identifiantLabel.setText("Identifiant ");

        auteurField.setPreferredSize(new java.awt.Dimension(123, 26));

        identifiantField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        identifiantField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identifiantField.setToolTipText("");
        identifiantField.setEnabled(false);
        identifiantField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        identifiantField.setPreferredSize(new java.awt.Dimension(123, 26));

        auteurLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        auteurLabel.setForeground(new java.awt.Color(0, 0, 255));
        auteurLabel.setText("Auteur");

        titreLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        titreLabel.setForeground(new java.awt.Color(0, 0, 255));
        titreLabel.setText("Titre");

        titreField.setPreferredSize(new java.awt.Dimension(123, 26));

        typeOeuvreCombo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        typeOeuvreCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Livre", "Magazine" }));
        typeOeuvreCombo.setPreferredSize(new java.awt.Dimension(123, 26));
        typeOeuvreCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOeuvreComboActionPerformed(evt);
            }
        });

        categorieLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        categorieLabel.setForeground(new java.awt.Color(0, 0, 255));
        categorieLabel.setText("Catégorie");

        categorieField.setPreferredSize(new java.awt.Dimension(123, 26));

        ajouterBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBoutonActionPerformed(evt);
            }
        });

        annulerBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAjoutBasLayout = new javax.swing.GroupLayout(panAjoutBas);
        panAjoutBas.setLayout(panAjoutBasLayout);
        panAjoutBasLayout.setHorizontalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAjoutBasLayout.createSequentialGroup()
                        .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(auteurLabel)
                            .addComponent(titreLabel)
                            .addComponent(identifiantLabel)
                            .addComponent(typeOeuvreLabel)
                            .addComponent(categorieLabel))
                        .addGap(62, 62, 62)
                        .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(typeOeuvreCombo, 0, 190, Short.MAX_VALUE)
                            .addComponent(identifiantField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titreField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(auteurField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categorieField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAjoutBasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(annulerBouton)
                        .addGap(34, 34, 34)
                        .addComponent(ajouterBouton)))
                .addContainerGap())
        );
        panAjoutBasLayout.setVerticalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeOeuvreLabel)
                    .addComponent(typeOeuvreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(identifiantLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(identifiantField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titreLabel)
                    .addComponent(titreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auteurLabel)
                    .addComponent(auteurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categorieLabel)
                    .addComponent(categorieField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterBouton)
                    .addComponent(annulerBouton))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout panAjoutOeuvreLayout = new javax.swing.GroupLayout(panAjoutOeuvre);
        panAjoutOeuvre.setLayout(panAjoutOeuvreLayout);
        panAjoutOeuvreLayout.setHorizontalGroup(
            panAjoutOeuvreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAjoutOeuvreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAjoutBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panAjoutOeuvreLayout.setVerticalGroup(
            panAjoutOeuvreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutOeuvreLayout.createSequentialGroup()
                .addComponent(panAjoutBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Ajouter Oeuvre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panAjoutOeuvre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(panAjoutOeuvre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeOeuvreComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOeuvreComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOeuvreComboActionPerformed

    private void ajouterBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBoutonActionPerformed

        try {
            String titre = titreField.getText();
            String auteur = auteurField.getText();
            String categorie = categorieField.getText();
            String typeOeuvre = typeOeuvreCombo.getSelectedItem().toString();
            //OeuvreControl.ajouter("Livre 1", "Auteur 1", "Categorie 1", typeOeuvre);
            if (typeOeuvre.equals(Magazine.class.getSimpleName())) {
                OeuvreControl.ajouter(new Magazine(titre, auteur, categorie));
            } else {
                OeuvreControl.ajouter(new Livre(titre, auteur, categorie));
            }
            JOptionPane.showMessageDialog(null, "Oeuvre ajoutée avec succès", "Informations", JOptionPane.INFORMATION_MESSAGE);
            setIdentifiant();
            clearField();
//            String titre[] = new String[]{"Identifiant", "Nom",
//                "Prénom", "Date de naissance", "Sexe", "Téléphone", "Adresse"};
//            final String REQUETE = "SELECT id, nom, prenom, dateNais, sexe, tel, adresse"
//                    + " FROM usager ORDER BY id DESC LIMIT 10";
//            fillListeUsager(REQUETE, new Object[0], titre);

        } catch (BibalExceptions ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ajouterBoutonActionPerformed

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        this.dispose();
    }//GEN-LAST:event_annulerBoutonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjoutOeuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutOeuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutOeuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutOeuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AjoutOeuvre dialog = new AjoutOeuvre(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void clearField() {
        titreField.setText("");
        auteurField.setText("");
        categorieField.setText("");
    }

    private void setIdentifiant() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            final String SQL_SELECT_ID = "SELECT id FROM oeuvre ORDER BY id DESC LIMIT 1";
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(),
                    SQL_SELECT_ID, new Object[0]);
            resultSet = preparedStatement.executeQuery();
            int identifiant = 1;
            if (resultSet.first()) {
                identifiant = resultSet.getInt("id");
            }
            identifiantField.setText((identifiant + 1) + "");
        } catch (SQLException | BibalExceptions e) {
            JOptionPane.showMessageDialog(null, "Erreurs d'accès à la base de données",
                    "Erreurs", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeStatementResultSet(preparedStatement, resultSet);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterBouton;
    private javax.swing.JButton annulerBouton;
    private javax.swing.JFormattedTextField auteurField;
    private javax.swing.JLabel auteurLabel;
    private javax.swing.JFormattedTextField categorieField;
    private javax.swing.JLabel categorieLabel;
    private javax.swing.JFormattedTextField identifiantField;
    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panAjoutBas;
    private javax.swing.JPanel panAjoutOeuvre;
    private javax.swing.JFormattedTextField titreField;
    private javax.swing.JLabel titreLabel;
    private javax.swing.JComboBox typeOeuvreCombo;
    private javax.swing.JLabel typeOeuvreLabel;
    // End of variables declaration//GEN-END:variables
}
