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
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testIngresarPositivo() throws Exception {
        System.out.println("ingresar");
        double x = 50.0;
        Cuenta instance = new Cuenta("1", "Jose");

        try {
            instance.ingresar(x);
           assertTrue(instance.getSaldo() == x);
        } catch (Exception e) {
            fail("No debería haber fallado");
        }

    }

    /**
     * Test of ingresar method, of class Cuenta.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testIngresarNegativo() throws Exception {
        System.out.println("ingresar");
        double x = -50;
        Cuenta instance = new Cuenta("2", "Luisa");

        try {
            instance.ingresar(x);
            assertTrue(instance.getSaldo() >= 0);
        } catch (Exception e) {
            fail("Debería fallar");
        }
    }

    /**
     * Test of retirar method, of class Cuenta.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double x = 1000.0;
        Cuenta instance = new Cuenta("3", "Julia");
        try {
            instance.retirar(x);
        } catch (Exception e) {
            fail("Debería fallar");
        }
        assertTrue(instance.getSaldo()==0.0);
    }
   
    @Test
    public void testRetirarDeMas() throws Exception {
        System.out.println("retirar");
        double x = 1000.0;
        Cuenta instance = new Cuenta("3", "Julia");
        instance.setSaldo(x-(double) 1);
        try {
            instance.retirar(x);
        } catch (Exception e) {
            fail("Debería fallar");
        }
        assertTrue(instance.getSaldo()==-1);
    }
    
    @Test
    public void testRetirarNoFail() throws Exception {
        System.out.println("retirar");
        double x = 1000.0;
        Cuenta instance = new Cuenta("3", "Julia");
        instance.setSaldo(x+(double) 1);
        try {
            instance.retirar(x);
        } catch (Exception e) {
            fail("No debería fallar");
        }
        assertTrue(instance.getSaldo()==1);
    }

    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cuenta instance = new Cuenta("6","Probando");
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setSaldo method, of class Cuenta.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double Saldo = 0.0;
        Cuenta instance = new Cuenta("7","Probando");
        instance.setSaldo(Saldo);
        
    }

}
