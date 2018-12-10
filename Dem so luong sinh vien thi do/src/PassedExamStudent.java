import java.util.Scanner;

public class PassedExamStudent {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if(size>30){
                System.out.println("Invalid");
            }
        }while(size>30);
        //Nhap gia tri cho mang
        array = new int[size];
        for(int i = 0;i<array.length;i++){
            System.out.println("Mark of student " + (i+1));
            array[i] = sc.nextInt();
        }
        //In ra danh sach va sinh vien thi do
        int count = 0;
        System.out.println("List of mark: ");
        for(int j = 0;j<array.length;j++){
            System.out.println(array[j] + "\t");
            if(array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println("\n The number of students passing the exam is " + count);
    }
}
