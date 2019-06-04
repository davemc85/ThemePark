import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;

    @Before
    public void setUp(){
        dodgems = new Dodgems("Rodger Dodgers", 4);
    }

    @Test
    public void hasName() {
        assertEquals("Rodger Dodgers", dodgems.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(4, dodgems.getRating());
    }

}
