/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.Iterator;
import net.sf.json.JSONObject;
import regleAffaire.Client;
import regleAffaire.Temps;

/**
 *
 * @author Francis
 */
public class Ecriture {

    public static void creationObjetJson(Client client, String sortie) throws Exception {
        JSONObject json = new JSONObject();
        json = creationJson(client, json);
        ecritureObjet(sortie, json);
    }

    private static JSONObject creationJson(Client client, JSONObject json) {
        json = accumulerClient(client, json);
        json = accumulerTemps(client, json);
        return json;
    }

    private static JSONObject accumulerClient(Client client, JSONObject json) {
        json.accumulate("Nom", client.getNom());
        json.accumulate("Prenom", client.getPrenom());
        json.accumulate("Telephone", client.getTelephone());
        json.accumulate("Entreprise", client.getEntreprise());
        json.accumulate("Commentaire", client.getCommentaire());
        json.accumulate("Courriel;", client.getAdresseCourriel());
        return json;
    }

    private static JSONObject accumulerTemps(Client client, JSONObject json) {
        Iterator<Temps> it = client.getListeTemps().iterator();
        ArrayList<Temps> lot = new ArrayList<Temps>();
        while (it.hasNext()) {
            Temps tempsCourrant = it.next();
            lot.add(tempsCourrant);
        }
        json.accumulate("Temps", lot);
        return json;
    }

    private static void ecritureObjet(String sortie, JSONObject json) {
        try {
            File nouvelObjet = nouvelObjet(sortie);
            FileWriter nouvelObjetEcriture = new FileWriter(nouvelObjet);
            nouvelObjetEcriture.write(json.toString(3) + "\n");
            nouvelObjetEcriture.close();
        } catch (Exception e) {
        }
    }

    private static File nouvelObjet(String sortie) {
        File nouvelObjet = new File(sortie);
        try {
            nouvelObjet.createNewFile();
        } catch (Exception e) {
        }
        return nouvelObjet;
    }
}
