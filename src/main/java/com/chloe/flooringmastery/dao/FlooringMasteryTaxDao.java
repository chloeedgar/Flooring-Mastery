/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chloe.flooringmastery.dao;

import com.chloe.flooringmastery.dto.Tax;
import java.util.List;

/**
 *
 * @author User
 */
public interface FlooringMasteryTaxDao {
    List<Tax> getAllTaxes()throws FlooringMasteryPersistenceException;
    
    Tax getTax(String stateAbbreviationInput) throws FlooringMasteryPersistenceException;
}
