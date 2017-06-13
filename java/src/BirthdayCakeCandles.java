import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017-06-12.
 */
public class BirthdayCakeCandles {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String strs[] = br.readLine().split("\\s+");
        int candlesHeight[] = new int[strs.length];
        for (int i = 0; i < candlesHeight.length; i++) {
            candlesHeight[i] = Integer.parseInt(strs[i]);
        }
        int max = candlesHeight[0];
        int maxCount = 0;
        for (int i = 0; i < candlesHeight.length; i++) {
            if (max == candlesHeight[i])
                maxCount++;
            if (max < candlesHeight[i]) {
                max = candlesHeight[i];
                maxCount = 1;
            }
        }
        System.out.println(maxCount);
    }
}
