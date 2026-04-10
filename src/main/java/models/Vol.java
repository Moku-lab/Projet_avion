package models;

import java.util.ArrayList;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private Avion avionAssigne;
    private Pilote piloteAssigne;
    private ArrayList<PersonnelCabine> equipageCabine;

    public Vol(String numeroVol, String origine, String destination, String dateHeureDepart) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.equipageCabine = new ArrayList<>();
    }

    public void affecterPersonnel(Pilote pilote, PersonnelCabine membre) {
        this.piloteAssigne = pilote;
        this.equipageCabine.add(membre);
        System.out.println("Équipage affecté au vol " + numeroVol);
    }

    public void afficherDetails() {
        System.out.println("Vol: " + numeroVol + " | De: " + origine + " à: " + destination);
        if (piloteAssigne != null) {
            System.out.println("Pilote: " + piloteAssigne.nom);
        }
    }
}