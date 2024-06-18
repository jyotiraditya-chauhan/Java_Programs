public class MaxArrayElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6};
        int max = findMax(array);
        System.out.println("Maximum element: " + max);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
