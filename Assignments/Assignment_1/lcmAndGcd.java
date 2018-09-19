import java.util.Scanner;

public class lcmAndGcd {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = myScan.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = myScan.nextInt();

        int currentGCD = getGCD(num1, num2);
        System.out.println("GCD: " + currentGCD);

        int currentLCM = getLCM(num1, num2, currentGCD);
        System.out.println("LCM: " + currentLCM);
        myScan.close();
    }

    public static int getLCM(int num1, int num2, int gcd) {
        return ((num1 * num2) / gcd);
    }

    public static int getGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGCD(num2, num1 % num2);
    }
}