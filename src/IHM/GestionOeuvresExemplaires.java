/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Utility.BibalExceptions;
import Utility.ModelTableau;
import static Utility.Utility.showMessageSucces;
import control.OeuvreControl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import objets_metiers.Livre;
import objets_metiers.Magazine;
import objets_metiers.Oeuvre;

/**
 *
 * @author SIMO
 */
public class GestionOeuvresExemplaires extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form GestionUsager
     */
    public GestionOeuvresExemplaires() {

        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);
        tableListeOeuvre.addMouseListener(this);
        tableListeOeuvre.addMouseListener(this);
        tableListeOeuvre.setModel(new ModelTableau(new Object[0][0],
                new String[]{"ID", "Titre",
                    "Auteur", "Catégorie", "Type", "Exemplaires", "Réservations"}));
        tableListeOeuvre.setRowHeight(30);
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
        panRecherch = new javax.swing.JPanel();
        RecherchParLabel = new javax.swing.JLabel();
        RecherchField = new javax.swing.JFormattedTextField();
        RecherchCombo = new javax.swing.JComboBox();
        RecherchBouton = new javax.swing.JButton();
        panListeOeuvre = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListeOeuvre = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        retourButton = new javax.swing.JButton();
        modifierBouton = new javax.swing.JButton();
        ajouterBouton = new javax.swing.JButton();
        exemplaireButton = new javax.swing.JButton();
        supprimerButton = new javax.swing.JButton();
        afficherButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion des oeuvres et des Exemplaires");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("Gestion personnel"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 608));
        jPanel1.setRequestFocusEnabled(false);

        panRecherch.setBackground(new java.awt.Color(255, 255, 255));
        panRecherch.setBorder(javax.swing.BorderFactory.createTitledBorder("Rechercher"));

        RecherchParLabel.setText("Rechercher par  ");

        RecherchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecherchField.setPreferredSize(new java.awt.Dimension(130, 26));

        RecherchCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Identifiant", "Titre", "Tout afficher" }));
        RecherchCombo.setPreferredSize(new java.awt.Dimension(123, 26));
        RecherchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchComboActionPerformed(evt);
            }
        });

        RecherchBouton.setText("Rechercher");
        RecherchBouton.setPreferredSize(new java.awt.Dimension(47, 26));
        RecherchBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRecherchLayout = new javax.swing.GroupLayout(panRecherch);
        panRecherch.setLayout(panRecherchLayout);
        panRecherchLayout.setHorizontalGroup(
            panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecherchLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRecherchLayout.createSequentialGroup()
                        .addComponent(RecherchField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RecherchBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panRecherchLayout.createSequentialGroup()
                        .addComponent(RecherchParLabel)
                        .addGap(41, 41, 41)
                        .addComponent(RecherchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        panRecherchLayout.setVerticalGroup(
            panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecherchLayout.createSequentialGroup()
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchParLabel)
                    .addComponent(RecherchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecherchBouton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panListeOeuvre.setBackground(new java.awt.Color(255, 255, 255));
        panListeOeuvre.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des Oeuvres"));

        jScrollPane1.getViewport().setBackground(Color.white);
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableListeOeuvre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titre", "Auteur", "Catégorie", "Type", "Exemplaires", "Réservations"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListeOeuvre.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableListeOeuvre.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableListeOeuvre);
        if (tableListeOeuvre.getColumnModel().getColumnCount() > 0) {
            tableListeOeuvre.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        javax.swing.GroupLayout panListeOeuvreLayout = new javax.swing.GroupLayout(panListeOeuvre);
        panListeOeuvre.setLayout(panListeOeuvreLayout);
        panListeOeuvreLayout.setHorizontalGroup(
            panListeOeuvreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListeOeuvreLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );
        panListeOeuvreLayout.setVerticalGroup(
            panListeOeuvreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        retourButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        retourButton.setText("Retour");
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        modifierBouton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        modifierBouton.setText("Modifier");
        modifierBouton.setEnabled(false);
        modifierBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierBoutonActionPerformed(evt);
            }
        });

        ajouterBouton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBoutonActionPerformed(evt);
            }
        });

        exemplaireButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exemplaireButton.setText("Exemplaire");
        exemplaireButton.setEnabled(false);
        exemplaireButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exemplaireButtonActionPerformed(evt);
            }
        });

        supprimerButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        supprimerButton.setText("Supprimer");
        supprimerButton.setEnabled(false);
        supprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerButtonActionPerformed(evt);
            }
        });

        afficherButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        afficherButton.setText("Afficher");
        afficherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exemplaireButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifierBouton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajouterBouton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supprimerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(afficherButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajouterBouton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(afficherButton)
                .addGap(43, 43, 43)
                .addComponent(modifierBouton)
                .addGap(47, 47, 47)
                .addComponent(supprimerButton)
                .addGap(45, 45, 45)
                .addComponent(exemplaireButton)
                .addGap(45, 45, 45)
                .addComponent(retourButton)
                .addGap(33, 33, 33))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Gestion des Oeuvres et Exemplaires");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panRecherch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panListeOeuvre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panRecherch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panListeOeuvre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(837, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
        Menu m = new Menu();
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_retourButtonActionPerformed

    private void RecherchBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchBoutonActionPerformed
        String rechPar = RecherchCombo.getSelectedItem().toString();
        String textARechercher = RecherchField.getText().trim();
        if (textARechercher.length() > 0) {
            ArrayList<Oeuvre> listOeuvres;
            try {
                switch (rechPar) {
                    case "Identifiant":
                        int identifiant = parseInt(textARechercher);
                        Oeuvre oeuvre = OeuvreControl.findById(identifiant);
                        fillOeuvreJtable(new ArrayList<Oeuvre>() {
                            {
                                add(oeuvre);
                            }
                        });
                        break;
                    case "Titre":
                        listOeuvres = OeuvreControl.findByTitre(textARechercher);
                        fillOeuvreJtable(listOeuvres);
                        break;
                    case "Tout afficher":
                        listOeuvres = OeuvreControl.getListOeuvres();
                        fillOeuvreJtable(listOeuvres);
                        break;
                }
            } catch (BibalExceptions e) {
                System.out.println("IHM.GestionUsager.RecherchBoutonActionPerformed() : Erreurs");
            } catch (NumberFormatException e) {
                showMessageSucces("Identifiant non valide");
            }
        }
    }//GEN-LAST:event_RecherchBoutonActionPerformed

    private void RecherchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchComboActionPerformed

        if (RecherchCombo.getSelectedItem().equals("Tout afficher")) {
            try {
                ArrayList<Oeuvre> listOeuvres = OeuvreControl.getListOeuvres();
                fillOeuvreJtable(listOeuvres);
                RecherchBouton.setEnabled(false);
                RecherchField.setEnabled(false);
            } catch (BibalExceptions e) {
                System.out.println("IHM.GestionUsager.RecherchComboActionPerformed() : Erreurs");
            }
        } else {
            RecherchBouton.setEnabled(true);
            RecherchField.setEnabled(true);
        }
    }//GEN-LAST:event_RecherchComboActionPerformed

    private void ajouterBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBoutonActionPerformed

        AjoutOeuvre ajoutOeuvre = new AjoutOeuvre(this, true);
        ajoutOeuvre.setLocationRelativeTo(null);
        ajoutOeuvre.setVisible(true);
    }//GEN-LAST:event_ajouterBoutonActionPerformed

    private void modifierBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierBoutonActionPerformed
        Oeuvre oeuvre = getOeuvreInfos();
        if (null != oeuvre) {
            ModificationOeuvre modificationOeuvre = new ModificationOeuvre(this, true, oeuvre);
            modificationOeuvre.setLocationRelativeTo(null);
            modificationOeuvre.setVisible(true);
        }
    }//GEN-LAST:event_modifierBoutonActionPerformed

    private void afficherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherButtonActionPerformed
        try {
            ArrayList<Oeuvre> listOeuvres = OeuvreControl.getListOeuvres();
            fillOeuvreJtable(listOeuvres);
        } catch (BibalExceptions ex) {
            System.out.println("IHM.GestionOeuvre.afficherButtonActionPerformed()");
        }
    }//GEN-LAST:event_afficherButtonActionPerformed

    private void supprimerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerButtonActionPerformed

        try {
            Oeuvre oeuvre = getOeuvreInfos();
            String message;
            if (null != oeuvre) {
                if (oeuvre.getExamplairesOeuvre().size() > 0) {
                    message = "Vous ne pouvez pas supprimer cette oeuvre\n"
                            + " Elle a " + oeuvre.getExamplairesOeuvre().size() + " exemplaire"
                            + (oeuvre.getExamplairesOeuvre().size() > 1 ? "s" : "");
                    showMessageSucces(message);
                } else {
                    message = "Cette oeuvre a " + oeuvre.getExamplairesOeuvre().size() + " exemplaire\n"
                            + "\n Voulez-vous la supprimer ?";
                    int reponse = showConfirmDialog(null, message,
                            "Avertissement", JOptionPane.OK_CANCEL_OPTION);
                    if (reponse == JOptionPane.OK_OPTION) {
                        OeuvreControl.supprimer(oeuvre);
                        ((ModelTableau) tableListeOeuvre.getModel()).removeRow(tableListeOeuvre.getSelectedRow());
                        showMessageSucces("L'Oeuvre a bien été supprimée");

                    }
                }
            }

        } catch (BibalExceptions ex) {
            System.out.println("IHM.GestionOeuvresExemplaires.supprimerButtonActionPerformed()");
        }
    }//GEN-LAST:event_supprimerButtonActionPerformed

    private void exemplaireButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exemplaireButtonActionPerformed
        Oeuvre oeuvre = getOeuvreInfos();
        if (null != oeuvre) {
            Exemplaires exemplaires = new Exemplaires(this, true, getOeuvreInfos());
            exemplaires.setLocationRelativeTo(null);
            exemplaires.setVisible(true);
        }
    }//GEN-LAST:event_exemplaireButtonActionPerformed

    private Oeuvre getOeuvreInfos() {
        Oeuvre oeuvre = null;
        if (tableListeOeuvre.getSelectedRow() != -1) {
            int id = parseInt(dataLigneSelected[0].toString());
            String titre = dataLigneSelected[1].toString();
            String auteur = dataLigneSelected[2].toString();
            String categorie = dataLigneSelected[3].toString();
            String typeOeuvre = dataLigneSelected[4].toString();
            int nbExemplaire = parseInt(dataLigneSelected[5].toString());
            int nbResa = parseInt(dataLigneSelected[6].toString());

            if (typeOeuvre.equals(Magazine.class.getSimpleName())) {
                oeuvre = new Magazine(id, titre, auteur, categorie, nbResa);
            } else {
                oeuvre = new Livre(id, titre, auteur, categorie, nbResa);
            }
            oeuvre.getExamplairesOeuvre().setSize(nbExemplaire);
        }
        return oeuvre;

    }

    private void fillOeuvreJtable(ArrayList<Oeuvre> listOeuvres) {
        String titre[] = new String[]{"ID", "Titre",
            "Auteur", "Catégorie", "Type", "Exemplaires", "Réservations"};
        if (listOeuvres.size() > 0) {
//            pour le findByID si l'objet ajouté est null
            int nbLigne = (null == listOeuvres.get(0)) ? 0 : listOeuvres.size();
            Object data[][] = new Object[nbLigne][titre.length];
            for (int i = 0; i < nbLigne; i++) {
                Oeuvre oeuvre = listOeuvres.get(i);
                data[i][0] = oeuvre.getId();
                data[i][1] = oeuvre.getTitre();
                data[i][2] = oeuvre.getAuteur();
                data[i][3] = oeuvre.getCategorie();
                data[i][4] = oeuvre.getClass().getSimpleName();
                data[i][5] = oeuvre.getExamplairesOeuvre().size();
                data[i][6] = oeuvre.getNbResa();
            }
            ModelTableau model = new ModelTableau(data, titre);
            tableListeOeuvre.setModel(model);
            tableListeOeuvre.setRowHeight(30);
        } else {
            //afficher tableau vide
            Object data[][] = new Object[1][titre.length];
            ModelTableau model = new ModelTableau(data, titre);
            tableListeOeuvre.setModel(model);
            tableListeOeuvre.setRowHeight(1);
        }
        modifierBouton.setEnabled(false);
        supprimerButton.setEnabled(false);
        exemplaireButton.setEnabled(false);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int row = tableListeOeuvre.getSelectedRow();
        int nbreCol = tableListeOeuvre.getColumnCount();

        dataLigneSelected = new Object[nbreCol];
        if (row >= 0) {
            for (int i = 0; i < nbreCol; i++) {
                dataLigneSelected[i] = tableListeOeuvre.getModel().getValueAt(row, i);
            }
            modifierBouton.setEnabled(true);
            supprimerButton.setEnabled(true);
            exemplaireButton.setEnabled(true);
        } else {
            modifierBouton.setEnabled(false);
            supprimerButton.setEnabled(false);
            exemplaireButton.setEnabled(true);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionOeuvresExemplaires().setVisible(true);
            }
        });
    }

    private Object dataLigneSelected[];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecherchBouton;
    private javax.swing.JComboBox RecherchCombo;
    private javax.swing.JFormattedTextField RecherchField;
    private javax.swing.JLabel RecherchParLabel;
    private javax.swing.JButton afficherButton;
    private javax.swing.JButton ajouterBouton;
    private javax.swing.JButton exemplaireButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierBouton;
    private javax.swing.JPanel panListeOeuvre;
    private javax.swing.JPanel panRecherch;
    private javax.swing.JButton retourButton;
    private javax.swing.JButton supprimerButton;
    public static javax.swing.JTable tableListeOeuvre;
    // End of variables declaration//GEN-END:variables
}
