/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regleAffaire;

import java.util.Date;

public class Temps {

    static private Date dateDepart;
    static private Date dateFin;
    static TempsMesure mesureTemps = new TempsMesure();

    public Temps() {

        Temps.dateDepart = new Date();
    }

    public double finTemps() {

        long tempsTotal = 0;

        tempsTotal = calculTempsTotal();

        transformationEnMesure(tempsTotal);

        return tempsTotal;
    }

    public long calculTempsTotal() {

        Date tempsDebut = getTempsDepart();
        Date tempsFin = new Date();
        this.dateFin = tempsFin;

        //en millisecondes
        long diff = tempsFin.getTime() - tempsDebut.getTime();

        return diff;
    }

    public static void transformationEnMesure(long tempsTotal) {

        long diffSeconds = tempsTotal / 1000 % 60;
        long diffMinutes = tempsTotal / (60 * 1000) % 60;
        long diffHours = tempsTotal / (60 * 60 * 1000) % 24;
        long diffDays = tempsTotal / (24 * 60 * 60 * 1000);

        mesureTemps.setSecondes(diffSeconds);
        mesureTemps.setMinutes(diffMinutes);
        mesureTemps.setHeures(diffHours);
        mesureTemps.setJours(diffHours);
    }

    public Date getTempsDepart() {
        return dateDepart;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public TempsMesure getMesureTemps() {
        return mesureTemps;
    }

    public void setTempsDepart(Date tempsDebut) {
        this.dateDepart = tempsDebut;
    }

    public void setDateFin(Date dateFin) {
        Temps.dateFin = dateFin;
    }

    public void setMesureTemps(TempsMesure mesureTemps) {
        Temps.mesureTemps = mesureTemps;
    }

}
