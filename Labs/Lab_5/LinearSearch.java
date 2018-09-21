import java.util.Scanner;
import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        ArrayList<Integer> newArr = new ArrayList<Integer>();

        for (int i = 1; i < 7; i++) {
            System.out.println("Choose list item number " + i + " of 6:");
            newArr.add(myScan.nextInt());
        }

        System.out.println("Enter item to be searched: ");
        int itemToBeSearched = myScan.nextInt();
        myScan.close();

        linearSearch(newArr, itemToBeSearched);

    }

    public static void linearSearch(ArrayList<Integer> arr, int target) {
        for (int i = 0; arr.size() > i; i++) {
            if (arr.get(i) == target) {
                System.out.println("Item found at index " + i);
                break;
            }
        }
    }
}