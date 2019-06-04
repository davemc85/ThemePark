import org.junit.Before;
import org.junit.Test;
import stalls.CandyFlossStall;
import stalls.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall;

    @Before
    public void setUp(){
        iceCreamStall = new IceCreamStall("Mr Frosty", "Beth", 4, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Mr Frosty", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Beth", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(4, iceCreamStall.getParkingSpot());
    }

}
