import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for(int i=0;i < rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i < rows;i++){
            for(int j=0;j<columns;j++){
                System.out.printf("%-5d", arr[i][j]);
            }
        }
    }
}
