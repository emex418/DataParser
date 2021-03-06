import java.util.ArrayList;

public class State {
    private String name;
    private ArrayList<County> counties;

    public State(String name){
        this.name = name;
        counties = getCountiesFromData("data\\2016_Presidential_Results.csv");
    }

    private ArrayList<County> getCountiesFromData(String file) {
        ArrayList<County> counties = new ArrayList<>();
        String[] dataLines = file.split("\n");
        for (int i = 0; i < dataLines.length; i++) {
            String[] vars = dataLines[i].split(",");
            County c = new County(vars[vars.length-2], name, Integer.parseInt(vars[vars.length-1]));
            counties.add(c);
        }
        return counties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<County> getCounties() {
        return counties;
    }

    public void setCounties(ArrayList<County> counties) {
        this.counties = counties;
    }
}
