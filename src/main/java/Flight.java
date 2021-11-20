import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private Plane plane;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String airport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String airport, String departureTime ) {
        this.pilot = pilot;
        this.plane = plane;
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.airport = airport;
        this.departureTime= departureTime;

    }

    public Pilot getPilot() {
        return pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getAirport() {
        return airport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
