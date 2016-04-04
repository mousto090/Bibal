/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibalExceptions;

/**
 *
 * @author Jalloh
 */
public class BibalExceptions extends Exception{

    public BibalExceptions(String message) {
        super(message);
    }
    
    public BibalExceptions(Throwable cause) {
        super(cause);
    }
    
    public BibalExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
