import attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground;

    @Before
    public void setUp(){
        playground = new Playground("Relax Zone", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Relax Zone", playground.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(1, playground.getRating());
    }
}
