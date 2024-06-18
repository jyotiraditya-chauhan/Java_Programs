
public class LargetsElementArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6};
        int secondLargest = findSecondLargest(array);
        System.out.println("Second largest element: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
}
