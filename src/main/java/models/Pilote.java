package models;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    public Pilote(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String licence) {
        super(identifiant, nom, adresse, contact, numeroEmploye);
        this.licence = licence;
        this.heuresDeVol = 0;
    }

    @Override
    public String obtenirRole() {
        return "Pilote";
    }
}