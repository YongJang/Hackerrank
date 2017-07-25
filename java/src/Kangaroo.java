import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/kangaroo
 */

public class Kangaroo {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        String split[] = line.split("\\s+");
        int x1 = Integer.parseInt(split[0]);
        int v1 = Integer.parseInt(split[1]);
        int x2 = Integer.parseInt(split[2]);
        int v2 = Integer.parseInt(split[3]);
        String result = "NO";
        if (v1 <= v2) {
            System.out.println(result);
            return;
        }

        while (true) {
            if (x1 >= x2)
                break;
            x1 = x1 + v1;
            x2 = x2 + v2;
            if (x1 == x2) {
                result = "YES";
                break;
            }
        }

        System.out.println(result);
    }
}
