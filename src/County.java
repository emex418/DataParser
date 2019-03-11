public class County {
    private String name, state;
    private int fips;
    private ElectionData election2016;
    private EducationData edu2016;
    private UnemploymentData unemployment2017;

    public County(String name, String state, int fips) {
        this.name = name;
        this.state = state;
        this.fips = fips;
        election2016 = parseElectionData("data\\2016_Presidential_Results.csv");
        edu2016 = parseEduData("data\\Education.csv");
        unemployment2017 = parseUnemploymentData("data\\Unemployment.csv");
    }

    private UnemploymentData parseUnemploymentData(String file) {
        String[] countyData = getCountyData(file);
        int laborForceSize = Integer.parseInt(countyData[countyData.length - 7]);
        int employed = Integer.parseInt(countyData[countyData.length - 6]);
        int unemployed = Integer.parseInt(countyData[countyData.length - 5]);
        double unemploymentRate = Double.parseDouble(countyData[countyData.length - 4]);
        return new UnemploymentData(laborForceSize, employed, unemployed, unemploymentRate);
    }

    private EducationData parseEduData(String file) {
        String[] countyData = getCountyData(file);
        double noHS = Double.parseDouble(countyData[countyData.length - 4]);
        double onlyHS = Double.parseDouble(countyData[countyData.length - 3]);
        double someCollege = Double.parseDouble(countyData[countyData.length - 2]);
        double bachelorsOrHigher = Double.parseDouble(countyData[countyData.length - 1]);
        return new EducationData(noHS, onlyHS, someCollege, bachelorsOrHigher);
    }

    private ElectionData parseElectionData(String file) {
        String[] countyData = getCountyData(file);

        int demVotes = Integer.parseInt(countyData[0]);
        int GOPVotes = Integer.parseInt(countyData[1]);
        int totalVotes = Integer.parseInt(countyData[2]);
        return new ElectionData(demVotes, GOPVotes, totalVotes);
    }

    private String[] getCountyData(String file) {
        String[] lines = file.split("\n");
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].indexOf(fips) != -1 && lines[i].indexOf(name) != -1) return lines[i].split(",");
            ;
        }

        System.out.println("No data for county " + name + " in " + file);
        return new String[]{"0", "0", "0", "0"};
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

    public EducationData getEdu2016() {
        return edu2016;
    }

    public void setEdu2016(EducationData edu2016) {
        this.edu2016 = edu2016;
    }

    public UnemploymentData getUnemployment2017() {
        return unemployment2017;
    }

    public void setUnemployment2017(UnemploymentData unemployment2016) {
        this.unemployment2017 = unemployment2016;
    }
}
