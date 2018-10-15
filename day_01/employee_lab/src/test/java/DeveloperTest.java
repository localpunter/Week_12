import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Dude", "FG345678Y", 30000);
    }

    @Test
    public void developerHasName() {
        assertEquals("Dude", developer.getName());
    }

    @Test
    public void developerHasNi() {
        assertEquals("FG345678Y", developer.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, developer.getSalary(), 1);
    }

    @Test
    public void canChangeName() {
        developer.setName("The Dude");
        assertEquals("The Dude", developer.getName());
    }
}
