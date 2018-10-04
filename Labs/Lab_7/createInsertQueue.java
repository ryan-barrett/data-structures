import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class createInsertQueue {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter item to be added to queue: ");
        int toBeQueued = myScan.nextInt();
        System.out.println("Elements of queue: " + createAndInsert(toBeQueued));
        myScan.close();
    }

    public static Queue createAndInsert(int item) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(item);
        return myQueue;
    }
}