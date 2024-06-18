public class Main {
    public static void main(String[] args) {
        // Initializing arrays
        int[] array1 = new int[5];
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = new int[]{6, 7, 8, 9, 10};

        // Accessing elements
        System.out.println("First element of array2: " + array2[0]);

        // Modifying elements
        array2[0] = 10;
        System.out.println("Modified first element of array2: " + array2[0]);

        // Finding the length of an array
        System.out.println("Length of array2: " + array2.length);

        // Looping through an array
        System.out.println("Elements of array2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // Sum of all elements
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
        System.out.println("Sum of elements in array2: " + sum);
    }
}
