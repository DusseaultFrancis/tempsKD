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
public class AjoutClient extends JFrame {

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
    JButton boutonSauvegarder;
    JButton boutonFermer;
    FlowLayout gestionnairePanneauBas;

    public AjoutClient() {
        init();
    }

    public static void main(String[] args) {
        AjoutClient fenetreClient = new AjoutClient();
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
        panneauMilieu.add(grpeFacturation);
        panneauMilieu.add(choixFacturation);

        // Création du panneau du bas
        panneauBas = new JPanel();
        gestionnairePanneauBas = new FlowLayout(FlowLayout.RIGHT);
        panneauBas.setLayout(gestionnairePanneauBas);

        boutonSauvegarder = new JButton("Ajouter");
        boutonFermer = new JButton("Fermer");

        panneauBas.add(boutonSauvegarder);
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

        // Définir le type de fermetire
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public JPanel getPanneauMilieu() {
        return panneauMilieu;
    }

    public GridLayout getGestionnairePanneauMilieu() {
        return gestionnairePanneauMilieu;
    }

    public JLabel getNom() {
        return nom;
    }

    public JTextField getSaisieNom() {
        return saisieNom;
    }

    public JLabel getPrenom() {
        return prenom;
    }

    public JTextField getSaisiePrenom() {
        return saisiePrenom;
    }

    public JLabel getTelephone() {
        return telephone;
    }

    public JTextField getSaisieTelephone() {
        return saisieTelephone;
    }

    public JLabel getAdresse() {
        return adresse;
    }

    public JTextField getSaisieAdresse() {
        return saisieAdresse;
    }

    public JLabel getCourriel() {
        return courriel;
    }

    public JTextField getSaisieCourriel() {
        return saisieCourriel;
    }

    public JLabel getEntreprise() {
        return entreprise;
    }

    public JTextField getSaisieEntreprise() {
        return saisieEntreprise;
    }

    public JLabel getGrpeFacturation() {
        return grpeFacturation;
    }

    public JComboBox<String> getChoixFacturation() {
        return choixFacturation;
    }

    public JPanel getPanneauBas() {
        return panneauBas;
    }

    public JButton getBoutonSauvegarder() {
        return boutonSauvegarder;
    }

    public JButton getBoutonFermer() {
        return boutonFermer;
    }

    public FlowLayout getGestionnairePanneauBas() {
        return gestionnairePanneauBas;
    }

    public void setPanneauMilieu(JPanel panneauMilieu) {
        this.panneauMilieu = panneauMilieu;
    }

    public void setGestionnairePanneauMilieu(GridLayout gestionnairePanneauMilieu) {
        this.gestionnairePanneauMilieu = gestionnairePanneauMilieu;
    }

    public void setNom(JLabel nom) {
        this.nom = nom;
    }

    public void setSaisieNom(JTextField saisieNom) {
        this.saisieNom = saisieNom;
    }

    public void setPrenom(JLabel prenom) {
        this.prenom = prenom;
    }

    public void setSaisiePrenom(JTextField saisiePrenom) {
        this.saisiePrenom = saisiePrenom;
    }

    public void setTelephone(JLabel telephone) {
        this.telephone = telephone;
    }

    public void setSaisieTelephone(JTextField saisieTelephone) {
        this.saisieTelephone = saisieTelephone;
    }

    public void setAdresse(JLabel adresse) {
        this.adresse = adresse;
    }

    public void setSaisieAdresse(JTextField saisieAdresse) {
        this.saisieAdresse = saisieAdresse;
    }

    public void setCourriel(JLabel courriel) {
        this.courriel = courriel;
    }

    public void setSaisieCourriel(JTextField saisieCourriel) {
        this.saisieCourriel = saisieCourriel;
    }

    public void setEntreprise(JLabel entreprise) {
        this.entreprise = entreprise;
    }

    public void setSaisieEntreprise(JTextField saisieEntreprise) {
        this.saisieEntreprise = saisieEntreprise;
    }

    public void setGrpeFacturation(JLabel grpeFacturation) {
        this.grpeFacturation = grpeFacturation;
    }

    public void setChoixFacturation(JComboBox<String> choixFacturation) {
        this.choixFacturation = choixFacturation;
    }

    public void setPanneauBas(JPanel panneauBas) {
        this.panneauBas = panneauBas;
    }

    public void setBoutonSauvegarder(JButton boutonSauvegarder) {
        this.boutonSauvegarder = boutonSauvegarder;
    }

    public void setBoutonFermer(JButton boutonFermer) {
        this.boutonFermer = boutonFermer;
    }

    public void setGestionnairePanneauBas(FlowLayout gestionnairePanneauBas) {
        this.gestionnairePanneauBas = gestionnairePanneauBas;
    }
    
}
