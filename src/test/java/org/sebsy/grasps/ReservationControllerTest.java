package org.sebsy.grasps;

import org.junit.Test;
import org.sebsy.grasps.beans.Reservation;

import static org.junit.Assert.*;

public class ReservationControllerTest {

    @Test
    public void testCreerReservation() {
        // Préparation des paramètres
        Params params = new Params();
        params.setIdentifiantClient("cli1");
        params.setDateReservation("04/07/2025 10:00:00");
        params.setTypeReservation("VIP");
        params.setNbPlaces(2);

        ReservationController controller = new ReservationController();
        Reservation reservation = controller.creerReservation(params);

        assertNotNull(reservation);
        assertEquals(2, reservation.getNbPlaces());
        assertNotNull(reservation.getClient());
        assertNotNull(reservation.getTypeReservation());
        assertTrue(reservation.getTotal() > 0);
    }
}
