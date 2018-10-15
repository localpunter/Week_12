import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "GB345676S", 35000, "HR");
    }

    @Test
    public void managerHasDept() {
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void managerHasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNi() {
        assertEquals("GB345676S", manager.getNi());
    }

    @Test
    public void canChangeName() {
        manager.setName("Alan");
        assertEquals("Alan", manager.getName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.05);
        assertEquals(36750, manager.getSalary(),1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, manager.payBonus(),1);
    }
}
