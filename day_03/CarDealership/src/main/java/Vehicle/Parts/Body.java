package Vehicle.Parts;

import behaviours.IParts;

public class Body implements IParts {
    private int originalHitPoints;
    private int hitPoints;


    public Body(int hitPoints) {
        this.originalHitPoints = hitPoints;
        this.hitPoints = hitPoints;
    }

    public int getOriginalHitPoints() {
        return originalHitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
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
