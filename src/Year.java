import java.util.Scanner;

public class Year {

    public static void main(String[] args) {
        int input, a, b, c, d;
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        for (int i = input + 1; i <= 9012; i++) {
            a = i % 10;
            b = i/10 % 10;
            c = i/100 % 10;
            d = i/1000 % 10;

            if ((a != b) && (a != c) && (a != d) && (b != c) && (b != d) && (c != d)) {
                System.out.print(i);
                break;
            }
        }
    }
}