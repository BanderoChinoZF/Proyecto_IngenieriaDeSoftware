/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delete;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DaleDonDale
 */
public class SeguroDeleteTest {
    
    public SeguroDeleteTest() {
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
     * Test of mostrarDatos method, of class SeguroDelete.
     * @throws java.lang.Exception
     */
    @Test
    public void testMostrarDatos() throws Exception {
        System.out.println("mostrarDatos");
        String valor = "";
        SeguroDelete instance = new SeguroDelete();
        instance.mostrarDatos(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class SeguroDelete.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        String s = "";
        SeguroDelete instance = new SeguroDelete();
        instance.Eliminar(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SeguroDelete.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SeguroDelete.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
