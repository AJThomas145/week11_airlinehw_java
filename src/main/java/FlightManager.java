import java.util.ArrayList;

public class FlightManager {

    private Plane plane;
    private ArrayList<Passenger> passengers;


    public FlightManager(Plane plane) {
        this.plane = plane;
        this.passengers = new ArrayList<>();


    }

    public int baggageWeightPerPassenger() {
        return ((plane.totalWeightAllowedForLuggage() / plane.getCapacityFromType()));
    }



    public double totalWeightOfLuggageForPassengers(ArrayList<Passenger> passengers) {
        double weightPerCaseOfLuggage = 0.5;
        int totalBags = 0;

        for (Passenger passenger: passengers) {
            totalBags += passenger.getNumberOfBags() ;
        }
        return (totalBags * weightPerCaseOfLuggage);
    }


    public double weightRemainingForLuggage(Plane plane, ArrayList<Passenger> passengers) {
        return plane.totalWeightAllowedForLuggage() - totalWeightOfLuggageForPassengers(passengers);
    }
}
