public class GreatestSmallestArrayItem {

    public static void main(String[] args) {
        int newArr[] = { 1, 2, 3, 4, 5 };
        largestSmallest(newArr);

    }

    // find the largest and smallest values in an array of ints
    public static void largestSmallest(int[] arr) {
        int largest = 0;
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("largest: " + largest);
        System.out.println("smallest: " + smallest);
    }
}