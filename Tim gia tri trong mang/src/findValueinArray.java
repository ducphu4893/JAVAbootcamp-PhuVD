import java.util.Scanner;

public class findValueinArray {
    public static void main(String[] args) {
        String[] student = {"phu","truyen","hung","trung","nhat anh","duc","lam anh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student'name: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for(int i = 0; i < student.length;i++) {
            if (student[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("NOt found");
        }
    }
}
