import java.util.Scanner;

public class V {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.next());

        s = rev(s, 1, 2);
        s = rev(s, 2, 3);
        s = rev(s, 3, 4);
        s = rev(s, 1, 2);
        s = rev(s, 3, 4);
        s = rev(s, 2, 3);
        s = rev(s, 1, 2);
        s = rev(s, 3, 4);
        s = rev(s, 1, 3);
        s = rev(s, 2, 3);
        s = rev(s, 1, 2);
        s = rev(s, 3, 4);
        s = rev(s, 1, 2);
        s = rev(s, 2, 3);
        s = rev(s, 1, 3);
        s = rev(s, 1, 2);
        s = rev(s, 2, 3);
        s = rev(s, 3, 4);
        s = rev(s, 1, 2);
        s = rev(s, 2, 3);
        s = rev(s, 1, 2);
        s = rev(s, 3, 4);
        s = rev(s, 2, 3);


        System.out.print(s);

    }

    private static StringBuilder rev(StringBuilder s, int a, int b) {
        s.insert(b-1, s.charAt(a-1));
        s.insert(a-1, s.charAt(b));
        s.deleteCharAt(a);
        s.deleteCharAt(b);
        return s;
    }
}
