public class Plane {

    private PlaneType type;


    public Plane(PlaneType planeType) {
        this.type = planeType;
    }

    public PlaneType getType() {
        return type;
    }

    public int getCapacityFromType() {
        return this.type.getCapacity();
    }

    public int getWeightFromType() {
        return this.type.getTotalWeightInTonnes();
    }


    public int totalWeightAllowedForLuggage() {
        return this.getWeightFromType() / 2;
    }
}
