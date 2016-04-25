/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regleAffaire;

import java.util.Date;
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
public class TempsTest {

    public TempsTest() {
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
    public void testFinTemps() {
        System.out.println("finTemps");
        Temps temps1 = new Temps();
        assertNotEquals(temps1, null);
    }

    @Test
    public void testCalculTempsTotal() {
        System.out.println("calculTempsTotal");
        Temps temps1 = new Temps();
        long tempsTotal = temps1.calculTempsTotal();
        assertTrue(tempsTotal >= 0);

    }

    @Test
    public void testTransformationEnMesure() {
        System.out.println("transformationEnMesure");
        Temps temps1 = new Temps();
        temps1.transformationEnMesure(10000);
        assertTrue(temps1.mesureTemps.getSecondes() >= 0);
        assertTrue(temps1.mesureTemps.getMinutes() >= 0);
        assertTrue(temps1.mesureTemps.getHeures() >= 0);
        assertTrue(temps1.mesureTemps.getJours() >= 0);

    }

    @Test
    public void testGetTempsDepart() {
        System.out.println("getTempsDepart");
        Temps temps1 = new Temps();
        assertTrue(temps1.getTempsDepart() != null);

    }

    @Test
    public void testSetTempsDepart() {
        System.out.println("setTempsDepart");
        Temps temps1 = new Temps();
        Date date = new Date();
        temps1.setTempsDepart(date);
        assertTrue(temps1.getTempsDepart() != null);
    }
}
