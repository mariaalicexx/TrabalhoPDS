/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Herlmanoel
 */
public class RenanTest {
    
    public RenanTest() {
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
     * Test of main method, of class Renan.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Renan.main(args);
    }

    /**
     * Test of getEndereço method, of class Renan.
     */
    @Test
    public void testGetEndereço() {
        System.out.println("getEndere\u00e7o");
        Renan instance = new Renan();
        String expResult = "";
        instance.setMateria("");
        String result = instance.getEndereço();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMateria method, of class Renan.
     */
    @Test
    public void testSetMateria() {
        System.out.println("setMateria");
        String Endereço = "";
        Renan instance = new Renan();
        instance.setMateria(Endereço);
    }
    
}
