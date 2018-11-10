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