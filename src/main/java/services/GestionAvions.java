package services;

import models.Avion;
import java.util.ArrayList;

public class GestionAvions {
    private ArrayList<Avion> avions = new ArrayList<>();

    public void ajouterAvion(Avion a) {
        avions.add(a);
        System.out.println("Avion " + a.getImmatriculation() + " ajouté");
    }

    public void supprimerAvion(String immatriculation) {
        Avion aSupprimer = null;
        for (int i = 0; i < avions.size(); i++) {
            if (avions.get(i).getImmatriculation().equals(immatriculation)) {
                aSupprimer = avions.get(i);
            }
        }
        if (aSupprimer != null) {
            avions.remove(aSupprimer);
            System.out.println("Avion supprimé");
        } else {
            System.out.println("Avion introuvable");
        }
    }

    public Avion chercherAvion(String immatriculation) {
        for (int i = 0; i < avions.size(); i++) {
            if (avions.get(i).getImmatriculation().equals(immatriculation)) {
                return avions.get(i);
            }
        }
        System.out.println("Avion introuvable");
        return null;
    }

    public Avion trouverAvionDisponible(String date) {
        for (int i = 0; i < avions.size(); i++) {
            if (avions.get(i).verifierDisponibilite(date)) {
                return avions.get(i);
            }
        }
        System.out.println("Aucun avion disponible le " + date);
        return null;
    }
}