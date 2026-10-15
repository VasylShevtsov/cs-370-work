package edu.whitman;

public class Car implements ICar {
    private final int id;
    private boolean engineRunning;
    private boolean driving;

    public Car(int id) {
        this.id = id;
        this.engineRunning = false;
        this.driving = false;
    }

    // Returns the unique ID of the car
    @Override 
   public int getId(){
        return id;
    }
    
    // Starts the engine of the car
    @Override
    public void startEngine() {
        engineRunning = true;
    }
    
    // Starts driving the car (requires the engine to be running)
    @Override 
    public void drive() {
        if (!engineRunning) {
            throw new IllegalStateException("Can't drive whiile the engine is off!");
        }
        driving = true;
    }
    
    // Stops driving the car and turns off the engine
    @Override 
    public void stop() {
        driving = false;
        engineRunning = false;
    }
    
    // Stops the engine (but only if the car is not driving)
    @Override 
    public void stopEngine() {
        if (driving) {
            throw new IllegalStateException("Can't stop engine while driving.");
        }
        engineRunning = false;
    }
    
    // Returns whether the engine is running
    @Override 
    public boolean isEngineRunning() {
        return  engineRunning;
    }
    
    // Returns whether the car is driving
    @Override 
    public boolean isDriving() {
        return  driving;
    }
}
