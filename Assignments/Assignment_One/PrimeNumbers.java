import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter interval one: ");
        int intervalOne = myScan.nextInt();
        System.out.println("Enter interval two: ");
        int intervalTwo = myScan.nextInt();

        findPrimeNumbers(intervalOne, intervalTwo);
        myScan.close();
    }

    public static void findPrimeNumbers(int intervalOne, int intervalTwo) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        while (intervalTwo > intervalOne) {
            for (int i = 2; intervalOne >= i; i++) {
                if (intervalOne == 2) {
                    primeNumbers.add(intervalOne);
                }
                if (intervalOne % i == 0) {
                    break;
                } else {
                    if (i == intervalOne - 1) {
                        primeNumbers.add(intervalOne);
                    }
                }
            }
            intervalOne++;
        }
        System.out.println(primeNumbers);
    }
}