import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */

public class ElectronicsShop {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();
        String strings[] = string.split("\\s+");
        int s = Integer.parseInt(strings[0]);
        int n = Integer.parseInt(strings[1]);
        int m = Integer.parseInt(strings[2]);
        String nString = in.readLine();
        String nStrings[] = nString.split("\\s+");
        int nArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            nArray[i] = Integer.parseInt(nStrings[i]);
        }
        String mString = in.readLine();
        String mStrings[] = mString.split("\\s+");
        int mArray[] = new int[m];
        for (int i = 0; i < m; i++) {
            mArray[i] = Integer.parseInt(mStrings[i]);
        }
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < nArray[i] + mArray[j] && nArray[i] + mArray[j] <= s)
                    max = nArray[i] + mArray[j];
            }
        }
        System.out.println(max);
    }
}
