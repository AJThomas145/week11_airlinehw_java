import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember1;

    @Before
    public void setUp(){
        cabinCrewMember1 = new CabinCrewMember("Sue", RankType.ATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Sue", cabinCrewMember1.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(RankType.ATTENDANT, cabinCrewMember1.getRank());
    }


}
