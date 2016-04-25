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
public class MesureTemps {

    double secondes;
    double minutes;
    double heures;
    double jours;

    public MesureTemps() {

        this.secondes = 0;
        this.minutes = 0;
        this.heures = 0;
        this.jours = 0;
    }

    public MesureTemps(double secondes, double minutes, double heures, double jours) {

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
