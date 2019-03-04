public class ElectionResults {
    int demVotes, gopVotes, totalVotes, votesDifference;
    double percentDem, percentGOP, percentDifference;
    String state, county;
    int combindedFips;

    public ElectionResults(int demVotes, int gopVotes, int totalVotes, double percentDem, double percentGOP, int votesDifference, double percentDifference, String state, String county, int combinedFips) {
        this.demVotes = demVotes;
        this.gopVotes = gopVotes;
        this.totalVotes = totalVotes;
        this.percentDem = percentDem;
        this.percentGOP = percentGOP;
        this.votesDifference = votesDifference;
        this.percentDifference = percentDifference;
        this.state = state;
        this.county = county;
        this.combindedFips = combinedFips;
    }


    public int getDemVotes() {
        return demVotes;
    }

    public void setDemVotes(int demVotes) {
        this.demVotes = demVotes;
    }

    public int getGopVotes() {
        return gopVotes;
    }

    public void setGopVotes(int gopVotes) {
        this.gopVotes = gopVotes;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public int getVotesDifference() {
        return votesDifference;
    }

    public void setVotesDifference(int votesDifference) {
        this.votesDifference = votesDifference;
    }

    public double getPercentDem() {
        return percentDem;
    }

    public void setPercentDem(double percentDem) {
        this.percentDem = percentDem;
    }

    public double getPercentGOP() {
        return percentGOP;
    }

    public void setPercentGOP(double percentGOP) {
        this.percentGOP = percentGOP;
    }

    public double getPercentDifference() {
        return percentDifference;
    }

    public void setPercentDifference(double percentDifference) {
        this.percentDifference = percentDifference;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public int getCombindedFips() {
        return combindedFips;
    }

    public void setCombindedFips(int combindedFips) {
        this.combindedFips = combindedFips;
    }

}
