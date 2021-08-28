import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Babz", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Babz", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }


}
