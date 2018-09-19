import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter number: ");
        int factorialNum = myScan.nextInt();
        
        System.out.println("Factorial of given number: " + doFactorial(factorialNum));
        myScan.close();
    }

    public static int doFactorial(int factorialNum) {
        if (factorialNum <= 1) {
            return 1;
        } else {
            return factorialNum * doFactorial(factorialNum - 1);
        }
    }
}
