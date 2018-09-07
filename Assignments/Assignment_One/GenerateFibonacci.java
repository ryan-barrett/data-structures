import java.util.Scanner;
import java.util.ArrayList;

public class GenerateFibonacci {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int startSeries = myScan.nextInt();
        
        System.out.println("Enter ending number: ");
        int endSeries = myScan.nextInt();

        createFibSeries(startSeries, endSeries);
        myScan.close();
    }

    public static void createFibSeries(int start, int end) {
        ArrayList<Integer> fibArr = new ArrayList<Integer>();
        int first = 0;
        int second = 1;
        int third = 1;

        while (first <= end) {
            if (first >= start) {
                fibArr.add(first);
            }

            first = second;
            second = third;
            third = first + second;
        }

        System.out.println("Generated Fibonacci series: " + fibArr);
    }
}