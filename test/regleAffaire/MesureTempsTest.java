/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regleAffaire;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Francis
 */
public class MesureTempsTest {
    
    public MesureTempsTest() {
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
     * Test of getSecondes method, of class MesureTemps.
     */
    @Test
    public void testGetSecondes(){
        
        System.out.println("getSecondes");
        MesureTemps temps1 = new MesureTemps(1,1,1,1);
        
        assertTrue(temps1.getSecondes()==1);
        assertFalse(temps1.getSecondes()==0);
        
        MesureTemps temps2 = new MesureTemps(100000,1,1,1);
        
        assertTrue(temps2.getSecondes()==100000);
        assertFalse(temps2.getSecondes()==1);
        
        MesureTemps temps3 = new MesureTemps(-5,1,1,1);
        
        assertTrue(temps3.getSecondes()==-5);
        assertFalse(temps3.getSecondes()==5);
    }

    /**
     * Test of getMinutes method, of class MesureTemps.
     */
    @Test
    public void testGetMinutes() {
        
        System.out.println("getMinutes");
        MesureTemps temps1 = new MesureTemps(1,1,1,1);
        
        assertTrue(temps1.getMinutes()==1);
        assertFalse(temps1.getMinutes()==0);
        
        MesureTemps temps2 = new MesureTemps(1,100000,1,1);
        
        assertTrue(temps2.getMinutes()==100000);
        assertFalse(temps2.getMinutes()==1);
        
        MesureTemps temps3 = new MesureTemps(1,-5,1,1);
        
        assertTrue(temps3.getMinutes()==-5);
        assertFalse(temps3.getMinutes()==5);
    }

    /**
     * Test of getHeures method, of class MesureTemps.
     */
    @Test
    public void testGetHeures() {
        
        MesureTemps temps1 = new MesureTemps(1,1,1,1);
        
        assertTrue(temps1.getHeures()==1);
        assertFalse(temps1.getHeures()==0);
        
        MesureTemps temps2 = new MesureTemps(1,1,100000,1);
        
        assertTrue(temps2.getHeures()==100000);
        assertFalse(temps2.getHeures()==1);
        
        MesureTemps temps3 = new MesureTemps(1,1,-5,1);
        
        assertTrue(temps3.getHeures()==-5);
        assertFalse(temps3.getHeures()==5);
    }

    /**
     * Test of getJours method, of class MesureTemps.
     */
    @Test
    public void testGetJours() {
        
        MesureTemps temps1 = new MesureTemps(1,1,1,1);
        
        assertTrue(temps1.getJours()==1);
        assertFalse(temps1.getJours()==0);
        
        MesureTemps temps2 = new MesureTemps(1,1,100000,100000);
        
        assertTrue(temps2.getJours()==100000);
        assertFalse(temps2.getJours()==1);
        
        MesureTemps temps3 = new MesureTemps(1,1,1,-5);
        
        assertTrue(temps3.getJours()==-5);
        assertFalse(temps3.getJours()==5);
    }

    /**
     * Test of setSecondes method, of class MesureTemps.
     */
    @Test
    public void testSetSecondes() {
        System.out.println("setSecondes");
        double secondes = 0.0;
        MesureTemps instance = new MesureTemps();
        instance.setSecondes(secondes);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMinutes method, of class MesureTemps.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        double minutes = 0.0;
        MesureTemps instance = new MesureTemps();
        instance.setMinutes(minutes);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setHeures method, of class MesureTemps.
     */
    @Test
    public void testSetHeures() {
        System.out.println("setHeures");
        double heures = 0.0;
        MesureTemps instance = new MesureTemps();
        instance.setHeures(heures);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setJours method, of class MesureTemps.
     */
    @Test
    public void testSetJours() {
        System.out.println("setJours");
        double jours = 0.0;
        MesureTemps instance = new MesureTemps();
        instance.setJours(jours);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
