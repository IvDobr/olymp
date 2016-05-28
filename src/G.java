import java.util.Scanner;


public class G {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();

        String b = new StringBuffer(str).reverse().toString();

        char[] ch = b.toCharArray();

        for (int i = 0; i<ch.length; i++) {
            if (')' == ch[i]) {
                ch[i] = '(';
            } else {
                ch[i] = ')';
            }
        }

        System.out.println(ch);
    }
}
