import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Sully", Rank.CAPTAIN, "Sully180");
    }

    @Test
    public void hasName() {
        assertEquals("Sully", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenceNum() {
        assertEquals("Sully180", pilot.getLicenceNumber());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("This is your pilot", pilot.flyPlane());
    }
}
