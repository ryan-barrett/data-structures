import java.util.Scanner;

public class CheckIntPalindrome {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter number: ");
        int potentialPalindrome = myScan.nextInt();

        System.out.println("True or False, is this a palindrome?: " + checkIfPalindrome(potentialPalindrome));
        myScan.close();
    }

    public static boolean checkIfPalindrome(int num) {
        String reverseString = new StringBuilder(Integer.toString(num)).reverse().toString();
        if (Integer.parseInt(reverseString) == num) {
            return true;
        } else {
            return false;
        }
    }
}