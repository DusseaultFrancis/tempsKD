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

public class TempsMesureTest {

    public TempsMesureTest() {
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

    @Test
    public void testGetSecondes() {

        System.out.println("getSecondes");
        TempsMesure temps1 = new TempsMesure(1, 1, 1, 1);

        assertTrue(temps1.getSecondes() == 1);
        assertFalse(temps1.getSecondes() == 0);

        TempsMesure temps2 = new TempsMesure(100000, 1, 1, 1);

        assertTrue(temps2.getSecondes() == 100000);
        assertFalse(temps2.getSecondes() == 1);

        TempsMesure temps3 = new TempsMesure(-5, 1, 1, 1);

        assertTrue(temps3.getSecondes() == -5);
        assertFalse(temps3.getSecondes() == 5);
    }

    @Test
    public void testGetMinutes() {

        System.out.println("getMinutes");
        TempsMesure temps1 = new TempsMesure(1, 1, 1, 1);

        assertTrue(temps1.getMinutes() == 1);
        assertFalse(temps1.getMinutes() == 0);

        TempsMesure temps2 = new TempsMesure(1, 100000, 1, 1);

        assertTrue(temps2.getMinutes() == 100000);
        assertFalse(temps2.getMinutes() == 1);

        TempsMesure temps3 = new TempsMesure(1, -5, 1, 1);

        assertTrue(temps3.getMinutes() == -5);
        assertFalse(temps3.getMinutes() == 5);
    }

    @Test
    public void testGetHeures() {

        TempsMesure temps1 = new TempsMesure(1, 1, 1, 1);

        assertTrue(temps1.getHeures() == 1);
        assertFalse(temps1.getHeures() == 0);

        TempsMesure temps2 = new TempsMesure(1, 1, 100000, 1);

        assertTrue(temps2.getHeures() == 100000);
        assertFalse(temps2.getHeures() == 1);

        TempsMesure temps3 = new TempsMesure(1, 1, -5, 1);

        assertTrue(temps3.getHeures() == -5);
        assertFalse(temps3.getHeures() == 5);
    }

    @Test
    public void testGetJours() {

        TempsMesure temps1 = new TempsMesure(1, 1, 1, 1);

        assertTrue(temps1.getJours() == 1);
        assertFalse(temps1.getJours() == 0);

        TempsMesure temps2 = new TempsMesure(1, 1, 100000, 100000);

        assertTrue(temps2.getJours() == 100000);
        assertFalse(temps2.getJours() == 1);

        TempsMesure temps3 = new TempsMesure(1, 1, 1, -5);

        assertTrue(temps3.getJours() == -5);
        assertFalse(temps3.getJours() == 5);
    }

    @Test
    public void testSetSecondes() {
        System.out.println("setSecondes");
        TempsMesure temps1 = new TempsMesure(1, 1, 1, 1);
        temps1.setSecondes(100);
        assertTrue(temps1.getSecondes() == 100);
        temps1.setSecondes(10000);
        assertTrue(temps1.getSecondes() == 10000);
    }

    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        TempsMesure temps1 = new TempsMesure(1, 1, 1, 1);
        temps1.setMinutes(100);
        assertTrue(temps1.getMinutes() == 100);
        temps1.setMinutes(10000);
        assertTrue(temps1.getMinutes() == 10000);
    }

    @Test
    public void testSetHeures() {
        System.out.println("setHeures");
        TempsMesure temps1 = new TempsMesure(1, 1, 1, 1);
        temps1.setHeures(100);
        assertTrue(temps1.getHeures() == 100);
        temps1.setHeures(10000);
        assertTrue(temps1.getHeures() == 10000);
    }

    @Test
    public void testSetJours() {
        System.out.println("setJours");
        TempsMesure temps1 = new TempsMesure(1, 1, 1, 1);
        temps1.setJours(100);
        assertTrue(temps1.getJours() == 100);
        temps1.setJours(10000);
        assertTrue(temps1.getJours() == 10000);
    }

}
