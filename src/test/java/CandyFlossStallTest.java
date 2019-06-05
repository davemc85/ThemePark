import org.junit.Before;
import org.junit.Test;
import stalls.CandyFlossStall;


import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall;

    @Before
    public void setUp(){
        candyFlossStall = new CandyFlossStall("Sweet Stuff", "David", 3, 1);
    }

    @Test
    public void hasName() {
        assertEquals("Sweet Stuff", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("David", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(3, candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(1, candyFlossStall.getRating());
    }

}
