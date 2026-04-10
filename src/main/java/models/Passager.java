package models;

public class Passager extends Personne {
    private String passeport;

    public Passager(String identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
    }

    public void reserverVol() {
        System.out.println(nom + " a réservé un vol.");
    }
}