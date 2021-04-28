/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chloe.flooringmastery.dao;

import com.chloe.flooringmastery.dto.Product;
import java.util.List;

/**
 *
 * @author User
 */
public interface FlooringMasteryProductDao {
    
    List<Product> getAllProducts()throws FlooringMasteryPersistenceException;
    
    Product getProduct (String productType) throws FlooringMasteryPersistenceException;
}
