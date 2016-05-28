import java.util.Scanner;



public class A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        int a,b,c,d;

        a = 8;
        b = (k-2)*12;
        c = (k-2)*(k-2)*6;
        d = (int)Math.pow(k-2, 3);

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}