/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Diallo
 */
public class ModelTableau extends AbstractTableModel {

    private Object[][] data;
    private String[] title;

    //Constructeur
    public ModelTableau(Object[][] data, String[] title) {
        this.data = data;
        this.title = title;
    }

    @Override
    public int getColumnCount() {
        return this.title.length;
    }

    @Override
    public int getRowCount() {
        return this.data.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return this.data[row][col];
    }

    @Override
    public String getColumnName(int col) {
        return this.title[col];
    }
    //Retourne vrai si la cellule est éditable : celle-ci sera donc éditable

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public void removeRow(int row) {
        int nbLigne = 0;
        int nbCol = title.length;
        Object resultat[][] = new Object[data.length - 1][nbCol];
        for (int i = 0; i < data.length; i++) {
            if (i != row) {
                //copy de toutes les colonne de la ligne
                resultat[nbLigne++] = Arrays.copyOfRange(data[i], 0, nbCol);
            }
        }
        //nouvel table à afficher
        data = resultat;
        //Notifier la table
        fireTableRowsDeleted(row, row);
    }
//    Programmer ces methodes pour mettre à jour les jtable
//    public void addRow(String value)
//    {
//        fireTableRowsInserted(filters.size() - 1, filters.size() - 1);
//        int row = filters.size() -1 ;
//        int col = 1;
//        setValueAt(value, row, col);            
//    }
//    
//    public void updateRow(String value)
//    {
//        fireTableRowsInserted(filters.size() - 1, filters.size() - 1);
//        int row = filters.size() -1 ;
//        int col = 1;
//        setValueAt(value, row, col);            
//    }

}
