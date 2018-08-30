import java.util.ArrayList;

public class LabTwo {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        modifyArray(newArr, 4);
        System.out.println(newArr);
        
        int newArrTwo[] = {1,2,3,4,5,6,7,8,9,10};
        linearSearch(newArrTwo, 5); 
    }  
    
    //add and remove elements from an array
    public static void modifyArray(ArrayList<Integer> arr, int toBeAdded) {
       arr.add(toBeAdded);
       System.out.println(toBeAdded + " added to array"+ arr);
       arr.remove(0);
       System.out.println("First element removed from array. Current array: " + arr);   
    }
    
    //search for a target value and print the index of the value
    public static void linearSearch(int[] arr, int targetValue) {
        int foundIndex = -1;
        
        for (int i = 0; arr.length > i; i++) {
            if (arr[i] == targetValue) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex > -1) {
            System.out.println("Target value found at index: " + foundIndex);
        }
        else {
            System.out.println("Target value not found");
        }
    }
}
