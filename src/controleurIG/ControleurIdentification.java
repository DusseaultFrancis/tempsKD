package controleurIG;

import interfaceGraphique.Identification;
import interfaceGraphique.FenetrePrincipale;
import interfaceGraphique.Identification;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControleurIdentification implements ActionListener {

    Identification ident;

    // Constructeur pour FenetreAjout
    public ControleurIdentification(Identification fenetreIdent) {

        ident = fenetreIdent;

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        // Obtenir la source de l'évenement
        Object source = event.getSource();

        if (source == ident.getBtnAjouter()) { /////// BOUTON AJOUT

            if (!Identification.textField.getText().equals("kd") && !Identification.textField_1.getText().equals("kd")) {

                JOptionPane.showMessageDialog(null,
                        "Nom d'utilisateur ou mot de passe incorrect!",
                        "Message d'erreur",
                        JOptionPane.ERROR_MESSAGE);

            } else {

                ident.dispose();
                FenetrePrincipale fenetre = new FenetrePrincipale();
                fenetre.setVisible(true);

            }

        } else if (source == ident.getBtnAnnuler()) {    /////// BOUTON AJOUT

            ident.dispose();
        }
    }
}
