import java.util.Scanner;

/**
 * Created by Dobr on 19.04.16.
 */
public class ABC {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        if ((a>b) && (a>c))  {
            System.out.println(a);
        } else if ((c>a) && (c>b)) {
            System.out.println(c);
        } else if ((b>a) && (b>c)){
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
