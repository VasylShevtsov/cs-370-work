package edu.whitman;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements IParkingLot {
    private final int capacity;
    private final List<ICar> cars;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    // Adds a car to the parking lot
    @Override 
    public void addCar(ICar car) {
        if (!checkAvailability()) {
            throw new IllegalStateException("Parking lot is full.");
        }
        cars.add(car);
    }

    // Removes a car from the parking lot
    @Override 
    public void removeCar(ICar car) {
        if (!cars.remove(car)) {
            throw new IllegalStateException("This car is not in the parking lot.");
        }
    }

    // Checks if there is availability in the parking lot
    @Override 
    public boolean checkAvailability() {
        return getAvailableSpaces() > 0;
    }

    // Returns the number of available spaces in the parking lot
    @Override 
    public int getAvailableSpaces() {
        return capacity - cars.size();
    }
}
