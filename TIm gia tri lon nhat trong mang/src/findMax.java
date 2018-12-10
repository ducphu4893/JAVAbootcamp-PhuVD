import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size");
        size = sc.nextInt();
        if(size > 20){
            System.out.println("Error");
        }
        array = new int[size];
        for(int i = 0;i<array.length;i++){
            System.out.println("Enter a element " + (i+1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.println("List: ");
        for(int j = 0; j<array.length;j++){
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for(int j = 0;j<array.length;j++){
            if(array[j]>array[0]){
                max = array[j];
                index = j +1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " at position " + index);
    }
}
