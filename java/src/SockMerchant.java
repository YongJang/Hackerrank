import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */

public class SockMerchant {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String string = in.readLine();
        String strings[] = string.split("\\s+");
        int colors[] = new int[101];
        int result = 0;
        for (int i = 0; i < n; i++) {
            colors[Integer.parseInt(strings[i])]++;
        }
        for (int i = 0; i < 101; i++) {
            result+= (colors[i] / 2);
        }
        System.out.println(result);
    }
}
