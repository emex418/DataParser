import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResults> parse2016ElectionResults(String data) {
        ArrayList<ElectionResults> electionResults = new ArrayList<>();
        String[] lines = data.split("\n");
        for (int i =  1; i < lines.length; i++) {
            ElectionResults temp = parseLine(lines[i]);
            electionResults.add(temp);
        }
        return electionResults;
    }

    private static ElectionResults parseLine(String line) {
        //TODO: change from a brute force solution to a simpler solution - loop solution
        ElectionResults electionResults = new ElectionResults(0, 0, 0, 0, 0, 0, 0, "", "", 0);
        String[] columns = line.split(",");
//        electionResults.setDemVotes((int)Double.parseDouble(columns[1]));
//        electionResults.setGopVotes((int)Double.parseDouble(columns[2]));
//        electionResults.setTotalVotes((int)Double.parseDouble(columns[3]));
//        electionResults.setPercentDem(Double.parseDouble(columns[4]));
//        electionResults.setPercentGOP(Double.parseDouble(columns[5]));
//        int votesDifference = (int)Double.parseDouble(columns[6].substring(1) + columns[7].substring(0,columns[7].length()-1));
//        electionResults.setVotesDifference(votesDifference);
//        electionResults.setPercentDifference(Double.parseDouble(columns[8].substring(0, columns[8].length()-1)));
//        electionResults.setState(columns[9]);
//        electionResults.setCounty(columns[10]);
//        electionResults.setCombindedFips(Integer.parseInt(columns[11]));
        return electionResults;
    }
}
