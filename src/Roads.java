import java.util.Scanner;

/**
 * Created by Dobr on 19.04.16.
 */
public class Roads {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] pas = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pas[i][j] = in.nextInt();
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i!=j) && (pas[i][j]+pas[j][i] > max)) {
                    max = pas[i][j]+pas[j][i];
                }
            }
        }

        System.out.println(max);
    }

}


//    KKFFAACO
//    KKFOOACO
//    XXXXOACO
//    XIIMOOOO
//    XIILLLLL
//    BBBBGGGG
//    BGJJJJJG
//    BGGGGGGG