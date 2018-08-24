public class LabOne {

    public static void main(String[] args) {
        calcSeries(5);

        int newArr[] = { 1, 2, 3, 4, 5 };
        largestSmallest(newArr);

    }

    //find the sum of a series
    public static void calcSeries(int series) {
        int sum = 0;

        while (series > 0) {
            sum += Math.pow(series, 2);
            series--;
        }
        System.out.println("series sum: " + sum);
    }

    //find the largest and smallest values in an array of ints
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