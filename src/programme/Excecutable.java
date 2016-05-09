package programme;

import interfaceGraphique.Identification;
import static json.Ecriture.creationObjetJson;
import regleAffaire.AdresseCourriel;
import regleAffaire.Client;
import regleAffaire.Telephone;
import regleAffaire.Temps;

public class Excecutable {

    public static void main(String[] args) throws Exception {
        
        // TEST FICHIER ECRITURE
        /*
        Telephone tel = new Telephone();
        AdresseCourriel c = new AdresseCourriel();
        
        Temps temps = new Temps();
        temps.finTemps();
        
        Temps temps1 = new Temps();
        temps1.finTemps();

        Client client = new Client("Dusseault","Francis","tel1111","Services KD","La meilleur entreprise au monde!","courriel1111");
        
        client.ajouterTemps(temps);
        client.ajouterTemps(temps1);
        creationObjetJson(client, "sortie.json");
        */
        
        Identification programme = new Identification();
        programme.setVisible(true);
        


    }

}
