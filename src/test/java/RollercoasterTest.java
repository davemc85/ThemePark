import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Crazy Train", 5, 120, 8.40);
    }

    @Test
    public void hasName() {
        assertEquals("Crazy Train", rollercoaster.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(5, rollercoaster.getRating());
    }
}
