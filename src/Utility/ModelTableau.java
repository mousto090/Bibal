/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

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

}
