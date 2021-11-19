import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void setUp() {
        passenger1 = new Passenger ("Andy", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Andy", passenger1.getName());
    }
}
