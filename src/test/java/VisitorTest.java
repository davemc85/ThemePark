import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void setUp(){
        visitor = new Visitor("David", 33, 180, 50.00);
    }

    @Test
    public void canGetName(){
        assertEquals("David", visitor.getName());
    }

    @Test
    public void canGetAge(){
        assertEquals(33, visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(180, visitor.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(50.00, visitor.getMoney(), 0.01);
    }
}
