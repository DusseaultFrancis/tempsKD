package interfaceGraphique;

import controleurIG.ControleurIdentification;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import controleurIG.ControleurIdentification;

/**
 * DialogEtudiantAjout : Fenêtre (JDialog) d'ajout d'un étudiant.
 *
 * @author Ismael Doukoure
 * @version Avril 2014
 *
 */
public class Identification extends JDialog {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane1;
    public static JTextField textField;
    public static JTextField textField_1;
    private static JButton btnAjouter;
    private JButton btnAnnuler;
    private ControleurIdentification ident;

    /**
     * Créer un dialogue et le rendre visible.
     */
    public static void main(String[] args) {

        Identification frame = new Identification();
        frame.setModal(true);
        frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }

    /**
     * Create the frame.
     */
    public Identification() {

        // Création du contrôleur
        ident = new ControleurIdentification(this);

        setTitle("Temps KD - Identification");
        setBounds(800, 300, 300, 250);
        contentPane1 = new JPanel();
        contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane1);
        contentPane1.setLayout(new BorderLayout(0, 0));

        JPanel panelHaut = new JPanel();
        panelHaut.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), null, TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        contentPane1.add(panelHaut, BorderLayout.CENTER);
        panelHaut.setLayout(new GridLayout(5, 2, 0, 5));

        JLabel lblISBN = new JLabel("Nom d'utilisateur :");
        panelHaut.add(lblISBN);

        textField = new JTextField();
        panelHaut.add(textField);
        textField.setColumns(10);

        JLabel lblTitre = new JLabel("Mot de passe :");
        panelHaut.add(lblTitre);

        textField_1 = new JTextField();
        panelHaut.add(textField_1);
        textField_1.setColumns(10);

        JPanel panelBas = new JPanel();
        FlowLayout flowLayout = (FlowLayout) panelBas.getLayout();
        flowLayout.setAlignment(FlowLayout.RIGHT);
        contentPane1.add(panelBas, BorderLayout.SOUTH);

        btnAjouter = new JButton("Soumettre");
        btnAjouter.addActionListener(ident);
        panelBas.add(btnAjouter);

        btnAnnuler = new JButton("Annuler");
        btnAnnuler.addActionListener(ident);
        panelBas.add(btnAnnuler);

        getRootPane().setDefaultButton(btnAjouter);

    }

    public JButton getBtnAjouter() {

        return btnAjouter;

    }

    public JButton getBtnAnnuler() {

        return btnAnnuler;

    }

    public JTextField getTextField_1() {

        return textField_1;

    }

    public JTextField getTextField() {

        return textField;

    }

}
