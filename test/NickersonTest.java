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
public class NickersonTest {
    
    public NickersonTest() {
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
     * Test of main method, of class Nickerson.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        int[] args = null;
        Nickerson.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdade method, of class Nickerson.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        Nickerson instance = new Nickerson();
        int expResult = 0;
        instance.setIdade(0);
        int result = instance.getIdade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdade method, of class Nickerson.
     */
    @Test
    public void testSetIdade() {
        System.out.println("setIdade");
        int Idade = 0;
        Nickerson instance = new Nickerson();
        instance.setIdade(Idade);
    }
    
}
