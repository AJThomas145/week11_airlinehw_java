import java.util.ArrayList;

public class FlightManager {

    private Plane plane;
    private ArrayList<Passenger> passengers;


    public FlightManager(Plane plane) {
        this.plane = plane;
        this.passengers = new ArrayList<>();


    }

    public int baggageWeightPerPassenger() {
        return ((plane.getWeightFromType() / 2) / plane.getCapacityFromType());
    }

    public int totalWeightofLuggageOfPassengers(Flight flight) {
        return this.baggageWeightPerPassenger() * flight.passengerSize();
    }

}
