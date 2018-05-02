import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */

public class DesignerPDFViewer {
    private final static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        String heightSizesLine = in.readLine();
        String heightSizesString[] = heightSizesLine.split("\\s+");

        int heightSizes[] = new int[26];

        for (int i = 0; i < heightSizes.length; i++) {
            heightSizes[i] = Integer.parseInt(heightSizesString[i]);
        }

        String string = in.readLine();

        int max = heightSizes[string.charAt(0) - 97];

        for (int i = 1; i < string.length(); i++) {
            if (max < heightSizes[string.charAt(i) - 97]) {
                max = heightSizes[string.charAt(i) - 97];
            }
        }
        System.out.println(string.length() * max);
    }
}
