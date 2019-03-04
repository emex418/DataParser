import java.util.ArrayList;

/*
Main method for Data Parser
Author: Elizabeth Eckes 2019
 */
public class Main {
    public static void main(String[] args) {
        String data = Utils.readFileAsString("data\\2016_Presidential_Results.csv");
        ArrayList<ElectionResults> results = Utils.parse2016ElectionResults(data);
        for(ElectionResults r : results){
            r.toString();
        }

    }
}
