import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {
    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before() {
        dataBaseAdmin = new DataBaseAdmin("Roy", "TR436281Y", 27000);
    }

    @Test
    public void dataBaseAdminHasName() {
        assertEquals("Roy", dataBaseAdmin.getName());
    }

    @Test
    public void dataBaseAdminHasNi() {
        assertEquals("TR436281Y", dataBaseAdmin.getNi());
    }

    @Test
    public void dataBaseAdminHasSalary() {
        assertEquals(27000, dataBaseAdmin.getSalary(), 1);
    }

    @Test
    public void dataBaseAdminCanChangeName() {
        dataBaseAdmin.setName("Tony");
        assertEquals("Tony", dataBaseAdmin.getName());
    }
}
