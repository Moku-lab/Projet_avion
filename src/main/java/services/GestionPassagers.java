package services;

import models.Passager;
import java.util.ArrayList;

public class GestionPassagers {
    private ArrayList<Passager> passagers = new ArrayList<>();

    public void ajouterPassager(Passager p) {
        passagers.add(p);
        System.out.println("Passager " + p.getNom() + " ajouté");
    }

    public void supprimerPassager(String identifiant) {
        Passager aSupprimer = null;
        for (int i = 0; i < passagers.size(); i++) {
            if (passagers.get(i).getIdentifiant().equals(identifiant)) {
                aSupprimer = passagers.get(i);
            }
        }
        if (aSupprimer != null) {
            passagers.remove(aSupprimer);
            System.out.println("Passager supprimé");
        } else {
            System.out.println("Passager introuvable");
        }
    }

    public Passager chercherPassager(String identifiant) {
        for (int i = 0; i < passagers.size(); i++) {
            if (passagers.get(i).getIdentifiant().equals(identifiant)) {
                return passagers.get(i);
            }
        }
        System.out.println("Passager introuvable");
        return null;
    }

    public void afficherTousLesPassagers() {
        if (passagers.size() == 0) {
            System.out.println("Aucun passager");
            return;
        }
        for (int i = 0; i < passagers.size(); i++) {
            passagers.get(i).obtenirInfos();
        }
    }
}