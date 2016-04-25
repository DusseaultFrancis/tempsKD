/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regleAffaire;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Francis
 */
public class Client {

    private String nom;
    private String prenom;
    private Telephone telephone;
    private String entreprise;
    private String commentaire;
    private AdresseCourriel adresseCourriel;
    ArrayList<Temps> listeTemps;

    public Client() {

        this.nom = null;
        this.prenom = null;
        this.telephone = null;
        this.entreprise = null;
        this.commentaire = null;
        this.adresseCourriel = null;
        this.listeTemps = new ArrayList<Temps>();
    }

    public Client(String nom, String prenom, Telephone telephone, String entreprise,
            String commentaire, AdresseCourriel adresseCourriel) {

        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.entreprise = entreprise;
        this.commentaire = commentaire;
        this.adresseCourriel = adresseCourriel;
        this.listeTemps = new ArrayList<Temps>();
    }

    public void ajouterTemps(Temps temps) {
        this.listeTemps.add(temps);
    }

    public void supprimerTemps(Temps temps) {

        for (int i = 0; i < listeTemps.size(); i++) {

            if (listeTemps.get(i).equals(temps)) {
                listeTemps.remove(listeTemps.get(i));
            }
        }
    }

}
