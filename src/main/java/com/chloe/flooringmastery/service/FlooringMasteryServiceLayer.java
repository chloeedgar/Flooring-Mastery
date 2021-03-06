/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chloe.flooringmastery.service;

import com.chloe.flooringmastery.dao.FlooringMasteryPersistenceException;
import com.chloe.flooringmastery.dto.Order;
import com.chloe.flooringmastery.dto.Product;
import com.chloe.flooringmastery.dto.Tax;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author User
 */
public interface FlooringMasteryServiceLayer {
    
    BigDecimal calculateMaterialCost(BigDecimal area,BigDecimal costPerSquareFoot);
    
    BigDecimal calculateLaborCost(BigDecimal area,BigDecimal laborCostPerSquareFoot);
    
    BigDecimal calculateTax(BigDecimal materialCost, BigDecimal laborCost,BigDecimal taxRate);
    
    BigDecimal calculateTotal(BigDecimal materialCost, BigDecimal laborCost, BigDecimal tax);
    
    String createOrderFileNameFromDate(LocalDate date);
    
    void checkOrderFileExists (String orderfileName)throws FlooringMasteryNoOrdersException;
    
    List <Order> getAllOrders (String fileWithDate) throws FlooringMasteryPersistenceException;
    
    List<Order> getOrderList (LocalDate wantedOrderDate) throws FlooringMasteryNoOrdersException, FlooringMasteryPersistenceException;
    
    LocalDate checkDateIsInFuture(LocalDate orderDate) throws FlooringMasteryDateErrorException;
    
    void validateCustomerName(String customerNameInput)throws FlooringMasteryCustomerNameErrorException;
    
    void checkStateAgainstTaxFile(String stateAbbreviationInput)throws FlooringMasteryPersistenceException, FlooringMasteryStateNotFoundException;
    
     List <Product> getAllProducts() throws FlooringMasteryPersistenceException;
    
     void checkProductTypeAgainstProductsFile (String productTypeInput) throws FlooringMasteryPersistenceException, FlooringMasteryProductTypeNotFoundException;
     
     void checkAreaOverMinOrder (BigDecimal areaInput) throws FlooringMasteryAreaBelowMinException;
     
     Product getProduct (String productType) throws FlooringMasteryPersistenceException;
     
     Tax getTax(String stateAbbreviationInput)throws FlooringMasteryPersistenceException;
     
     Order createNewOrderIfRequired (String verifyOrder, LocalDate orderDateInput, int orderNumber, String customerNameInput, String stateAbbreviationInput, BigDecimal taxRate, String productTypeInput,
                    BigDecimal areaInput, BigDecimal CostPerSquareFoot, BigDecimal laborCostPerSquareFoot, BigDecimal materialCost, BigDecimal laborCost, BigDecimal tax, BigDecimal total)
             throws FlooringMasteryPersistenceException ;
     
     int generateNewOrderNum()throws FlooringMasteryPersistenceException;
     
     //void addOrder(String orderFile, int orderNumber, Order order)throws FlooringMasteryPersistenceException;
     
     
     Order removeOrderIfConfirmed(String removeConfirmation, String orderFile, int orderNumber) throws FlooringMasteryPersistenceException, FlooringMasteryOrderFileNotExistException;
     
     int checkOrderNumExists(String orderFileName, int orderNumberInput) throws FlooringMasteryPersistenceException, FlooringMasteryNoOrderNumException;
     
     Order getOrder(String fileName, int orderNum) throws FlooringMasteryPersistenceException ;
     
      String checkForEdit (String updatedInfo);
      
      Order updateOrderCustomerNameIfRequired(String updatedCustomerName, Order orderToEdit);
      
      Order updateOrderStateIfRequired(String updatedState, Order orderToEdit);
      
      Order updateOrderProductTypeIfRequired(String updatedProductType, Order orderToEdit);
      
      Order updateOrderAreaIfRequired(BigDecimal updatedArea, Order orderToEdit);
      
      BigDecimal checkForEditBigDecimal (String updatedInfo);
      
      Order updateOrderCalculations(Order editedOrder) throws FlooringMasteryPersistenceException;
      
      Order editOrderIfConfirmed(String toBeEdited, String orderFile, Order updatedOrder) throws FlooringMasteryPersistenceException;
      
      String getCustomerNamePlaceHolder(String customerNameInput);
      
      void exportAllData() throws FlooringMasteryPersistenceException;
}


//    private int orderNumber;
//    private String customerNumber;
//    private String state;
//    private BigDecimal taxRate;
//    private String productType;
//    private BigDecimal area;
//    private BigDecimal costPerSquareFoot;
//    private BigDecimal laborCostPerSquareFoot;
//    private BigDecimal materialCost;
//    private BigDecimal laborCost;
//    private BigDecimal tax;
//    private BigDecimal total;
