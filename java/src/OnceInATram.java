import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/contests/w34/challenges/once-in-a-tram
 */


public class OnceInATram {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        int number = Integer.parseInt(str) + 1;
        String frontStr = String.valueOf(number).substring(0, 3);
        String backStr = String.valueOf(number).substring(3, 6);

        int n1 = Integer.parseInt(frontStr.substring(0, 1));
        int n2 = Integer.parseInt(frontStr.substring(1, 2));
        int n3 = Integer.parseInt(frontStr.substring(2, 3));
        int n4 = Integer.parseInt(backStr.substring(0, 1));
        int n5 = Integer.parseInt(backStr.substring(1, 2));
        int n6 = Integer.parseInt(backStr.substring(2, 3));

        int frontSum = n1 + n2 + n3;
        int backSum = n4 + n5 + n6;

        while (frontSum != backSum) {
            number++;
            frontStr = String.valueOf(number).substring(0, 3);
            backStr = String.valueOf(number).substring(3, 6);

            n1 = Integer.parseInt(frontStr.substring(0, 1));
            n2 = Integer.parseInt(frontStr.substring(1, 2));
            n3 = Integer.parseInt(frontStr.substring(2, 3));
            n4 = Integer.parseInt(backStr.substring(0, 1));
            n5 = Integer.parseInt(backStr.substring(1, 2));
            n6 = Integer.parseInt(backStr.substring(2, 3));

            frontSum = n1 + n2 + n3;
            backSum = n4 + n5 + n6;
        }

        System.out.println(number);
    }
}
