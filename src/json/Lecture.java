/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import regleAffaire.Client;
import regleAffaire.ListeClient;
import regleAffaire.Temps;

/**
 *
 * @author Francis
 */
public class Lecture {

    public static Client creationObjet(String entree) throws Exception {

        String json = FileReader.loadFileIntoString(entree, "utf-8");
        String client = null;
        JSONObject objetJson = (JSONObject) JSONSerializer.toJSON(json);

        JSONArray arrayJson = JSONArray.fromObject(client);

        Client listeclient = new Client(obtenirNom(objetJson), obtenirPrenom(objetJson),
                obtenirEntreprise(objetJson), obtenirTelephone(objetJson), obtenirAdresse(objetJson), obtenirCourriel(objetJson));

        return listeclient;
    }

    static String obtenirNom(JSONObject json) {

        String nom = "";

        nom = json.getString("Nom");

        return nom;

    }

    static String obtenirPrenom(JSONObject json) {

        String nom = "";

        nom = json.getString("Prenom");

        return nom;

    }

    static String obtenirEntreprise(JSONObject json) {

        String nom = "";

        nom = json.getString("Entreprise");

        return nom;

    }

    static String obtenirTelephone(JSONObject json) {

        String nom = "";

        nom = json.getString("Telephone");

        return nom;

    }

    static String obtenirAdresse(JSONObject json) {

        String nom = "";

        nom = json.getString("Adresse");

        return nom;

    }

    static String obtenirCourriel(JSONObject json) {

        String nom = "";

        nom = json.getString("Courriel");

        return nom;

    }
}
