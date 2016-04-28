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

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public AdresseCourriel getAdresseCourriel() {
        return adresseCourriel;
    }

    public ArrayList<Temps> getListeTemps() {
        return listeTemps;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setAdresseCourriel(AdresseCourriel adresseCourriel) {
        this.adresseCourriel = adresseCourriel;
    }

    public void setListeTemps(ArrayList<Temps> listeTemps) {
        this.listeTemps = listeTemps;
    }
    
    
    
}
