package Vehicle.Parts;

import behaviours.IParts;

public class Engine implements IParts {
    private int originalHitPoints;
    private int hitPoints;


    public Engine(int hitPoints) {
        this.originalHitPoints = hitPoints;
        this.hitPoints = hitPoints;
    }

    public int getOriginalHitPoints() {
        return originalHitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void addDamage(int damage) {
        if (damage > 0) {
            hitPoints -= damage;
        }

    }

    @Override
    public void repair() {
        hitPoints = originalHitPoints;
    }
}
