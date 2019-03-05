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
        for (int i = 1; i < lines.length; i++) {
            ElectionResults temp = parseLine(lines[i]);
            electionResults.add(temp);
        }
        return electionResults;
    }

    private static ElectionResults parseLine(String line) {
        line = line.replaceAll("\"", "");
        line = line.replace("%", "");
        String[] dataArray = line.split(",");
        return setElectionResults(dataArray);
    }

    private static ElectionResults setElectionResults(String dataArray[]) {
        int index = 0;
        int demVotes = (int) Double.parseDouble(dataArray[index + 1]);
        int gopVotes = (int) Double.parseDouble(dataArray[index + 2]);
        int totalVotes = (int) Double.parseDouble(dataArray[index + 3]);
        double percentDem = Double.parseDouble(dataArray[index + 4]);
        double percentGOP = Double.parseDouble(dataArray[index + 5]);
        index = fixDataIrregularities(dataArray);
        int votesDifference = (int) Double.parseDouble(dataArray[index + 6]);
        double percentDifference = Double.parseDouble(dataArray[index + 7]);
        String state = dataArray[index + 8];
        String county = dataArray[index + 9];
        int combinedFips = (int) Double.parseDouble(dataArray[index + 10]);
        return new ElectionResults(demVotes, gopVotes, totalVotes, percentDem, percentGOP, votesDifference, percentDifference, state, county, combinedFips);
    }

    private static int fixDataIrregularities(String[] dataArray) {
        int index = 0;
        if (dataArray.length >= 12) {
            int difference = dataArray.length - 11;
            for (int i = 0; i < difference; i++) {
                dataArray[6 + difference] = dataArray[6] + dataArray[6 + i];
            }
            index = difference;
        }
        return index;
    }
}
