package Vehicle;

import Vehicle.Parts.Body;
import Vehicle.Parts.Engine;
import behaviours.IParts;


public abstract class Vehicle {
    private final double originalPrice;
    private int originalHitPoints;
    private Body body;
    private Engine engine;
    private double price;
    private int hitPoints;

    public Vehicle(Body body, Engine engine, double price) {
        this.body = body;
        this.engine = engine;
        this.originalPrice = price;
        this.price = price;
        this.originalHitPoints = engine.getOriginalHitPoints() + body.getOriginalHitPoints();
        this.hitPoints = engine.getHitPoints() + body.getHitPoints();
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getPrice() {
        return price;
    }

    public int getOriginalHitPoints() {
        return originalHitPoints;
    }

    public int getHitpoints() {
        return hitPoints;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }


    public void addDamage(int damage) {
        if (damage > 0) {
            hitPoints -= damage;
            price -= damage * 3;
        }

    }


    public double repair() {
        double cost = (originalHitPoints - hitPoints) * 3;
        hitPoints = originalHitPoints;
        return cost;
    }
}
