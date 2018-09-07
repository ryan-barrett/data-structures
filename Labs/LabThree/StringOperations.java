import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String firstString = myScan.nextLine();

        System.out.println("Enter second string: ");
        String secondString = myScan.nextLine();
        myScan.close();

        System.out.println("String one has length of: " + firstString.length());
        System.out.println("String two has length of: " + secondString.length());

        String combinedString = firstString + " " + secondString;
        System.out.println("The combined string is: " + combinedString);

        firstString = firstString.toUpperCase();
        secondString = secondString.toUpperCase();
        System.out.println("First string uppercase: " + firstString + " Second string uppercase: " + secondString);
    }
}
