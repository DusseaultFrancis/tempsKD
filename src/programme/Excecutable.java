package programme;

import interfaceGraphique.Identification;
import static json.Ecriture.creationObjetJson;
import regleAffaire.*;

public class Excecutable {

    public static void main(String[] args) throws Exception {
        
        Telephone tel = new Telephone();
        AdresseCourriel c = new AdresseCourriel();
        Temps temps = new Temps();
        for(int i = 0; i < 100000; i++);{}
        
        temps.finTemps();
        
        

        Client client = new Client("Dusseault","Francis",tel,"Services KD","La meilleur entreprise au monde!",c);
        
        client.ajouterTemps(temps);
        creationObjetJson(client, "sortie.json");
        
        //Identification programme = new Identification();
        //programme.setVisible(true);

    }

}
