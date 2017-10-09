import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 */
public class CompareTheTriplets {
    public static void main (String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String aString = in.readLine();
        String bString = in.readLine();
        String aSplit[] = aString.split("\\s");
        String bSplit[] = bString.split("\\s");
        int sumA, sumB;
        sumA = sumB = 0;

        for (int i = 0; i < aSplit.length; i++) {
            if (Integer.parseInt(aSplit[i]) > Integer.parseInt(bSplit[i])) {
                sumA++;
            } else if (Integer.parseInt(aSplit[i]) < Integer.parseInt(bSplit[i])) {
                sumB++;
            }
        }

        System.out.printf("%d %d\n", sumA, sumB);
    }
}
