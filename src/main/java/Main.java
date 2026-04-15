import models.*;


public class Main {
    public static void main(String[] args) {
        Pilote commandant = new Pilote("E01", "Marc Lefebvre", "Lyon", "070707", "PIL-99", "ATPL-2024");
        PersonnelCabine hotesse = new PersonnelCabine("E02", "Sophie Martin", "Nice", "060606", "CAB-12", "Sécurité");

        Vol volParisNyc = new Vol("AF001", "Paris-CDG", "New York-JFK", "15/04/2026 10:00");

        volParisNyc.affecterPersonnel(commandant, hotesse);

        System.out.println("--- Détails du Vol ---");
        volParisNyc.afficherDetails();
        System.out.println("Rôle de Sophie : " + hotesse.obtenirRole());

        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "Terminal 2E");
        Avion monA320 = new Avion("F-GSTA", "Airbus A320", 180);


        Vol vol1 = new Vol("AF123", "Paris", "Londres", "18/04/2026");
        Passager p1 = new Passager("PAS-789", "Alice Durand", "Lyon", "06000000", "PZ-9988");

        Reservation res = new Reservation("RES-001", p1, vol1);

        System.out.println("--- Système de Réservation Aérienne ---");
        cdg.affecterVol();
        res.afficherInfos();

        res.annulerReservation();
        System.out.println("Nouveau statut : " + res.statut);
        res.afficherInfos();
    }
}