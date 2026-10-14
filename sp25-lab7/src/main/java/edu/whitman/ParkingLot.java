package edu.whitman;

import java.util.ArrayList;
import java.util.List;

public interface ParkingLot implements IParkingLot {
    // Adds a car to the parking lot
    void addCar(ICar car);

    // Removes a car from the parking lot
    void removeCar(ICar car);

    // Checks if there is availability in the parking lot
    boolean checkAvailability();

    // Returns the number of available spaces in the parking lot
    int getAvailableSpaces();
}
