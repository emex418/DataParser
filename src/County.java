public class County {
    private String name, state;
    private ElectionData election2016;
    private EducationalAttainment edu2016;
    private Unemployent unemployment2016;

    public County(String name, String state){
        this.name = name;
        this.state = state;
        election2016 = parseElectionData();
        edu2016 = parseEduData();
        unemployment2016 = parseUnemplymentData();
    }

    private Unemployent parseUnemplymentData() {
        //TODO: fill method
        return new Unemployent(0,0,0,0);
    }

    private EducationalAttainment parseEduData() {
        //TODO: fill method
        return new EducationalAttainment(0,0,0,0);
    }

    private ElectionData parseElectionData() {
        //TODO: fill method
        return new ElectionData(0,0,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ElectionData getElection2016() {
        return election2016;
    }

    public void setElection2016(ElectionData election2016) {
        this.election2016 = election2016;
    }

    public EducationalAttainment getEdu2016() {
        return edu2016;
    }

    public void setEdu2016(EducationalAttainment edu2016) {
        this.edu2016 = edu2016;
    }

    public Unemployent getUnemployment2016() {
        return unemployment2016;
    }

    public void setUnemployment2016(Unemployent unemployment2016) {
        this.unemployment2016 = unemployment2016;
    }
}
