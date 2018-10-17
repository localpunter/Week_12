package Dealership;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Vehicle> vehicles;
    private double funds;


    public Dealership(ArrayList<Vehicle> vehicles, double funds){
        this.vehicles = vehicles;
        this.funds = funds;

    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public double getFunds() {
        return funds;
    }

    public void buyVehicle(Vehicle vehicle) {
        if (funds >= vehicle.getPrice()) {
            funds -= vehicle.getPrice();
            vehicles.add(vehicle);
        }
    }

    public boolean repair(Vehicle vehicle) {
        double repairCost = vehicle.repair();
        if (funds >= repairCost) {
            funds -= repairCost;
            return true;
        }

        return false;
    }


    public void addDamage(Vehicle vehicle, int damage) {
        vehicle.addDamage(damage);
    }
}
