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

    public Flight (Pilot pilot, Plane plane, String flightNumber, String destination, String airport, String departureTime ) {
        this.pilot = pilot;
        this.plane = plane;
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.airport = airport;
        this.departureTime= departureTime;

    }


    public String showPilotFlyingPlane() {
        return pilot.getName();
    }

    public int passengerSize() {
        return this.passengers.size();
    }

    public int availableSeats() {
        return plane.getCapacityFromType() - passengers.size();
    }

    public void addPassengerToFlight(Passenger passenger) {
        if (this.passengerSize() < this.plane.getCapacityFromType()) {
            this.passengers.add(passenger);}
    }

    public int cabinCrewSize() {
        return this.cabinCrewMembers.size();
    }

    public void addCabinCrewToFLight(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

}
