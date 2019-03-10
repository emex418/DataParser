public class ElectionData {
    int demVotes, GOPVotes, totalVotes;

    public ElectionData(int demVotes, int GOPVotes, int totalVotes) {
        this.demVotes = demVotes;
        this.GOPVotes = GOPVotes;
        this.totalVotes = totalVotes;
    }

    public int getDemVotes() {
        return demVotes;
    }

    public void setDemVotes(int demVotes) {
        this.demVotes = demVotes;
    }

    public int getGOPVotes() {
        return GOPVotes;
    }

    public void setGOPVotes(int GOPVotes) {
        this.GOPVotes = GOPVotes;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    @Override
    public String toString() {
        return "ElectionData{" +
                "demVotes=" + demVotes +
                ", GOPVotes=" + GOPVotes +
                ", totalVotes=" + totalVotes +
                '}';
    }
}
