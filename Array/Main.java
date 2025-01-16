import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Initializing arrays
        int[] array1 = new int[5];
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = new int[]{6, 7, 8, 9, 10};

        // Accessing elements
        System.out.println("\n - - - - - 1 - - - - - \n");
        System.out.println("First element of array2: " + array2[0]);

        // Modifying elements
        array2[0] = 10;
        System.out.println("\n - - - - - 2 - - - - - \n");
        System.out.println("Modified first element of array2: " + array2[0]);

        // Finding the length of an array
        System.out.println("\n - - - - - 3 - - - - - \n");
        System.out.println("Length of array2: " + array2.length);

        // Looping through an array
        System.out.println("\n - - - - - 4 - - - - - \n");
        System.out.println("Elements of array2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // Sum of all elements
        System.out.println("\n - - - - - 5 - - - - - \n");
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
        System.out.println("Sum of elements in array2: " + sum);


        // To print as List 
        String[] stringArray =  {"Aditya", "Raj", "Kumar"};
        int[] intArray = {2,4,6,8,10,12};
        int[] secondIntArray = {2,4,6,8,10,12};
        int searchValue = 10;
        
        System.out.println("\n - - - - - 6 - - - - - \n");
        System.out.print(Arrays.asList(stringArray));

        System.out.println("\n - - - - - 7 - - - - - ");
        // Binary Search
        System.out.print("Binary Search : " + Arrays.binarySearch(intArray, searchValue));
    
        System.out.println("\n - - - - - 8 - - - - - \n");
        // Compare Array
        System.out.print("Compare Search : " + Arrays.compare(intArray, secondIntArray));

        System.out.println("\n - - - - - 9 - - - - - \n");
        System.out.println("Converting Array : " + Arrays.toString(intArray));
        System.out.println("Copy of : " + Arrays.copyOf(secondIntArray, searchValue));


        System.out.println("\n - - - - - 10 - - - - - \n");
        

    }
}
