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
public class ClientTest {

    public ClientTest() {
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
     * Test of ajouterTemps method, of class Client.
     */
    @Test
    public void testAjouterTemps() {
        System.out.println("ajouterTemps");

        Client client1 = new Client();
        Temps temps1 = new Temps();

        client1.ajouterTemps(temps1);

        assertEquals(client1.listeTemps.size(), 1);

        client1.ajouterTemps(temps1);
        client1.ajouterTemps(temps1);
        client1.ajouterTemps(temps1);
        client1.ajouterTemps(temps1);

        assertEquals(client1.listeTemps.size(), 5);

    }

    /**
     * Test of supprimerTemps method, of class Client.
     */
    @Test
    public void testSupprimerTemps() {
        System.out.println("supprimerTemps");

        Client client1 = new Client();
        Temps temps1 = new Temps();
        Temps temps2 = new Temps();
        Temps temps3 = new Temps();
        Temps temps4 = new Temps();
        Temps temps5 = new Temps();

        client1.ajouterTemps(temps1);

        assertEquals(client1.listeTemps.size(), 1);

        client1.ajouterTemps(temps2);
        client1.ajouterTemps(temps3);
        client1.ajouterTemps(temps4);
        client1.ajouterTemps(temps5);

        assertEquals(client1.listeTemps.size(), 5);

        client1.supprimerTemps(temps1);

        assertEquals(client1.listeTemps.size(), 4);

        client1.supprimerTemps(temps1);

        assertEquals(client1.listeTemps.size(), 4);

        client1.supprimerTemps(temps1);

        assertEquals(client1.listeTemps.size(), 4);

        client1.supprimerTemps(temps2);

        assertEquals(client1.listeTemps.size(), 3);

        client1.ajouterTemps(temps2);
        client1.ajouterTemps(temps3);
        client1.ajouterTemps(temps4);
        client1.ajouterTemps(temps5);

        assertEquals(client1.listeTemps.size(), 7);

        client1.supprimerTemps(temps5);

        assertEquals(client1.listeTemps.size(), 5);

    }

}
