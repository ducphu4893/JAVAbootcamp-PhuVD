import java.util.Scanner;

public class giaiPTBac1 {
    public static void main(String[] args) {
        int a,b;
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("nhap b: ");
        b = sc.nextInt();
        System.out.println("Phuong trinh can giai la " + a + "x" + "+" + b + " = 0" );
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            x =(float) -b/a;
            System.out.println("Phuong trinh co nghiem " + x);
        }
    }
}
