import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;

    @Before
    public void setUp() {
        plane1 = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING737, plane1.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, plane1.getCapacityFromType());
    }

    @Test
    public void hasWeight(){
        assertEquals(20, plane1.getWeightFromType());
    }

    @Test
    public void totalWeightAllowedForLuggage() {
        assertEquals(10, plane1.totalWeightAllowedForLuggage());
    }
}
