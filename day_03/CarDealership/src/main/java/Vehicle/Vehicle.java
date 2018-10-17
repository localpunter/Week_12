package Vehicle;

import Vehicle.Parts.Body;
import Vehicle.Parts.Engine;

public abstract class Vehicle {
    private Body body;
    private Engine engine;
    private double price;

    public Vehicle(Body body, Engine engine, double price) {
        this.body = body;
        this.engine = engine;
        this.price = price;
    }
}
