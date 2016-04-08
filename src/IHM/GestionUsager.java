/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Utility.BibalExceptions;
import Utility.DBConnection;
import Utility.ModelTableau;
import static Utility.Utility.closeStatementResultSet;
import static Utility.Utility.initialiseRequetePreparee;
import control.UsagerControl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objets_metiers.Usager;

/**
 *
 * @author SIMO
 */
public class GestionUsager extends javax.swing.JFrame {

    /**
     * Creates new form GestionUsager
     */
    public GestionUsager() {

        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);
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

        sexeBttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panRecherch = new javax.swing.JPanel();
        RecherchParLabel = new javax.swing.JLabel();
        RecherchField = new javax.swing.JFormattedTextField();
        RecherchCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        RecherchBouton = new javax.swing.JButton();
        panListeUsager = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListeUsager = new javax.swing.JTable();
        panAjoutUsager = new javax.swing.JPanel();
        panAjoutBas = new javax.swing.JPanel();
        civiliteLabel = new javax.swing.JLabel();
        matriculeLabel = new javax.swing.JLabel();
        prenomField = new javax.swing.JFormattedTextField();
        identifiantField = new javax.swing.JFormattedTextField();
        prenomLabel = new javax.swing.JLabel();
        telField = new javax.swing.JFormattedTextField();
        nomLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        nomField = new javax.swing.JFormattedTextField();
        civiliteCombo = new javax.swing.JComboBox();
        dateNaisPicker = new org.jdesktop.swingx.JXDatePicker();
        prenomLabel1 = new javax.swing.JLabel();
        adresseField = new javax.swing.JFormattedTextField();
        annulerBouton = new javax.swing.JButton();
        ajouterBouton = new javax.swing.JButton();
        modifierBouton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        retourButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1162, 608));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("Gestion personnel"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 608));
        jPanel1.setRequestFocusEnabled(false);

        panRecherch.setBackground(new java.awt.Color(255, 255, 255));
        panRecherch.setBorder(javax.swing.BorderFactory.createTitledBorder("Rechercher"));

        RecherchParLabel.setText("Rechercher par  ");

        RecherchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecherchField.setPreferredSize(new java.awt.Dimension(123, 26));

        RecherchCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Identifiant", "Nom", "Tout afficher" }));
        RecherchCombo.setPreferredSize(new java.awt.Dimension(123, 26));

        jLabel6.setText("Texte à rechercher  ");

        RecherchBouton.setText("OK");
        RecherchBouton.setPreferredSize(new java.awt.Dimension(47, 26));

        javax.swing.GroupLayout panRecherchLayout = new javax.swing.GroupLayout(panRecherch);
        panRecherch.setLayout(panRecherchLayout);
        panRecherchLayout.setHorizontalGroup(
            panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecherchLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RecherchParLabel)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRecherchLayout.createSequentialGroup()
                        .addComponent(RecherchField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RecherchBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RecherchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        panRecherchLayout.setVerticalGroup(
            panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecherchLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchParLabel)
                    .addComponent(RecherchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(RecherchBouton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panListeUsager.setBackground(new java.awt.Color(255, 255, 255));
        panListeUsager.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des Usagers"));

        jScrollPane1.getViewport().setBackground(Color.white);
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableListeUsager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant", "Civilité", "Nom", "Prénom", "Date de naissance", "Téléphone", "Adresse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListeUsager.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableListeUsager.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableListeUsager);

        javax.swing.GroupLayout panListeUsagerLayout = new javax.swing.GroupLayout(panListeUsager);
        panListeUsager.setLayout(panListeUsagerLayout);
        panListeUsagerLayout.setHorizontalGroup(
            panListeUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListeUsagerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panListeUsagerLayout.setVerticalGroup(
            panListeUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panAjoutUsager.setBackground(new java.awt.Color(255, 255, 255));
        panAjoutUsager.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajout Usager"));

        panAjoutBas.setBackground(new java.awt.Color(255, 255, 255));
        panAjoutBas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        civiliteLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        civiliteLabel.setForeground(new java.awt.Color(0, 0, 255));
        civiliteLabel.setText("Civilité : ");

        matriculeLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        matriculeLabel.setForeground(new java.awt.Color(0, 0, 255));
        matriculeLabel.setText("Identifiant ");

        prenomField.setPreferredSize(new java.awt.Dimension(123, 26));

        identifiantField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        identifiantField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identifiantField.setToolTipText("");
        identifiantField.setEnabled(false);
        identifiantField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        identifiantField.setPreferredSize(new java.awt.Dimension(123, 26));
        identifiantField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identifiantFieldActionPerformed(evt);
            }
        });

        prenomLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prenomLabel.setForeground(new java.awt.Color(0, 0, 255));
        prenomLabel.setText("Prénom  ");

        try {
            telField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-##-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telField.setPreferredSize(new java.awt.Dimension(123, 26));

        nomLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nomLabel.setForeground(new java.awt.Color(0, 0, 255));
        nomLabel.setText("Nom  ");

        telLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        telLabel.setForeground(new java.awt.Color(0, 0, 255));
        telLabel.setText("Téléphone  ");

        dateLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 0, 255));
        dateLabel.setText("Date de naissance  ");

        nomField.setPreferredSize(new java.awt.Dimension(123, 26));

        civiliteCombo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        civiliteCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "Mme" }));
        civiliteCombo.setPreferredSize(new java.awt.Dimension(123, 26));
        civiliteCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                civiliteComboActionPerformed(evt);
            }
        });

        dateNaisPicker.setFormats("dd/MM/yyyy");
        dateNaisPicker.setPreferredSize(new java.awt.Dimension(123, 26));

        prenomLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prenomLabel1.setForeground(new java.awt.Color(0, 0, 255));
        prenomLabel1.setText("Adresse");

        adresseField.setPreferredSize(new java.awt.Dimension(123, 26));

        javax.swing.GroupLayout panAjoutBasLayout = new javax.swing.GroupLayout(panAjoutBas);
        panAjoutBas.setLayout(panAjoutBasLayout);
        panAjoutBasLayout.setHorizontalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telLabel)
                    .addComponent(dateLabel)
                    .addComponent(prenomLabel)
                    .addComponent(nomLabel)
                    .addComponent(matriculeLabel)
                    .addComponent(civiliteLabel)
                    .addComponent(prenomLabel1))
                .addGap(58, 58, 58)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(civiliteCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(identifiantField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(nomField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prenomField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateNaisPicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adresseField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panAjoutBasLayout.setVerticalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(civiliteLabel)
                    .addComponent(civiliteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matriculeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(identifiantField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLabel)
                    .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomLabel)
                    .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateNaisPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomLabel1)
                    .addComponent(adresseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telLabel))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        annulerBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        ajouterBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBoutonActionPerformed(evt);
            }
        });

        modifierBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        modifierBouton.setText("Modifier");

        javax.swing.GroupLayout panAjoutUsagerLayout = new javax.swing.GroupLayout(panAjoutUsager);
        panAjoutUsager.setLayout(panAjoutUsagerLayout);
        panAjoutUsagerLayout.setHorizontalGroup(
            panAjoutUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modifierBouton, javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(panAjoutBas, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panAjoutUsagerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(annulerBouton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ajouterBouton)
                .addGap(10, 10, 10))
        );
        panAjoutUsagerLayout.setVerticalGroup(
            panAjoutUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutUsagerLayout.createSequentialGroup()
                .addComponent(panAjoutBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panAjoutUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajouterBouton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panAjoutUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(annulerBouton)
                        .addComponent(modifierBouton))))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Gestion Des Usagers");

        retourButton.setText("Retour");
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panAjoutUsager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(retourButton)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panRecherch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panListeUsager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retourButton)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panRecherch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panListeUsager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panAjoutUsager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1178, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void identifiantFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identifiantFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identifiantFieldActionPerformed

    private void civiliteComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_civiliteComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_civiliteComboActionPerformed

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        clearField();
    }//GEN-LAST:event_annulerBoutonActionPerformed

    private void ajouterBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBoutonActionPerformed
        try {
            String nom = nomField.getText();
            String prenom = prenomField.getText();
            Date dateNais = dateNaisPicker.getDate();
            String sexe = civiliteCombo.getSelectedItem().toString().equals("M") ? "Masculin" : "féminin";
            String adresse = adresseField.getText();
            String tel = telField.getText().replace("-", "").trim();
            UsagerControl.ajouter(new Usager(nom, prenom, dateNais, sexe, adresse, tel));
            JOptionPane.showMessageDialog(null, "Usager ajouté avec succès", "Informations", JOptionPane.INFORMATION_MESSAGE);
            setIdentifiant();
            clearField();
            fillListeUsager("SELECT * FROM usager ORDER BY id DESC LIMIT 10", new Object[0]);

        } catch (BibalExceptions ex) {
            Logger.getLogger(GestionUsager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ajouterBoutonActionPerformed

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
        Menu m = new Menu();
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_retourButtonActionPerformed

    private void fillListeUsager(String sql, Object param[]) {
        Object data[][] = null;
        String titre[] = new String[]{"Identifiant", "Civilité", "Nom",
            "Prénom", "Date de naissance", "Téléphone", "Adresse"};
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(),
                    sql, param);
            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultMeta = resultSet.getMetaData();
            int nbreColumn = resultMeta.getColumnCount();

//            Pour récupérer le nombre total de ligne on se place sur la
//            dernière puis on revient avant la première pour parcourir
            resultSet.last();
            int nbreRow = resultSet.getRow();
            resultSet.beforeFirst();
            data = new Object[nbreRow][nbreColumn];

            int nbreLine = 0;
            while (resultSet.next()) {
                for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    data[nbreLine][i - 1] = resultSet.getObject(i);
                }
                nbreLine++;
            }
            ModelTableau model = new ModelTableau(data, titre);
            tableListeUsager.setModel(model);
            tableListeUsager.setRowHeight(30);
            
            System.out.println("IHM.GestionUsager.fillListeUsager()" + tableListeUsager.getModel().getRowCount());
//            if (nbreLine != 0) {
//                ModelTableau model = new ModelTableau(data, titre);
//                tableListeUsager.setModel(model);
//                tableListeUsager.setRowHeight(30);
//                System.out.println("IHM.GestionUsager.fillListeUsager()" + nbreLine);
//            } else {
//                //afficher tableau vide
//                data = new Object[1][titre.length];
//                ModelTableau model = new ModelTableau(data, titre);
//                tableListeUsager.setModel(model);
//                tableListeUsager.setRowHeight(1);
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (BibalExceptions e) {
            e.printStackTrace();
        }finally{
            closeStatementResultSet(preparedStatement, resultSet);
        }
    }

    private void clearField() {
        nomField.setText("");
        prenomField.setText("");
        adresseField.setText("");
        telField.setText("");
    }

    private void setIdentifiant() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            final String SQL_SELECT_ID = "SELECT id FROM usager ORDER BY id DESC LIMIT 1";
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
            java.util.logging.Logger.getLogger(GestionUsager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUsager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecherchBouton;
    private javax.swing.JComboBox RecherchCombo;
    private javax.swing.JFormattedTextField RecherchField;
    private javax.swing.JLabel RecherchParLabel;
    private javax.swing.JFormattedTextField adresseField;
    private javax.swing.JButton ajouterBouton;
    private javax.swing.JButton annulerBouton;
    private javax.swing.JComboBox civiliteCombo;
    private javax.swing.JLabel civiliteLabel;
    private javax.swing.JLabel dateLabel;
    private org.jdesktop.swingx.JXDatePicker dateNaisPicker;
    private javax.swing.JFormattedTextField identifiantField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel matriculeLabel;
    private javax.swing.JButton modifierBouton;
    private javax.swing.JFormattedTextField nomField;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JPanel panAjoutBas;
    private javax.swing.JPanel panAjoutUsager;
    private javax.swing.JPanel panListeUsager;
    private javax.swing.JPanel panRecherch;
    private javax.swing.JFormattedTextField prenomField;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JLabel prenomLabel1;
    private javax.swing.JButton retourButton;
    private javax.swing.ButtonGroup sexeBttonGroup;
    private javax.swing.JTable tableListeUsager;
    private javax.swing.JFormattedTextField telField;
    private javax.swing.JLabel telLabel;
    // End of variables declaration//GEN-END:variables
}
