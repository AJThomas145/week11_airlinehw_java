import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    FlightManager flightManager;
    Flight flight;
    Pilot pilot1;
    Plane plane1;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;

    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.BOEING737);
        flightManager = new FlightManager(plane1);
        pilot1 = new Pilot("Steven", RankType.CAPTAIN, "N11223344");
        flight = new Flight(flightManager, pilot1, plane1, "EDI", "ED1122", "EDI", "1800" );
        passenger1 = new Passenger("Andy", 1);
        passenger2 = new Passenger("David", 2);
        passenger3 = new Passenger("Graeme", 1);
        passenger4 = new Passenger("Helen", 1);
        cabinCrewMember1 = new CabinCrewMember("John", RankType.FIRSTOFFICER);
        cabinCrewMember2 = new CabinCrewMember("Susan", RankType.ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Steven", RankType.ATTENDANT);

    }

    @Test
    public void showPilotFlyingPlane(){
        assertEquals("Steven", flight.showPilotFlyingPlane());

    }

    @Test
    public void showAvailableSeats(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        assertEquals(8, flight.availableSeats());
    }

    @Test
    public void bookPassengerToFlight() {
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        assertEquals(3, flight.passengerSize());
    }

    @Test
    public void flightFullCantAddPassenger() {
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        flight.addPassengerToFlight(passenger3);
        flight.addPassengerToFlight(passenger4);
        assertEquals(10, flight.passengerSize());

    }

    @Test
    public void addCabinCrewToFlight(){
        flight.addCabinCrewToFLight(cabinCrewMember1);
        flight.addCabinCrewToFLight(cabinCrewMember2);
        flight.addCabinCrewToFLight(cabinCrewMember3);
        assertEquals(3, flight.cabinCrewSize());
    }

    @Test
    public void crewWelcomeMessagetoPassengers(){
        flight.addCabinCrewToFLight(cabinCrewMember1);
        assertEquals("Hello passengers, welcome aboard your flight", cabinCrewMember1.welcomePassengerMessage());
    }

    @Test
    public void baggageWeightPerPassengerPerTonnes(){
        assertEquals(1, flightManager.baggageWeightPerPassenger());
    }

    @Test
    public void totalWeightOfLuggage() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        assertEquals(2, flightManager.totalWeightOfLuggageForPassengers(passengers), 0.01);
    }

    @Test
    public void weightRemainingForLuggage() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        assertEquals(8, flightManager.weightRemainingForLuggage(plane1, passengers), 0.01);
    }



}



