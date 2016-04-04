/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BibalExceptions.DAOExceptions;

/**
 *
 * @author Jalloh
 */
public interface DAOInterfaces {
    
    public interface ReservationInterface {
        public void inserer(int idUsager, int idOeuvre, String dateRes) throws DAOExceptions;
    }
    
}
