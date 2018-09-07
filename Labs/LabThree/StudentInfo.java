import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class StudentInfo {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter file path: ");
        String filePath = myScan.nextLine();

        System.out.println("Enter student's name, ID, Address, GPA, and phone number: ");
        String textToAppend = myScan.nextLine();

        //append given info to target file
        try {
            Files.write(Paths.get(filePath), textToAppend.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error trying to append.");
        }
        myScan.close();

        //read each line and output text
        try {
            Scanner input = new Scanner(new File(filePath));
            while (input.hasNextLine()) {
                System.out.println("File contains: " + input.nextLine());
            }
            input.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}