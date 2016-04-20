import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by Dobr on 15.04.16.
 */
public class Test {
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


            for (int i = 1; i <= 5; i++) {
                b = "0" + b;
            }

        System.out.print(b);
    }
}
