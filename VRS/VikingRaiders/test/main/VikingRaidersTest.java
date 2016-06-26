/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sondre
 */
public class VikingRaidersTest {
    
    public VikingRaidersTest() {
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
     * Test of main method, of class VikingRaiders.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        VikingRaiders.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyFarmer method, of class VikingRaiders.
     */
    @Test
    public void testBuyFarmer() {
        System.out.println("buyFarmer");
        VikingRaiders.buyFarmer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buySmiths method, of class VikingRaiders.
     */
    @Test
    public void testBuySmiths() {
        System.out.println("buySmiths");
        VikingRaiders.buySmiths();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHappiness method, of class VikingRaiders.
     */
    @Test
    public void testGetHappiness() {
        System.out.println("getHappiness");
        int expResult = 0;
        int result = VikingRaiders.getHappiness();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHappiness method, of class VikingRaiders.
     */
    @Test
    public void testSetHappiness() {
        System.out.println("setHappiness");
        int i = 0;
        VikingRaiders.setHappiness(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarmhouses method, of class VikingRaiders.
     */
    @Test
    public void testGetFarmhouses() {
        System.out.println("getFarmhouses");
        int expResult = 0;
        int result = VikingRaiders.getFarmhouses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFarmhouses method, of class VikingRaiders.
     */
    @Test
    public void testAddFarmhouses() {
        System.out.println("addFarmhouses");
        String s = "";
        VikingRaiders.addFarmhouses(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBank method, of class VikingRaiders.
     */
    @Test
    public void testGetBank() {
        System.out.println("getBank");
        int expResult = 0;
        int result = VikingRaiders.getBank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBank method, of class VikingRaiders.
     */
    @Test
    public void testSetBank() {
        System.out.println("setBank");
        int i = 0;
        VikingRaiders.setBank(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIncomeTick method, of class VikingRaiders.
     */
    @Test
    public void testGetIncomeTick() {
        System.out.println("getIncomeTick");
        int expResult = 0;
        int result = VikingRaiders.getIncomeTick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIncomeTick method, of class VikingRaiders.
     */
    @Test
    public void testSetIncomeTick() {
        System.out.println("setIncomeTick");
        int i = 0;
        VikingRaiders.setIncomeTick(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarmers method, of class VikingRaiders.
     */
    @Test
    public void testGetFarmers() {
        System.out.println("getFarmers");
        int expResult = 0;
        int result = VikingRaiders.getFarmers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSmiths method, of class VikingRaiders.
     */
    @Test
    public void testGetSmiths() {
        System.out.println("getSmiths");
        int expResult = 0;
        int result = VikingRaiders.getSmiths();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
