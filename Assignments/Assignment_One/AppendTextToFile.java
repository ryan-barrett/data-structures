import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendTextToFile {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter file path: ");
        String filePath = myScan.nextLine();
        System.out.println("Enter text to append: ");
        String textToAppend = myScan.nextLine();

        try {
            Files.write(Paths.get(filePath), textToAppend.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error trying to append.");
        }
        myScan.close();
    }
}