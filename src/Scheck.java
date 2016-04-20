import java.util.Scanner;

public class Scheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[][] map = new int[n][arr[0]];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i]; j++) {
                map[i][j] = 1;
            }
        }

        System.out.println(arr[0]);

        for (int j = 0; j < arr[0]; j++) {
            int counter = 0;
            for (int i = 0; i < n; i++) {
                if (map[i][j] == 1) {
                    counter++;
                }
            }
            System.out.print(counter + " ");
        }
    }
}
