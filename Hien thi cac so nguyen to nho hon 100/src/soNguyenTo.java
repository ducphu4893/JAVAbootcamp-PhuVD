public class soNguyenTo {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to < 100: ");
        for (int i = 2; i <= 100; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean check(int a) {
        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a);i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}