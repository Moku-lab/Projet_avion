package services;

import models.Reservation;
import java.util.ArrayList;

public class GestionReservations {
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void ajouterReservation(Reservation r) {
        reservations.add(r);
        System.out.println("Réservation " + r.getNumeroReservation() + " ajoutée");
    }

    public void supprimerReservation(String numero) {
        Reservation aSupprimer = null;
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getNumeroReservation().equals(numero)) {
                aSupprimer = reservations.get(i);
            }
        }
        if (aSupprimer != null) {
            reservations.remove(aSupprimer);
            System.out.println("Réservation " + numero + " supprimée");
        } else {
            System.out.println("Réservation introuvable");
        }
    }

    public Reservation chercherReservation(String numero) {
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getNumeroReservation().equals(numero)) {
                return reservations.get(i);
            }
        }
        System.out.println("Réservation " + numero + " introuvable");
        return null;
    }

    public void obtenirReservations(String numero) {
        Reservation r = chercherReservation(numero);
        if (r != null) {
            r.afficherInfos();
        }
    }

    public void afficherToutesLesReservations() {
        if (reservations.size() == 0) {
            System.out.println("Aucune réservation");
            return;
        }
        for (int i = 0; i < reservations.size(); i++) {
            reservations.get(i).afficherInfos();
        }
    }
}