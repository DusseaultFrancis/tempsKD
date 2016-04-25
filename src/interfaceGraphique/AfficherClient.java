package interfaceGraphique;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class AfficherClient extends JFrame {

    // Panneau du haut
    JPanel panneauMilieu;
    GridLayout gestionnairePanneauMilieu;
    JLabel nom;
    JTextField saisieNom;
    JLabel prenom;
    JTextField saisiePrenom;
    JLabel telephone;
    JTextField saisieTelephone;
    JLabel adresse;
    JTextField saisieAdresse;
    JLabel courriel;
    JTextField saisieCourriel;
    JLabel entreprise;
    JTextField saisieEntreprise;
    JLabel grpeFacturation;
    JComboBox<String> choixFacturation;

    // Panneau du bas
    JPanel panneauBas;
    JButton boutonFermer;
    FlowLayout gestionnairePanneauBas;

    public AfficherClient() {
        init();
    }

    public static void main(String[] args) {
        AfficherClient fenetreClient = new AfficherClient();
        fenetreClient.setVisible(true);

    }

    private void init() {

        // Création du panneau du haut
        panneauMilieu = new JPanel();
        panneauMilieu.setBorder(new TitledBorder(null,
                "Informations du client", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        gestionnairePanneauMilieu = new GridLayout(7, 2);
        gestionnairePanneauMilieu.setVgap(3);
        gestionnairePanneauMilieu.setHgap(3);
        panneauMilieu.setLayout(gestionnairePanneauMilieu);

        nom = new JLabel("Nom");
        saisieNom = new JTextField();
        panneauMilieu.add(nom);
        panneauMilieu.add(saisieNom);

        prenom = new JLabel("Prénom");
        saisiePrenom = new JTextField();
        panneauMilieu.add(prenom);
        panneauMilieu.add(saisiePrenom);

        entreprise = new JLabel("Entreprise");
        saisieEntreprise = new JTextField();
        panneauMilieu.add(entreprise);
        panneauMilieu.add(saisieEntreprise);

        telephone = new JLabel("Téléphone");
        saisieTelephone = new JTextField();
        panneauMilieu.add(telephone);
        panneauMilieu.add(saisieTelephone);

        adresse = new JLabel("Adresse");
        saisieAdresse = new JTextField();
        panneauMilieu.add(adresse);
        panneauMilieu.add(saisieAdresse);

        courriel = new JLabel("Courriel");
        saisieCourriel = new JTextField();
        panneauMilieu.add(courriel);
        panneauMilieu.add(saisieCourriel);

        grpeFacturation = new JLabel("Groupe de Facturation");
        choixFacturation = new JComboBox<String>();
        choixFacturation.addItem("Hebdomadaire");
        choixFacturation.addItem("Mensuel");
        choixFacturation.addItem("Annuel");
        choixFacturation.setEditable(false);
        choixFacturation.setEnabled(false);
        panneauMilieu.add(grpeFacturation);
        panneauMilieu.add(choixFacturation);

        // Création du panneau du bas
        panneauBas = new JPanel();
        gestionnairePanneauBas = new FlowLayout(FlowLayout.RIGHT);
        panneauBas.setLayout(gestionnairePanneauBas);

        boutonFermer = new JButton("Fermer");

        panneauBas.add(boutonFermer);

        // Personnalisation du cadre central
        setTitle("Création d'un client");
        // Définir la taille de la fenêtre et
        // son positionnement sur lécran.
        setBounds(400, 300, 500, 330);

        //add(panneauHaut, BorderLayout.NORTH);
        add(panneauMilieu, BorderLayout.CENTER);
        add(panneauBas, BorderLayout.SOUTH);

        //Non resize
        setResizable(false);
        
        saisieNom.setEditable(false);
        saisiePrenom.setEditable(false);
        saisieTelephone.setEditable(false);
        saisieAdresse.setEditable(false);
        saisieCourriel.setEditable(false);
        saisieEntreprise.setEditable(false);

        // Définir le type de fermetire
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}