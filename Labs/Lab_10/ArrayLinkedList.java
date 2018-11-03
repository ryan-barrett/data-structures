import java.util.*;

public class ArrayLinkedList {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String[][] objArray = new String[6][];

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter item " + (i + 1));
            // [Item, currentNode, nextNode]
            String[] tempArray = { myScan.nextLine(), Integer.toString(i), Integer.toString(i + 1) };
            objArray[i] = tempArray;
        }

        System.out.println("Enter new item to add to start: ");
        String[] tempArray = { myScan.nextLine(), "0", "1" };
        objArray = insertAtStart(objArray, tempArray);

        System.out.println("Current list: ");
        System.out.println("[item, currentNode, nextNode]");
        for (int i = 0; i < objArray.length; i++) {
            System.out.println(Arrays.toString(objArray[i]));
        }

        System.out.println("Enter node after which to enter new item: ");
        String targetString = myScan.nextLine();
        System.out.println("Enter new item to add: ");
        String[] tempArrayTwo = { myScan.nextLine(), "0", "1" };
        objArray = insertAfterNode(objArray, tempArrayTwo, targetString);

        System.out.println("Current list: ");
        System.out.println("[item, currentNode, nextNode]");
        for (int i = 0; i < objArray.length; i++) {
            System.out.println(Arrays.toString(objArray[i]));
        }
        myScan.close();
    }

    public static String[][] insertAtStart(String[][] arr, String[] item) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][1]);
            if (arr[i][1].trim().equals("0")) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j][1] = Integer.toString(Integer.parseInt(arr[j][1]) + 1);
                    arr[j][2] = Integer.toString(Integer.parseInt(arr[j][2]) + 1);
                }
                String[][] newArr = new String[arr.length + 1][];
                System.arraycopy(arr, 0, newArr, 0, arr.length);
                newArr[newArr.length - 1] = item;
                return newArr;
            }
        }
        return arr;
    }

    public static String[][] insertAfterNode(String[][] arr, String[] item, String theNode) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1].trim().equals(theNode)) {
                item[1] = Integer.toString(Integer.parseInt(arr[i][1]) + 1);
                item[2] = Integer.toString(Integer.parseInt(arr[i][2]) + 1);
                for (int j = 0; j < arr.length; j++) {
                    if (Integer.parseInt(arr[j][1]) <= Integer.parseInt(theNode)) {
                        continue;
                    }
                    arr[j][1] = Integer.toString(Integer.parseInt(arr[j][1]) + 1);
                    arr[j][2] = Integer.toString(Integer.parseInt(arr[j][2]) + 1);
                }
                String[][] newArr = new String[arr.length + 1][];
                System.arraycopy(arr, 0, newArr, 0, arr.length);
                newArr[newArr.length - 1] = item;
                return newArr;
            }
        }
        return arr;
    }
}