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
public class TitoTest {
    
    public TitoTest() {
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
     * Test of main method, of class Tito.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Tito.main(args);
    }

    /**
     * Test of getAulas method, of class Tito.
     */
    @Test
    public void testGetAulas() {
        System.out.println("getAulas");
        Tito instance = new Tito();
        String expResult = "";
        instance.setAulas("");
        String result = instance.getAulas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAulas method, of class Tito.
     */
    @Test
    public void testSetAulas() {
        System.out.println("setAulas");
        String Aulas = "";
        Tito instance = new Tito();
        instance.setAulas(Aulas);
    }
    
}
