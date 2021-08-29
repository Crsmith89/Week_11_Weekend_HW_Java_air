import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    ArrayList<Passenger> passengers;
    Plane plane;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        pilot = new Pilot("Sully", Rank.CAPTAIN, "180");
        cabinCrewMember1 = new CabinCrewMember("Isa", Rank.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Jack", Rank.FLIGHTATTENDANT);
        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(cabinCrewMember1);
        cabinCrewMembers.add(cabinCrewMember2);
        passengers = new ArrayList<>();
        passenger1 = new Passenger("Winston", 3);
        passenger2 = new Passenger("Bobby", 2);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, cabinCrewMembers, plane, "CS221", "LDN", "ABZ", "09:00");
    }

    @Test
    public void hasPilot(){
        assertEquals("Sully", flight.getPilot().getRank());
    }

    @Test
    public void hasCabinCrew(){
        assertEquals(2, flight.getAmountOfCabinCrew());
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING747, flight.getPlane().getPlaneType());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("CS221", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("LDN", flight.getFlightDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("ABZ", flight.getFlightDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("09:00", flight.getFlightDepartureTime());
    }

    @Test
    public void hasAvailableSeats(){
        assertEquals(400, flight.getAvailableSeats());
    }

    @Test
    public void hasAvailableSeats2(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(398, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(2, flight.getTotalPassengers());
    }
}
