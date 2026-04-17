package services;

import models.Vol;
import java.util.ArrayList;

public class GestionVols {
    private ArrayList<Vol> vols = new ArrayList<>();

    public void ajouterVol(Vol vol) {
        vols.add(vol);
        System.out.println("Vol " + vol.getNumeroVol() + " ajouté");
    }

    public void supprimerVol(String numeroVol) {
        Vol aSupprimer = null;
        for (int i = 0; i < vols.size(); i++) {
            if (vols.get(i).getNumeroVol().equals(numeroVol)) {
                aSupprimer = vols.get(i);
            }
        }
        if (aSupprimer != null) {
            vols.remove(aSupprimer);
            System.out.println("Vol " + numeroVol + " supprimé");
        } else {
            System.out.println("Vol introuvable");
        }
    }

    public Vol chercherVol(String numeroVol) {
        for (int i = 0; i < vols.size(); i++) {
            if (vols.get(i).getNumeroVol().equals(numeroVol)) {
                return vols.get(i);
            }
        }
        System.out.println("Vol " + numeroVol + " introuvable");
        return null;
    }

    public void obtenirVol(String numeroVol) {
        Vol v = chercherVol(numeroVol);
        if (v != null) {
            v.afficherDetails();
        }
    }

    public void annulerVol(String numeroVol) {
        supprimerVol(numeroVol);
        System.out.println("Vol " + numeroVol + " annulé");
    }

    public void planifierVol(String date, Vol vol) {
        System.out.println("Planning du " + date);
        vols.add(vol);
        vol.afficherDetails();
    }

    public void afficherTousLesVols() {
        if (vols.size() == 0) {
            System.out.println("Aucun vol enregistré");
            return;
        }
        for (int i = 0; i < vols.size(); i++) {
            vols.get(i).afficherDetails();
        }
    }
}