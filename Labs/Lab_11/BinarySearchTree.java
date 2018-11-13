import java.util.*;

public class BinarySearchTree {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter value for root node: ");
        Node root = new Node(myScan.nextInt());

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter value tree item number " + (i + 1));
            int temp = myScan.nextInt();
            findSpot(root, temp);
        }
        myScan.close();

        System.out.println("Tree traversal: [" + preOrderTraversalRight(root) + preOrderTraversalLeft(root) + "]");
    }

    public static void findSpot(Node theNode, int toBeInserted) {
        if (theNode.data < toBeInserted) {
            if (theNode.right == null) {
                theNode.right = new Node(toBeInserted);
            } else {
                findSpot(theNode.right, toBeInserted);
            }
        } else {
            if (theNode.left == null) {
                theNode.left = new Node(toBeInserted);
            } else {
                findSpot(theNode.left, toBeInserted);
            }
        }
    }

    public static ArrayList preOrderTraversalRight(Node currentNode) {
        ArrayList<Node> newArr = new ArrayList<Node>();

        if (currentNode.right != null) {
            newArr.add(currentNode.right);
            preOrderTraversalRight(currentNode.right);
        }
        return newArr;
    }

    public static ArrayList preOrderTraversalLeft(Node currentNode) {
        ArrayList<Node> newArr = new ArrayList<Node>();

        if (currentNode.left != null) {
            newArr.add(currentNode.left);
            preOrderTraversalRight(currentNode.left);
        }
        return newArr;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return Integer.toString(data);
    }
}