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
        int factorial = factorialNum;

        for (int i = 1; factorialNum > i; i++) {
            factorial *= i;
        }
        return factorial;
    }
}