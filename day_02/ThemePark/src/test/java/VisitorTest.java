import org.junit.Before;

public class VisitorTest {

    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before() {
        visitor1 = new Visitor(12, 1.24, 10.00);
        visitor2 = new Visitor(17, 1.40, 20.00);
        visitor3 = new Visitor(30, 1.78, 50.00);
    }
}
