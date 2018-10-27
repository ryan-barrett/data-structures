import java.util.*;

public class LinkedListOperations {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        LinkedList<Integer> myList = new LinkedList<Integer>();
        for (int i = 6; i >= 0; i--) {
            System.out.println("Enter item number " + i);
            myList.add(myScan.nextInt());
        }
        traverseList(myList);

        System.out.println("Enter number to search");
        listSearch(myList, myScan.nextInt());
        myScan.close();
    }

    public static void traverseList(LinkedList myList) {
        System.out.println("Traversing list: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i) + " is in position " + i);
        }
    }

    public static void listSearch(LinkedList myList, int target) {
        for (int i = 0; i < myList.size(); i++) {
            if ((int) (myList.get(i)) == target) {
                System.out.println("Target found at position " + i);
                return;
            }
        }
        System.out.println("Target not found.");
    }
}