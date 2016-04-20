import java.util.Scanner;

/**
 * Created by Dobr on 19.04.16.
 */
public class Graph {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        char[][] map = new char[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = in.next().toCharArray();
        }


    }
}
