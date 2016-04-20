import java.util.Scanner;

/**
 * Created by Dobr on 19.04.16.
 */
public class Box {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }

        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (i == arr[i]) {
                counter++;
                arr[i] = -1;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (-1 != arr[i]) {
                counter++;
                Boolean flag = true;
                int r, t = i;
                while (flag) {
                    if (-1 == arr[t]) {
                        flag = false;
                    } else {
                        r = arr[t];
                        arr[t] = -1;
                        t = arr[r];
                    }
                }
            }
        }

        System.out.println(counter);

    }
}
