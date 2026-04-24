import models.*;
import services.*;

public class Main {
    public static void main(String[] args) {

        Pilote commandant = new Pilote("E01", "Marc Lefebvre", "Lyon", "070707", "PIL-99", "ATPL-2024");
        PersonnelCabine hotesse = new PersonnelCabine("E02", "Sophie Martin", "Nice", "060606", "CAB-12", "Sécurité");

        Vol volParisNyc = new Vol("AF001", "Paris-CDG", "New York-JFK", "15/04/2026 10:00");

        volParisNyc.affecterPersonnel(commandant, hotesse);

        System.out.println(" Détails du Vol ");
        volParisNyc.afficherDetails();
        System.out.println("Rôle de Sophie : " + hotesse.obtenirRole());

        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "Terminal 2E");
        Avion monA320 = new Avion("F-GSTA", "Airbus A320", 180);

        Vol vol1 = new Vol("AF123", "Paris", "Londres", "18/04/2026");
        Passager p1 = new Passager("PAS-789", "Alice Durand", "Lyon", "06000000", "PZ-9988");
        Passager p2 = new Passager("PAS-790", "Thomas Durand", "Lyon", "06000000", "PZ-9988");

        Reservation res = new Reservation("RES-001", p1, vol1);

        System.out.println("Système de Réservation Aérienne ");
        cdg.affecterVol();
        res.afficherInfos();

        res.annulerReservation();
        System.out.println("Nouveau statut : " + res.statut);

        GestionVols gestionVols = new GestionVols();
        gestionVols.ajouterVol(volParisNyc);
        gestionVols.ajouterVol(vol1);

        System.out.println("\nRecherche vol ");
        gestionVols.obtenirVol("AF001");

        System.out.println("\nPlanification vol");
        Vol vol2 = new Vol("AF999", "Paris", "Tokyo", "19/04/2026");
        gestionVols.planifierVol("19/04/2026", vol2);

        System.out.println("\nAnnulation vol ");
        gestionVols.annulerVol("AF123");

        GestionReservations gestionRes = new GestionReservations();
        gestionRes.ajouterReservation(res);

        System.out.println("\n Recherche réservation ");
        gestionRes.obtenirReservations("RES-001");

        GestionAvions gestionAvions = new GestionAvions();
        gestionAvions.ajouterAvion(monA320);

        System.out.println("\nVérification disponibilité avion");
        monA320.affecterVol("18/04/2026");

        GestionPassagers gestionPass = new GestionPassagers();
        String fichier = "src/passagers.csv";

        System.out.println("\n--- Persistance des données ---");

        gestionPass.chargerPassagers(fichier);

        gestionPass.ajouterPassager(p1);
        gestionPass.ajouterPassager(p2);

        gestionPass.sauvegarderPassagers(fichier);

        System.out.println("\nFin du programme.");
    }
}