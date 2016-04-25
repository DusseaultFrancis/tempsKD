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
import java.text.SimpleDateFormat;
import java.util.Date;

public class Temps {
    
    static private Date dateDepart;
    static private MesureTemps mesureTemps = new MesureTemps();
    
    public Temps() {
        
        Temps.dateDepart = new Date();
    }
    
    public static double finTemps() {
        
        long tempsTotal = 0;
        
        tempsTotal = calculTempsTotal();
        
        transformationEnMesure(tempsTotal);
        
        return tempsTotal;
    }
    
    public static long calculTempsTotal() {
        
        Date tempsDebut = getTempsDepart();
        Date tempsFin = new Date();

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
    
    public static Date getTempsDepart() {
        return dateDepart;
    }
    
    public void setTempsDepart(Date tempsDebut) {
        this.dateDepart = tempsDebut;
    }
    
}
