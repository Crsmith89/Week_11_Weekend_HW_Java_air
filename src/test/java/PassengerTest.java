import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Dave", 3);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Dave", passenger.getName());
    }

    @Test
    public void passengerNumOfBags() {
        assertEquals(3, passenger.getNumOfBags());
    }
}
