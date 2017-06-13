import java.io.*;

/**
 * Created by USER on 2016-12-18.
 */
public class CircularArrayRotation {
    public static void main (String arsgs[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = in.readLine();
        String firstSplit[] = firstLine.split("\\s");
        int n = Integer.parseInt(firstSplit[0]);
        int k = Integer.parseInt(firstSplit[1]);
        int q = Integer.parseInt(firstSplit[2]);

        int numberArray[] = new int[n];
        String secondLine = in.readLine();
        String secondSplit[] = secondLine.split("\\s");
        for (int i = 0; i < secondSplit.length; i++) {
            numberArray[i] = Integer.parseInt(secondSplit[i]);
        }

        k = k % n;

        for(int i = 0; i < q; i++) {
            int index = Integer.parseInt(in.readLine());
            index = (index + n - k) % n;
            System.out.println(numberArray[index]);
        }
    }
}
