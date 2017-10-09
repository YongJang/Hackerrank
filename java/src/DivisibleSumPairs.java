import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */

public class DivisibleSumPairs {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();
        String strings[] = string.split("\\s+");
        int n = Integer.parseInt(strings[0]);
        int k = Integer.parseInt(strings[1]);
        String str = in.readLine();
        String strs[] = str.split("\\s+");
        int numbers[] = new int[strs.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((numbers[i] + numbers[j]) % k == 0)
                    result++;
            }
        }
        System.out.println(result);
    }
}
