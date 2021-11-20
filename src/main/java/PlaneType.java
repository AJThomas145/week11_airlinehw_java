public enum PlaneType {

    BOEING737(10, 20),
    BOEING747(30, 60),
    BOEING767(50, 100),
    BOEING777(100, 200);

    private final int capacity;
    private final int totalWeightInTonnes;

    PlaneType(int capacity, int totalWeightInTonnes){
        this.capacity = capacity;
        this.totalWeightInTonnes = totalWeightInTonnes;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeightInTonnes() {
        return totalWeightInTonnes;
    }

}
