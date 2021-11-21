import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot1;
    Plane plane1;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;

    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.BOEING737);
        pilot1 = new Pilot("Steven", RankType.CAPTAIN, "N11223344");
        flight = new Flight(pilot1, plane1, "EDI", "ED1122", "EDI", "1800" );

    }

    @Test
    public void showPilotFlyingPlane(){
        assertEquals("Steven", flight.showPilotFlyingPlane());

    }

    @Test
    public void addPassengerToFlight() {
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        assertEquals(3, flight.passengerSize());
    }

    @Test
    public void showAvailableSeats(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        assertEquals(8, flight.availableSeats());
    }

//    @Test
//    public void crewWelcomeMessagetoPassengers(){
//        flight.wel
//    }




}
