/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejandro Reyes
 */
public class PersonaTest {
    
    /**
     *
     */
    public PersonaTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Persona.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         // fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Persona.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Persona instance = new Persona();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
         // fail("The test case is a prototype.");
    }

    /**
     * Test of getDNI method, of class Persona.
     */
    @Test
    public void testGetDNI() {
        System.out.println("getDNI");
        Persona instance = new Persona();
        String expResult = instance.getDNI();
        String result = instance.getDNI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of setDNI method, of class Persona.
     */
    @Test
    public void testSetDNI() {
        System.out.println("setDNI");
        String DNI = "";
        Persona instance = new Persona();
        instance.setDNI(DNI);
        // TODO review the generated test code and remove the default call to fail.
         // fail("The test case is a prototype.");
    }

    /**
     * Test of getNombres method, of class Persona.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Persona instance = new Persona();
        String expResult = instance.getNombres();
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         // fail("The test case is a prototype.");
    }

    /**
     * Test of setNombres method, of class Persona.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Persona instance = new Persona();
        instance.setNombres(nombres);
        // TODO review the generated test code and remove the default call to fail.
         // fail("The test case is a prototype.");
    }
    
}
