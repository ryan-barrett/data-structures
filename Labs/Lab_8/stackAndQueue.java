import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class stackAndQueue {

    public static void main(String[] args) {
        ArrayList<Integer> newArr = new ArrayList<Integer>(Arrays.asList(5, 7, 2, 1, 2));
        LinkedList<Integer> myList = new LinkedList<Integer>();

        arrayBasedStack(newArr);
        arrayBasedQueue(newArr);

        linkedListStack(myList);
        linkedListQueue(myList);
    }

    public static void arrayBasedStack(ArrayList arr) {
        System.out.println("Current stack: " + arr);
        arrayAdd(arr, true);
        arrayRemove(arr, true);
    }

    public static void arrayBasedQueue(ArrayList arr) {
        System.out.println("Current queue: " + arr);
        arrayAdd(arr, false);
        arrayRemove(arr, false);

    }

    public static void arrayRemove(ArrayList arr, boolean isStack) {
        if (isStack) {
            System.out.println(arr.get(arr.size() - 1) + "removed from the top of stack");
            arr.remove(arr.size() - 1);
            System.out.println("Current stack: " + arr);
        } else {
            System.out.println(arr.get(0) + " removed from the front of queue");
            arr.remove(0);
            System.out.println("Current queue: " + arr);
        }
    }

    public static void arrayAdd(ArrayList arr, boolean isStack) {
        if (isStack) {
            arr.add(4);
            System.out.println(arr.get(arr.size() - 1) + " added to the top of the stack");
            System.out.println("Current stack: " + arr);
        } else {
            arr.add(4);
            System.out.println(4 + " added to the back of queue");
            System.out.println("Current queue: " + arr);
        }
    }

    public static void linkedListStack(LinkedList myList) {
        myList.add(5);
        System.out.println("Current stack " + myList);
        linkedListAdd(myList, true);
        linkedListRemove(myList, true);
    }

    public static void linkedListQueue(LinkedList myList) {
        myList.add(3);
        System.out.println("Current queue " + myList);
        linkedListAdd(myList, false);
        linkedListRemove(myList, false);
    }

    public static void linkedListAdd(LinkedList myList, boolean isStack) {
        if (isStack) {
            myList.add(4);
            System.out.println(myList.getLast() + " added to stack");
            System.out.println("Current stack " + myList);
        } else {
            myList.add(6);
            System.out.println(myList.getLast() + " Added to queue!");
            System.out.println("Current queue " + myList);
        }
    }

    public static void linkedListRemove(LinkedList myList, boolean isStack) {
        if (isStack) {
            System.out.println(myList.getLast() + " removed from stack");
            myList.removeLast();
            System.out.println("Current stack: " + myList);
        } else {
            System.out.println(myList.getFirst() + " removed from front of queue");
            myList.removeFirst();
            System.out.println("Current queue: " + myList);
        }
    }
}