/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regleAffaire;

/**
 *
 * @author Francis
 */
public class TempsMesure {

    double secondes = 0;
    double minutes = 0;
    double heures = 0;
    double jours = 0;

    public TempsMesure() {
    }

    public TempsMesure(double secondes, double minutes, double heures, double jours) {

        this.secondes = secondes;
        this.minutes = minutes;
        this.heures = heures;
        this.jours = jours;
    }

    public double getSecondes() {
        return secondes;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getHeures() {
        return heures;
    }

    public double getJours() {
        return jours;
    }

    public void setSecondes(double secondes) {
        this.secondes = secondes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }

    public void setJours(double jours) {
        this.jours = jours;
    }

}
