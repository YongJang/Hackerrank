
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/apple-and-orange
 */

public class AppleAndOrange {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = in.readLine();
        String first[] = firstLine.split("\\s+");
        int s = Integer.parseInt(first[0]);
        int t = Integer.parseInt(first[1]);
        String secondLine = in.readLine();
        String second[] = secondLine.split("\\s+");
        int a = Integer.parseInt(second[0]);
        int b = Integer.parseInt(second[1]);
        String thirdLine = in.readLine();
        String third[] = thirdLine.split("\\s+");
        int m = Integer.parseInt(third[0]);
        int n = Integer.parseInt(third[1]);

        int apple = 0;
        int orange = 0;

        String appleStr = in.readLine();
        String appleArray[] = appleStr.split("\\s+");

        String orangeStr = in.readLine();
        String orangeArray[] = orangeStr.split("\\s+");

        for (int i = 0; i < m; i++) {
            int d = Integer.parseInt(appleArray[i]);
            if (a + d >= s && a + d <= t)
                apple++;
        }
        for (int i = 0; i < n; i++) {
            int d = Integer.parseInt(orangeArray[i]);
            if (b + d <= t && b + d >= s)
                orange++;
        }

        System.out.println(apple);
        System.out.println(orange);
    }
}
