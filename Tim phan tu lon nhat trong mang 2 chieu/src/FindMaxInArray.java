import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        int row, column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        row = sc.nextInt();
        System.out.println("Enter column");
        column = sc.nextInt();
        //khai bao mang 2 chieu:
        int array[][] = new int[row][column];
        System.out.println("Enter element to array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Array[" + i + "][" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }
        //tim gia tri max
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max element in array is: " + max);
    }
}