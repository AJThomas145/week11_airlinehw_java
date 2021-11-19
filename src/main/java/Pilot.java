public class Pilot {

    private String name;
    private RankType rank;
    private String pilotLicenceNumber;

    public Pilot (String name, RankType rankType, String pilotLicenceNumber) {
        this.name = name;
        this.rank = rankType;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getName() {
        return name;
    }

    public RankType getRank() {
        return rank;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }
}
