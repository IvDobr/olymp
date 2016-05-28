import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (0 == a) {
            System.out.println("no");
        } else {
            if (0 == b % a) {
                int ct = b / a - 1;
                if ((ct >= 0) && (ct != 0)) {
                    System.out.println(ct);
                } else {
                    System.out.println("no");
                }
            } else {
                System.out.println("no");
            }
        }
    }
}
