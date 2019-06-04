import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp(){
        tobaccoStall = new TobaccoStall("Puffin House", "Lynn", 5, 1);
        visitor1 = new Visitor("David",10, 160, 50.00);
        visitor2 = new Visitor("Ken",33, 180, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Puffin House", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Lynn", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(5, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(1, tobaccoStall.getRating());
    }

    @Test
    public void canSellTobacco(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void canNotSellTobacco(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    }
}
