/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chloe.flooringmastery;

import com.chloe.flooringmastery.controller.FlooringMasteryController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
//    UserIO io = new UserIOConsoleImpl();
//    FlooringMasteryView view = new FlooringMasteryView(io);
//    FlooringMasteryDao dao = new FlooringMasteryDaoFileImpl();
//    FlooringMasteryServiceLayer service = new FlooringMasteryServiceLayerImpl(dao);
//    
//    FlooringMasteryController controller = new FlooringMasteryController(view, service);
//    
//    controller.run();

// above configuration is hard-coded in the app class. If we wanted to change anything, we have to
// modify the App class and recompile. The Spring framework allows us to externalize this configuration into
// XML files or use annotations to define our DI.
    
    ApplicationContext ctx = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
    FlooringMasteryController controller = 
            ctx.getBean("controller", FlooringMasteryController.class);
    controller.run();
    }
    
   
    
}
