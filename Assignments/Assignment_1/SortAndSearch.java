import java.util.Scanner;
import java.util.Arrays;

public class SortAndSearch {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        int[] newArr = new int[5];
        System.out.println("Create an array of length 5");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter index " + i + ": ");
            newArr[i] = myScan.nextInt();
        }
        sort(newArr);

        System.out.println("Enter target value: ");
        int targetValue = myScan.nextInt();

        search(newArr, targetValue);
        myScan.close();
    }

    public static void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }

    public static void search(int[] arr, int targetValue) {
        boolean found = false;

        for (int i = 0; arr.length > i; i++) {
            if (arr[i] == targetValue) {
                found = true;
                System.out.println("Found target at index: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Target not found");
        }
    }
}
