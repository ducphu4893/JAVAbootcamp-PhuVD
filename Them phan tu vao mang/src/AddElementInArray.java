import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        //nhap index
        System.out.println("Enter index");
        int index = sc.nextInt();
        if (index < 0 && index > array.length - 1) {
            System.out.println("Index is not valid");
        } else {
            array[index] = num;
        }
        for(int i= 0;i < array.length;i++){
            System.out.println("Element" + (i+1) + ":");
            array[i] = sc.nextInt();
        }
        for (int i1 : array) {
            System.out.print(i1 + "\t");
        }
    }
}
