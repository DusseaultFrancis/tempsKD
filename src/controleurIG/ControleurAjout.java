package controleurIG;

import interfaceGraphique.AjoutClient;
import interfaceGraphique.FenetrePrincipale;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static json.Ecriture.creationObjetJson;
import json.Lecture;
import static json.Lecture.creationObjet;
import regleAffaire.Client;
import regleAffaire.ListeClient;

public class ControleurAjout implements ActionListener {

    private ListeClient modele;
    private AjoutClient ajout;

    List<Client> listeClient = new ArrayList<Client>();

    // Constructeur pour FenetreAjout
    public ControleurAjout(AjoutClient fenetreAjout) {
        this.modele = new ListeClient();
        ajout = fenetreAjout;

    }

    // return modele
    public ListeClient getModele() {
        return modele;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        // Obtenir la source de l'évenement
        Object source = event.getSource();

        if (source == ajout.getBoutonSauvegarder()) {

            String nom = ajout.getSaisieNom().getText();
            String prenom = ajout.getSaisiePrenom().getText();
            String entreprise = ajout.getSaisieEntreprise().getText();
            String telephone = ajout.getSaisieTelephone().getText();
            String adresse = ajout.getSaisieAdresse().getText();
            String courriel = ajout.getSaisieCourriel().getText();

            Client client = new Client(nom, prenom, entreprise, telephone, adresse, courriel);

            // modele.ajouterClient(client);
            // Lire le fichier, le mettre dans une listeClient. Ensuite,
            // ajouter le client a la liste et ecrire dans le fichier.
            try {
                creationObjetJson(client, "Liste des clients.json");
            } catch (Exception ex) {
                Logger.getLogger(ControleurAjout.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                //  LECTURE DANS LE FICHIER ET ON AFFICHE TOUTES LES CLIENTS
                ListeClient listeClientLecture = new ListeClient();
                listeClientLecture = Lecture.creationObjet("Liste des clients.json");
                DefaultTableModel model = new DefaultTableModel();
                model = FenetrePrincipale.display(listeClientLecture);
                FenetrePrincipale.tableau.setModel(model);

                FenetrePrincipale.tableau.setVisible(true);
                FenetrePrincipale.scrollPane.setVisible(true);

            } catch (Exception ex) {
                Logger.getLogger(ControleurAjout.class.getName()).log(Level.SEVERE, null, ex);
            }

            ajout.dispose();

        } else if (source == ajout.getBoutonFermer()) {

            ajout.dispose();

        }

    }

}
