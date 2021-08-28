import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING777);
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING777, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(450, plane.getCapacity());
    }

}
