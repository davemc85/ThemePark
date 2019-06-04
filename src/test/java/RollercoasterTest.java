import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Crazy Train", 5, 120, 8.40);
        visitor1 = new Visitor("Beth",14, 110, 50.00);
        visitor2 = new Visitor("David",10, 160, 50.00);
        visitor3 = new Visitor("Ken",33, 180, 50.00);
    }

    @Test
    public void hasMinHeight(){
        assertEquals(120, rollercoaster.getMinHeight());
    }

    @Test
    public void hasName() {
        assertEquals("Crazy Train", rollercoaster.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(5, rollercoaster.getRating());
    }

    @Test
    public void hasStandardPrice(){
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void testTooSmallToRide(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void testTooYoungToRide(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void testCanRide(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor3));
    }
}
