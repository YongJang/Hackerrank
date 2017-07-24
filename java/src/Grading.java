import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/grading
 */
public class Grading {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        int n;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(in.readLine());
            grading(n);
        }
    }

    public static void grading(int n) {
        int reminder = n % 5;
        int quotient = n / 5;
        int result = n;

        if (n > 37) {
            if (reminder >= 3) {
                result = (quotient + 1) * 5;
            }
        }
        System.out.println(result);
    }
}
