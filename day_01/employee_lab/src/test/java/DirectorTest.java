import Staff.Management.Director;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("BigBoss", "RT569503U", 90000, "CEO", 200000);
    }

    @Test
    public void directorHasDept() {
        assertEquals("CEO", director.getDeptName());
    }

    @Test
    public void directorHasName() {
        assertEquals("BigBoss", director.getName());
    }

    @Test
    public void hasNi() {
        assertEquals("RT569503U", director.getNi());
    }

    @Test
    public void canChangeName() {
        director.setName("BiggerBoss");
        assertEquals("BiggerBoss", director.getName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.1);
        assertEquals(99000, director.getSalary(),1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(4500, director.payBonus(),1);
    }
}
