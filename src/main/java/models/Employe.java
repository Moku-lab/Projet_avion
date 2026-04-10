package models;

import java.util.Date;

public abstract class Employe extends Personne {
    protected String numeroEmploye;
    protected Date dateEmbauche;

    public Employe(String identifiant, String nom, String adresse, String contact, String numeroEmploye) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = new Date();
    }

    public abstract String obtenirRole();
}