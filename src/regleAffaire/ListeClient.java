/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regleAffaire;

import java.util.ArrayList;

/**
 *
 * @author Francis
 */
public class ListeClient {

    ArrayList<Client> listeClient;

    public ListeClient() {
        this.listeClient = new ArrayList<Client>();
    }

    public void ajouterClient(Client client) {

        listeClient.add(client);
    }

    public void supprimerClient(Client client) {

        for (int i = 0; i < listeClient.size(); i++) {

            if (listeClient.get(i).equals(client)) {
                listeClient.remove(listeClient.get(i));
            }
        }
    }

    public void modifierClient(Client client, String nom, String prenom, String telephone, String entreprise,
            String commentaire, String adresseCourriel) {

        client.setNom(nom);
        client.setPrenom(prenom);
        client.setTelephone(telephone);
        client.setEntreprise(entreprise);
        client.setCommentaire(commentaire);
        client.setAdresseCourriel(adresseCourriel);

    }
}
