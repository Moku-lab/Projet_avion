import models.Pilote;
import models.PersonnelCabine;
import models.Vol;



public class Main {
    public static void main(String[] args) {
        Pilote commandant = new Pilote("E01", "Marc Lefebvre", "Lyon", "070707", "PIL-99", "ATPL-2024");
        PersonnelCabine hotesse = new PersonnelCabine("E02", "Sophie Martin", "Nice", "060606", "CAB-12", "Sécurité");

        Vol volParisNyc = new Vol("AF001", "Paris-CDG", "New York-JFK", "15/04/2026 10:00");

        volParisNyc.affecterPersonnel(commandant, hotesse);

        System.out.println("--- Détails du Vol ---");
        volParisNyc.afficherDetails();
        System.out.println("Rôle de Sophie : " + hotesse.obtenirRole());
    }
}