import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Compare {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        String a = "", b = "";
        try {
            a = br.readLine();
            b = br.readLine();
        } catch (IOException ex) {
            pw.println("Reading error");
        }

        int len_a = a.length();
        int len_b = b.length();

        StringBuilder s = new StringBuilder();
        if (len_a > len_b) {
            for (int i = 1; i <= len_a-len_b; i++) {
                s.append("0");
            }
            b = s.toString() + b;
        } else {
            for (int i = 1; i <= len_b-len_a; i++) {
                s.append("0");
            }
            a = s.toString() + a;
        }

        String status = "=";

        for (int i = 0; i <= a.length() - 1; i++) {
            if (a.charAt(i) < b.charAt(i)) {
                status = "<";
                break;
            } else if (a.charAt(i) > b.charAt(i)) {
                status = ">";
                break;
            }
        }

        pw.println(status);
    }
}
