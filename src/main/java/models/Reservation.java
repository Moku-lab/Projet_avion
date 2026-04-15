package models;

import java.util.Date;

public class Reservation {
    private String numeroReservation;
    private Date dateReservation;
    private String statut;
    private Passager passager;
    private Vol vol;

    public Reservation(String numeroReservation, Passager passager, Vol vol) {
        this.numeroReservation = numeroReservation;
        this.passager = passager;
        this.vol = vol;
        this.dateReservation = new Date();
        this.statut = "Confirmée";
    }

    public void confirmerReservation() {
        this.statut = "Confirmée";
        System.out.println("Réservation " + numeroReservation + " confirmée.");
    }

    public void annulerReservation() {
        this.statut = "Annulée";
        System.out.println("Réservation" + numeroReservation + "annulée");
    }
    //vol
    public void modifierReservation(Vol nouveauVol) {
        this.vol = nouveauVol;
        System.out.println("Vol modifié.");
    }

    //passager
    public void modifierReservation(Passager nouveauPassager) {
        this.passager = nouveauPassager;
        System.out.println("passager modifié.");
    }

    //date
    public void modifierDate(Date nouvelleDate){
        this.dateReservation = nouvelleDate;
        System.out.println("date modifiée.");
    }

    //vol et passager et date
    public void modifierReservation(Vol nouveauVol, Passager nouveauPassager, Date nouvelleDate) {
        this.vol = nouveauVol;
        this.passager = nouveauPassager;
        this.dateReservation = nouvelleDate;
        System.out.println("Vol et Passager et Date modifiés.");
    }

    public void afficherInfos() {
        System.out.println("Réservation N°: " + numeroReservation + " Statut: " + statut);
        System.out.println("Passager: " + passager.nom);
        System.out.println("Date: " + dateReservation);
    }
}





