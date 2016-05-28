import java.util.Scanner;

/**
 * сделано 6 задач!
 */
public class Y {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        int okt = 1;
        int gr = 0;
        for (int i = 2; i<=k; i++) {
            gr += 6*3*(i-1);
        }


        gr = gr-(k-1)*6;
        System.out.println(gr);


    }
}



