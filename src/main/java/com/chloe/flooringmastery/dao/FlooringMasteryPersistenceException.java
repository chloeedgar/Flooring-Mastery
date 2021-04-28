/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chloe.flooringmastery.dao;

import java.io.FileNotFoundException;

/**
 *
 * @author User
 */
public class FlooringMasteryPersistenceException extends Exception {
    //This class inherits all of the capabilities of Exception and then can add in any special features
    //that need to be added.
    //In this case, we want our exception to act just like Exception 
    
    //Two Constructors
    public FlooringMasteryPersistenceException(String message) {
        //calls matching constructor on the Exception class by calling super, so base constructors do
        //all the work of initialising our object.
        super(message);
    }
    public FlooringMasteryPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
    

    
    
}
