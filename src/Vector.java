import java.util.ArrayList;
import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) { arr.add(in.nextInt()); }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            ans.add(arr.get(i));
            if ((i+1 < n) && ( gcd(arr.get(i), arr.get(i+1)) > 1 )) {
                ans.add(1);
            }
        }

        System.out.println(ans.size() - n);

        for (int i = 0; i < ans.size(); i++) { System.out.print(ans.get(i) + " "); }

    }

    private static int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }
}