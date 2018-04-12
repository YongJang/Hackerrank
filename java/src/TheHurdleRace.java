import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */

public class TheHurdleRace {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String strs[] = str.split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);
        str = in.readLine();
        strs = str.split("\\s+");
        int max = Integer.parseInt(strs[0]);
        for(int i = 0; i < n; i++) {
            if(Integer.parseInt(strs[i]) > max) {
                max = Integer.parseInt(strs[i]);
            }
        }
        int result = 0;
        if(max > k) {
            result = max - k;
        }
        System.out.println(result);
    }
}
