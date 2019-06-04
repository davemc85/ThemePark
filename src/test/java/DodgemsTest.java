import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;
    private Visitor visitor;

    @Before
    public void setUp(){
        dodgems = new Dodgems("Rodger Dodgers", 4, 4.50);
        visitor = new Visitor("David", 11, 180, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Rodger Dodgers", dodgems.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(4, dodgems.getRating());
    }

    @Test
    public void standardPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void priceForChildren(){
        assertEquals(2.25, dodgems.priceFor(visitor), 0.01);
    }

}
