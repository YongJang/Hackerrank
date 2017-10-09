import java.io.IOException;
import java.util.Scanner;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */

public class MigratoryBirds {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flocks[] = new int[n];
        for (int i = 0; i < n; i++) {
            flocks[sc.nextInt() - 1]++;
        }
        int max = flocks[0];
        int maxIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (max < flocks[i]) {
                max = flocks[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex + 1);
    }
}
