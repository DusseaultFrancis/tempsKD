package interfaceGraphique;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Livre Pour Tous (LPT).
 *
 * Universit� du Qu�bec � Montr�al
 *
 * INF2120 - Programmation II
 *
 * @author Francis Dusseault
 * @version avril 2015 Modifi� en avril 2015
 *
 */
@SuppressWarnings("serial")
public class FenetrePrincipale extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    static JTextField textField;
    static JTable tableEtudiants;
    //private ControleurRecherche<Object> controleur;

    JMenuBar menu = new JMenuBar();
    JMenu menu1 = new JMenu();
    JMenuItem menu11 = new JMenuItem();

    /**
     * Lancement de l'application
     */
    public static void main(String[] args) {

        FenetrePrincipale fenetreLivre = new FenetrePrincipale();
        fenetreLivre.setVisible(true);
    }

    // Panneau du bas et ses composants
    JButton boutonAjouter;
    JButton boutonModifier;
    JButton boutonEtat;
    JButton btnAjouter;

    JButton boutonAjouterScroll;
    JButton boutonModifierScroll;
    JButton boutonAfficherScroll;
    JButton boutonSupprimerScroll;

    JButton btnRechercher;

    FlowLayout gestionnairePanneauBas;

    /**
     * Constructeur.
     */
    public FenetrePrincipale() {

        String[] items = {"Nom                              ", "Prénom", "Entreprise", "Téléphone", "Courriel"};
        JComboBox LeNomDeTaComboBox = new JComboBox(items);

        //controleur = new ControleurRecherche<Object>(this);
        // Personnalisation du cadre central
        setTitle("Temps KD");

        // Taille de la fen�tre
        setBounds(450, 200, 1000, 700);

        setBackground(Color.yellow);

        // Type de fermeture
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(3, 1, 0, 0));

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Fichier");
        JMenu menu2 = new JMenu("Client");
        JMenu menu3 = new JMenu("Statistique");
        JMenu menu4 = new JMenu("Aide");

        // Premier Menu
        JMenuItem quitter = new JMenuItem("Quitter");
        menu1.add(quitter);
        menuBar.add(menu1);

        // Deuxieme menu
        JMenuItem ajouter = new JMenuItem("Ajouter");
        JMenuItem modifier = new JMenuItem("Modifier");
        JMenuItem supprimer = new JMenuItem("Supprimer");
        JMenuItem afficher = new JMenuItem("Afficher");
        menu2.add(ajouter);
        menu2.add(modifier);
        menu2.add(supprimer);
        menu2.add(afficher);
        menuBar.add(menu2);

        // Troisième Menu
        JMenuItem afficherStat = new JMenuItem("Afficher");
        JMenuItem sauvegarderStat = new JMenuItem("Sauvegarder");
        JMenuItem imprimer = new JMenuItem("Imprimer");
        menu3.add(afficherStat);
        menu3.add(sauvegarderStat);
        menu3.add(imprimer);
        menuBar.add(menu3);

        // Troisième Menu
        JMenuItem faq = new JMenuItem("F.A.Q.");
        menu4.add(faq);
        menuBar.add(menu4);

        setJMenuBar(menuBar);

        //*************************************************************************************************Panneau 1
        // Création du panneau du milieu avec ses composants
        //**********************************************************************************************************
        JPanel panelCenter = new JPanel();


        panelCenter.setBorder(new TitledBorder(null, "Moteur de recherche",
                TitledBorder.LEFT, TitledBorder.TOP, null, Color.decode("#3899C3")));
       

        FlowLayout flowLayout_1 = (FlowLayout) panelCenter.getLayout();
        flowLayout_1.setVgap(80);

        contentPane.add(panelCenter);

        panelCenter.add(LeNomDeTaComboBox);

        textField = new JTextField();
        panelCenter.add(textField);
        textField.setColumns(20);
        //textField.addActionListener(controleur);

        btnRechercher = new JButton("Rechercher");
        panelCenter.add(btnRechercher);
        //btnRechercher.addActionListener(controleur);

        //*************************************************************************************************Panneau 2
        JPanel panelTable = new JPanel();

        panelTable.setBorder(new TitledBorder(null, "Gestion des clients",
                TitledBorder.LEFT, TitledBorder.TOP, null, Color.decode("#3899C3")));

        panelTable.setPreferredSize(new Dimension(20, 15));
        panelTable.setOpaque(true);
        contentPane.add(panelTable);

        tableEtudiants = new JTable();
        tableEtudiants.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableEtudiants.setFillsViewportHeight(true);
        tableEtudiants.setPreferredScrollableViewportSize(new Dimension(600, 70));
        tableEtudiants.setModel(creerModeleAvecColonnesNonEditables());

        tableEtudiants.setRowSelectionInterval(0, 0);
        tableEtudiants.getColumnModel().getColumn(0).setPreferredWidth(160);
        tableEtudiants.getColumnModel().getColumn(1).setResizable(false);
        tableEtudiants.getColumnModel().getColumn(1).setPreferredWidth(160);
        tableEtudiants.getColumnModel().getColumn(2).setResizable(false);
        tableEtudiants.getColumnModel().getColumn(2).setPreferredWidth(160);
        tableEtudiants.getColumnModel().getColumn(3).setResizable(false);
        tableEtudiants.getColumnModel().getColumn(3).setPreferredWidth(160);
        tableEtudiants.getColumnModel().getColumn(4).setResizable(false);
        tableEtudiants.getColumnModel().getColumn(4).setPreferredWidth(160);

        JScrollPane scrollPane = new JScrollPane(tableEtudiants);
        scrollPane.setPreferredSize(new Dimension(900, 130));
        panelTable.add(scrollPane);

        boutonAjouterScroll = new JButton("Ajouter");
        boutonModifierScroll = new JButton("Modifier");
        boutonAfficherScroll = new JButton("Afficher");
        boutonSupprimerScroll = new JButton("Supprimer");

        panelTable.add(boutonAjouterScroll);
        panelTable.add(boutonModifierScroll);
        panelTable.add(boutonAfficherScroll);
        panelTable.add(boutonSupprimerScroll);

        
        //*************************************************************************************************Panneau 3
        JPanel panelBoutons = new JPanel();

        panelBoutons.setBorder(new TitledBorder(null, "Compteur",
                TitledBorder.LEFT, TitledBorder.TOP, null, Color.decode("#3899C3")));

        FlowLayout fl_panelBoutons = (FlowLayout) panelBoutons.getLayout();
        fl_panelBoutons.setVgap(60);
        fl_panelBoutons.setAlignment(FlowLayout.CENTER);
        contentPane.add(panelBoutons);

        // BOUTON AJOUTER
        JButton btnAjouter = new JButton("   Activer   ");
        btnAjouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //Ajout fenetreAjout = new Ajout();
                //fenetreAjout.setVisible(true);
                //fenetreAjout.pack();

            }
        });
        panelBoutons.add(btnAjouter);

        // BOUTON MODIFIER
        boutonEtat = new JButton("                État                ");
        boutonEtat.setBackground(Color.red);
        boutonEtat.setEnabled(false);
        boutonEtat.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg1) {
                //Modification fenetreModif = new Modification();
                //fenetreModif.setVisible(true);
                //fenetreModif.pack();

            }
        });
        panelBoutons.add(boutonEtat);

        // BOUTON MODIFIER
        boutonModifier = new JButton("Désactiver");
        boutonModifier.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg1) {
                //Modification fenetreModif = new Modification();
                //fenetreModif.setVisible(true);
                //fenetreModif.pack();

            }
        });
        panelBoutons.add(boutonModifier);


        panelCenter.setBackground(Color.decode("#e6f7ff"));
        panelTable.setBackground(Color.decode("#e6f7ff"));
        panelBoutons.setBackground(Color.decode("#e6f7ff"));

    }

    /**
     * Cr�er le mod�le avec les colonnes non �ditables.
     *
     * @return LE mod�le de la table.
     */
    private DefaultTableModel creerModeleAvecColonnesNonEditables() {

        return new DefaultTableModel(
                new Object[][]{
                    null

                },
                new String[]{"Nom", "Prénom",
                    "Entreprise", "Téléphone", "Courriel"}) {

            boolean[] columnEditables = new boolean[]{false, false, false, false, false};

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        };
    }

    public JButton getBtnRechercher() {
        return btnRechercher;
    }

    public JTextField getTextField() {
        return textField;
    }
}
