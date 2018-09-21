import java.util.Scanner;
import java.util.Arrays; 

public class InsertionSort {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int[] toBeSearched = new int[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter int " + i + " of 6");
            toBeSearched[i] = myScan.nextInt();
        }
        myScan.close();
        System.out.println("Original array: " + Arrays.toString(toBeSearched));
        insertionSort(toBeSearched);
    
    }
    
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++ ) {
            if (arr[i] < arr[i-1]) {
                int temp = arr[i];
                int targetPosition = -1;
                
                for (int j = i - 1; j >= 0; j--){
                    if (arr[i] < arr[j]) {
                       targetPosition = j;
                    }
                }
                
                if (targetPosition != -1) {
                    for (int k = i; k > targetPosition; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[targetPosition] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}