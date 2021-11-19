public class CabinCrewMember {

    private String name;
    private RankType rank;

    public CabinCrewMember(String name, RankType ranktype) {
        this.name = name;
        this.rank = ranktype;
    }

    public String getName() {
        return name;
    }

    public RankType getRank() {
        return rank;
    }
}
