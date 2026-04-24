package services;

import models.Passager;

import java.io.*;
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

    public void sauvegarderPassagers(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Passager p : passagers) {
                writer.write(p.getIdentifiant() + ";" + p.getNom() + ";" + p.getPasseport());
                writer.newLine();
            }
            System.out.println("Données sauvegardées avec succès.");
        } catch (IOException e) {
            System.err.println("Erreur d'écriture : " + e.getMessage());
        }
    }

    public void chargerPassagers(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 3) {
                    Passager p = new Passager(data[0], data[1], "Inconnue", "0000", data[2]);
                    passagers.add(p);
                }
            }
            System.out.println("Données chargées avec succès.");
        } catch (IOException e) {
            System.err.println("Erreur de lecture : " + e.getMessage());
        }
    }
}