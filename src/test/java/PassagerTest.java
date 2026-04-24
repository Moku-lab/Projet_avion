import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import models.*;

class Tests {

    @Test
    void testGetImmatriculationAvion() {
        Avion avion = new Avion("F-ABCD", "Boeing 737", 200);
        assertEquals("F-ABCD", avion.getImmatriculation());
    }

    @Test
    void testDisponibiliteAvion() {
        Avion avion = new Avion("G-HGJZ", "Airbus A320", 150);
        assertTrue(avion.verifierDisponibilite("25-12"));
    }

    @Test
    void testAnnulerReservation() {

        Passager passager = new Passager("P1", "Thomas", "Paris", "0600", "AB12345");

        Vol vol = new Vol("AF123", "Paris", "Lyon", "10:00");
        Reservation reservation = new Reservation("RES-999", passager, vol);

        assertEquals("Confirmée", reservation.statut);

        reservation.annulerReservation();

        assertEquals("Annulée", reservation.statut);
    }
}