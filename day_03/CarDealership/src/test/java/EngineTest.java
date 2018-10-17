import Vehicle.Parts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before

    public void before() {
        engine = new Engine(10);
    }

    @Test
    public void canAddDamage() {
        engine.addDamage(2);
        assertEquals(8, engine.getHitPoints());
    }
}
