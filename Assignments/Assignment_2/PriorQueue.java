import java.util.*;

public class PriorQueue {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter desired queue size: ");
        int queueSize = myScan.nextInt();
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(queueSize);

        for (int i = 0; i < queueSize; i++) {
            System.out.println("Enter item number " + (i + 1));
            pQueue = insertItem(myScan.nextInt(), pQueue);
        }
        System.out.println("Current queue: " + pQueue);

        System.out.println("Choose item to delete: ");
        int toBeDeleted = myScan.nextInt();
        pQueue = deleteItem(toBeDeleted, pQueue);
        System.out.println("Current queue: " + pQueue);

        System.out.println("Choose number to search: ");
        int targetNum = myScan.nextInt();
        myScan.close();

        if (searchQueue(targetNum, pQueue) == 1) {
            System.out.println("Queue contains item " + targetNum);
        } else {
            System.out.println("Queue does not contain item " + targetNum);
        }
    }

    public static PriorityQueue insertItem(int item, PriorityQueue myQueue) {
        myQueue.add(item);
        return myQueue;
    }

    public static PriorityQueue deleteItem(int item, PriorityQueue myQueue) {
        myQueue.remove(item);
        return myQueue;
    }

    public static int searchQueue(int item, PriorityQueue myQueue) {
        if (myQueue.contains(item)) {
            return 1;
        }
        return -1;
    }
}