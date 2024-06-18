
public class MinArrayElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6};
        int min = findMin(array);
        System.out.println("Minimum element: " + min);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
