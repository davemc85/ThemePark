import attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park park;

    @Before
    public void setUp(){
        park = new Park("Relax Zone", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Relax Zone", park.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(1, park.getRating());
    }
}
