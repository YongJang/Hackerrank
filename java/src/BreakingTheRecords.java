import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 */

public class BreakingTheRecords {
    public static void main(String args[]) throws Exception{ new BreakingTheRecords().run(); }

    public void run() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        String string = in.readLine();
        String strs[] = string.split("\\s+");
        int scores[] = new int[strs.length];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(strs[i]);
        }
        int minCount = 0;
        int maxCount = 0;
        int min = scores[0];
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (min > scores[i]) {
                minCount++;
                min = scores[i];
            } else if(max < scores[i]) {
                maxCount++;
                max = scores[i];
            }
        }
        System.out.println(maxCount + " " + minCount);
    }
}
