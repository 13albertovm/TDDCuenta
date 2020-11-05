/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author injun
 */
public class CuentaTest {
    
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ingresar method, of class Cuenta.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double x = 0.0;
        Cuenta instance = null;
        instance.ingresar(x);
        
    }

    /**
     * Test of retirar method, of class Cuenta.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double x = 0.0;
        Cuenta instance = null;
        instance.retirar(x);
        
    }

    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cuenta instance = null;
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class Cuenta.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double Saldo = 0.0;
        Cuenta instance = null;
        instance.setSaldo(Saldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
