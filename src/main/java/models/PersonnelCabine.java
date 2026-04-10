package models;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye);
        this.qualification = qualification;
    }

    @Override
    public String obtenirRole() {
        return "Personnel de Cabine";
    }
}