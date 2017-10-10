import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */

public class BonAppetit {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();
        String strings[] = string.split("\\s+");
        int n = Integer.parseInt(strings[0]);
        int k = Integer.parseInt(strings[1]);
        String str = in.readLine();
        String strs[] = str.split("\\s+");
        int items[] = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = Integer.parseInt(strs[i]);
        }
        int payed = Integer.parseInt(in.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == k)
                continue;
            sum+= items[i];
        }
        int result = payed - sum / 2;
        if (result == 0)
            System.out.println("Bon Appetit");
        else
            System.out.println(result);
    }
}
