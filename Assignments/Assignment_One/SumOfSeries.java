import java.util.Scanner;

public class SumOfSeries {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter number to sum: ");
        int sumThis = myScan.nextInt();
        
        addSum(sumThis);
        myScan.close();
    }

    public static void addSum(int series) {
        int sum = 0;

        while (series > 0) {
            sum += Math.pow(series, 2);
            series--;
        }
        System.out.println("series sum: " + sum);
    }
}