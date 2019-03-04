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

}
