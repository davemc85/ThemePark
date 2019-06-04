import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp(){
        playground = new Playground("Relax Zone", 1);
        visitor1 = new Visitor("David",10, 160, 50.00);
        visitor2 = new Visitor("Ken",33, 180, 50.00);

    }

    @Test
    public void hasName() {
        assertEquals("Relax Zone", playground.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(1, playground.getRating());
    }

    @Test
    public void allowedAccessAsUnderAgeLimit(){
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void notAllowedAccessAsTooOld(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
