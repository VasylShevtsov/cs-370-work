package edu.whitman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RenterTest {

    @Test
    void testGetId() {
        Renter renter = new Renter(1, "Basil");

        assertEquals(1, renter.getId());
    }

    @Test
    void testGetName() {
        Renter renter = new Renter(1, "Basil");

        assertEquals("Basil", renter.getName());
    }

    @Test
    void testGetApartment() {
        Renter renter = new Renter(1, "Basil");
        Apartment apartment = new Apartment(10, "280 Boyer Ave", 204);
        renter.rentApartment(apartment);

        assertEquals(apartment, renter.getApartment());
    }

    @Test
    void testRentApartment() {
        Renter renter = new Renter(1, "Basil");
        Apartment apartment = new Apartment(10, "280 Boyer Ave", 204);

        renter.rentApartment(apartment);

        assertEquals(apartment, renter.getApartment());
        assertEquals(true, renter.hasApartment());
    }

    @Test
    void testHasApartment() {
        Renter renter = new Renter(1, "Basil");
        Apartment apartment = new Apartment(10, "280 Boyer Ave", 204);

        assertEquals(false, renter.hasApartment());

        renter.rentApartment(apartment);

        assertEquals(true, renter.hasApartment());
    }

    @Test
    void testMoveOut() {
        Renter renter = new Renter(1, "Basil");
        Apartment apartment = new Apartment(10, "280 Boyer Ave", 204);
        renter.rentApartment(apartment);

        renter.moveOut();

        assertEquals(null, renter.getApartment());
        assertEquals(false, renter.hasApartment());
    }
}
