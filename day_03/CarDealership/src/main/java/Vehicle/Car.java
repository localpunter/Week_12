package Vehicle;

import Vehicle.Parts.Body;
import Vehicle.Parts.Engine;

public class Car extends Vehicle{
    public Car(Body body, Engine engine, double price) {
        super(body, engine, price);
    }
}
