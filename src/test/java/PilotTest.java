import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;

    @Before
    public void setUp() {
        pilot1 = new Pilot("Steven", RankType.CAPTAIN, "N11223344");
    }

    @Test
    public void hasName(){
        assertEquals("Steven", pilot1.getName());
    }
}
