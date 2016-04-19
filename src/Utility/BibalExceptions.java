/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import javax.swing.JOptionPane;

/**
 *
 * @author Jalloh
 */
public class BibalExceptions extends Exception{

    public BibalExceptions(String message) {
        super(message);
        JOptionPane.showMessageDialog(null, message, "Informations", JOptionPane.PLAIN_MESSAGE);
    }
    
    public BibalExceptions(Throwable cause) {
        super(cause);
    }
    
    public BibalExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
