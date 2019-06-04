import org.junit.Before;
import org.junit.Test;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;

    @Before
    public void setUp(){
        tobaccoStall = new TobaccoStall("Puffin House", "Lynn", 5, 1);
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
}
