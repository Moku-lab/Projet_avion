package models;

import java.util.ArrayList;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private ArrayList<String> datesAssignees = new ArrayList<>();

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public String getImmatriculation() { return immatriculation; }
    public String getModele() { return modele; }
    public int getCapacite() { return capacite; }

    public boolean verifierDisponibilite(String date) {
        return !datesAssignees.contains(date);
    }

    public void affecterVol(String date) {
        if (verifierDisponibilite(date)) {
            datesAssignees.add(date);
            System.out.println("Avion " + immatriculation + " affecté au vol du " + date);
        } else {
            System.out.println("Avion " + immatriculation + " non disponible le " + date);
        }
    }
}