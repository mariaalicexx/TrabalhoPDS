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
public class LucasTest {
    
    public LucasTest() {
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
     * Test of main method, of class Lucas.
     */
    @Test
    public void testMain() {
        System.out.println("");
        String[] args = null;
        Lucas.main(args);
    }

    /**
     * Test of getMateria method, of class Lucas.
     */
    @Test
    public void testGetMateria() {
        System.out.println("getMateria");
        Lucas instance = new Lucas();
        String expResult = "Lucas";
        instance.setMateria("Lucas");
        String result = instance.getMateria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMateria method, of class Lucas.
     */
    @Test
    public void testSetMateria() {
        System.out.println("setMateria");
        String Materia = "POO";
        Lucas instance = new Lucas();
        instance.setMateria(Materia);
    }
    
}
