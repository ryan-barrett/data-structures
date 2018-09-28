import java.util.Scanner;
import java.util.Arrays;

public class selectionSortBinarySearch {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int[] newArr = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Choose list item number " + i + " of 6:");
            newArr[i] = myScan.nextInt();
        }
        newArr = selectionSort(newArr);
        System.out.println("Sorted array: " + Arrays.toString(newArr));

        System.out.println("Choose value to search for in sorted array: ");
        int targetValue = myScan.nextInt();
        myScan.close();

        int foundIndex = binarySearch(newArr, targetValue, 0, newArr.length - 1);
        if (foundIndex != -1) {
            System.out.println("Target found at index: " + foundIndex);
        } else {
            System.out.println("Target not found.");
        }
    }

    public static int[] selectionSort(int arr[]) {
        for (int i = 0; arr.length > i; i++) {
            for (int j = i + 1; arr.length > j; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int binarySearch(int sortedArr[], int target, int low, int high) {
        int middleIndex = Math.round((high - low) / 2);

        if (sortedArr[middleIndex] == target) {
            return middleIndex;
        } else if (middleIndex == 0 || middleIndex == 1) {
            if (sortedArr[high] == target) {
                return high;
            } else if (sortedArr[low] == target) {
                return low;
            } else if (sortedArr[low + 1] == target) {
                return low + 1;
            }
            return -1;
        } else if (sortedArr[middleIndex] > target) {
            low = 0;
            high = middleIndex - 1;
            return binarySearch(sortedArr, target, low, high);
        } else if (sortedArr[middleIndex] < target) {
            low = middleIndex + 1;
            high = sortedArr.length - 1;
            return binarySearch(sortedArr, target, low, high);
        }
        return -1;
    }
}