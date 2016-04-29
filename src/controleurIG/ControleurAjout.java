package controleurIG;

import interfaceGraphique.AjoutClient;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static json.Ecriture.creationObjetJson;
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
	public ListeClient getModele(){
		return modele;
	}

	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		// Obtenir la source de l'évenement
		Object source = event.getSource();
		
		
		if(source == ajout.getBoutonSauvegarder()){ 
			
			String nom = ajout.getNom().getText();
			String prenom = ajout.getPrenom().getText();
			String entreprise = ajout.getEntreprise().getText();
			String telephone = ajout.getTelephone().getText();
			String adresse = ajout.getAdresse().getText();
                        String courriel = ajout.getCourriel().getText();

			Client client = new Client(nom,prenom,entreprise,telephone,adresse,courriel);
                        
			modele.ajouterClient(client);
                        
			ajout.dispose();
                        
                        
                        // Lire le fichier, le mettre dans une listeClient. Ensuite, 
                        // ajouter le client a la liste et ecrire dans le fichier.
                        
                        
                        
                    try {
                        creationObjetJson(client, "Liste des clients.json");
                    } catch (Exception ex) {
                        Logger.getLogger(ControleurAjout.class.getName()).log(Level.SEVERE, null, ex);
                    }
			

		}else if (source==ajout.getBoutonFermer()){  
			
			ajout.dispose();

		}
	}
	

}
		
	