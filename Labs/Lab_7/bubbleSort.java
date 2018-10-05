import java.util.Scanner;
import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int[] newArr = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Choose list item number " + i + " of 6:");
            newArr[i] = myScan.nextInt();
        }
        newArr = doSort(newArr);
        System.out.println("Sorted array: " + Arrays.toString(newArr));
        myScan.close();
    }

    public static int[] doSort(int arr[]) {
        boolean swapped = true;

        while (swapped == true) {
            swapped = false;
            for (int i = 0; arr.length - 1 > i; i++) {
                if (arr[i] > arr[i + 1]) {
                    swapped = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}