package edu.whitman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ApartmentTest {

    @Test
    void testGetId() {
        Apartment apartment = new Apartment(10, "280 Boyer Ave", 204);

        assertEquals(10, apartment.getId());
    }

    @Test
    void testGetAddress() {
        Apartment apartment = new Apartment(10, "280 Boyer Ave", 204);

        assertEquals("280 Boyer Ave", apartment.getAddress());
    }

    @Test
    void testGetUnitNumber() {
        Apartment apartment = new Apartment(10, "280 Boyer Ave", 204);

        assertEquals(204, apartment.getUnitNumber());
    }

    @Test
    void testIsOccupied() {
        Apartment apartment = new Apartment(10, "280 Boyer Ave", 204);

        assertEquals(false, apartment.isOccupied());

        apartment.markOccupied();

        assertEquals(true, apartment.isOccupied());
    }

    @Test
    void testMarkOccupied() {
        Apartment apartment = new Apartment(10, "280 Boyer Ave", 204);

        apartment.markOccupied();

        assertEquals(true, apartment.isOccupied());
    }

    @Test
    void testMarkVacant() {
        Apartment apartment = new Apartment(10, "280 Boyer Ave", 204);
        apartment.markOccupied();

        apartment.markVacant();

        assertEquals(false, apartment.isOccupied());
    }
}
