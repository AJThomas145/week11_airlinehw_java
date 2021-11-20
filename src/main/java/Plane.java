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


}
