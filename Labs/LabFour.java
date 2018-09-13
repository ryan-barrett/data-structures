import java.util.ArrayList;

public class LabFour {

    public static void main(String[] args) {

        String T = "absdfgadfgsdftghsd";
        System.out.println("Modified text: " + findAndReplace(T));

        String secondT = "abacdfjhabcdahhabacfhabacjy";
        System.out.println("Locations where the pattern exists: " + matchCountAlgo(secondT));
    }

    // find and replace every occurrence of "sdf" with "rst"
    public static String findAndReplace(String text) {
        text = text.replaceAll("sdf", "rst");
        return text;
    }

    // check for string matches and identify where they exist
    public static ArrayList<String> matchCountAlgo(String text) {
        String[] arr = { "a", "b", "a", "c" };
        String[] textArray = text.split("");
        ArrayList<String> storedLocations = new ArrayList<String>();

        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == arr.length - 1) {
                    storedLocations.add("At index: " + Integer.toString(i - 3) + "-" + Integer.toString(i));
                } else if (textArray[i].equals(arr[j])) {
                    i++;
                } else {
                    break;
                }
            }
        }
        return storedLocations;
    }
}