/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
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
public class listarDAOTest {

    /**
     *
     */
    public listarDAOTest() {
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
     * Test of listar method, of class listarDAO.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        listarDAO instance = new listarDAO();
        List expResult = instance.listar();;
        List result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class listarDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String DNI = "";
        String nombres = "";
        listarDAO instance = new listarDAO();
        instance.insert(DNI, nombres);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class listarDAO.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        int Id = 0;
        String dni = "";
        String nombr = "";
        listarDAO instance = new listarDAO();
        instance.Editar(Id, dni, nombr);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPerson method, of class listarDAO.
     */
    @Test
    public void testEliminarPerson() {
        System.out.println("eliminarPerson");
        int id = 0;
        listarDAO instance = new listarDAO();
        instance.eliminarPerson(id);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
