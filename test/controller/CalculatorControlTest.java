/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author k1317131
 */
public class CalculatorControlTest {
    
    public CalculatorControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class CalculatorControl.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent event = null;
        CalculatorControl instance = new CalculatorControl();
        instance.actionPerformed(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateCholPoints method, of class CalculatorControl.
     */
    @Test
    public void testCalculateCholPoints() {
        System.out.println("calculateCholPoints");
        boolean gender = false;
        int age = 0;
        double totalCholesterol = 0.0;
        double hdlCholesterol = 0.0;
        double bloodPressure = 0.0;
        boolean diabetes = false;
        boolean smoker = false;
        CalculatorControl instance = new CalculatorControl();
        int expResult = 0;
        int result = instance.calculateCholPoints(gender, age, totalCholesterol, hdlCholesterol, bloodPressure, diabetes, smoker);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateCHDRisk method, of class CalculatorControl.
     */
    @Test
    public void testCalculateCHDRisk() {
        System.out.println("calculateCHDRisk");
        boolean gender = false;
        int cholPoints = 0;
        CalculatorControl instance = new CalculatorControl();
        String expResult = "";
        String result = instance.calculateCHDRisk(gender, cholPoints);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
