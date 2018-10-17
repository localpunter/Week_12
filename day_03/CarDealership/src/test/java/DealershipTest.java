import Dealership.Dealership;
import Vehicle.Car;
import Vehicle.Parts.Body;
import Vehicle.Parts.Engine;
import Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car vehicle1;


    @Before
    public void before() {
        vehicle1 = new Car(new Body(10), new Engine(10), 100.00);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle1);
        dealership = new Dealership(vehicles, 400.00);

    }

    @Test
    public void canBuyVehicle() {
        dealership.buyVehicle(vehicle1);
        assertEquals(3, dealership.getVehicles().size());
    }

    @Test
    public void canRepairVehicle() {
        Vehicle vehicle = dealership.getVehicles().get(0);
        dealership.addDamage(vehicle, 3);
        dealership.repair(vehicle);
        assertEquals(391, dealership.getFunds(), 0.01);
    }

}
