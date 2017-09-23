import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/the-power-sum
 */

public class ThePowerSum {
    public static int powerSum(int x, int n, int s) {
        if (x - Math.pow(s, n) < 0)
            return 0;
        else if (x - Math.pow(s, n) == 0)
            return 1;
        else
            return powerSum((int)(x - Math.pow(s, n)), n, s + 1) + powerSum(x, n, s + 1);
        /*
        int sum = 0;
        while (x - (int)Math.pow(s, n) >= 0) {
            if (x - (int)Math.pow(s, n) == 0) {
                System.out.println("find value x : "+ x + ", n : "+ n+", s : "+ s);
                return sum + 1;
            }
            System.out.println("powerSum("+ (x - (int)Math.pow(s, n)) +", "+n+", " + s+"); called.");
            sum +=powerSum(x - (int)Math.pow(s, n), n, s + 1);
        }
        return sum;
        */
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        System.out.println(powerSum(x, n, 1));
    }
}
