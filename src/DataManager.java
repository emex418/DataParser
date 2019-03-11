import java.util.ArrayList;

public class DataManager {
    private static ArrayList<State> states;

    public static void main(String[] args) {
        states = getAllStates("data\\Education.csv");
    }

    private static ArrayList<State> getAllStates(String file) {
        ArrayList<State> states = new ArrayList<>();
        String[] counties = file.split("\n");
        states.add(new State("AL"));
        for (int i = 7; i < counties.length; i++) {
            String[] variables = counties[i].split(",");
            String lastState = states.get(states.size()-1).getName();
            if (variables[1].equals(lastState)) states.add(new State(variables[1]));
        }
        return states;
    }
}
