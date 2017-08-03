import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/between-two-sets
 */

public class BetweenTwoSets {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();
        String strs[] = string.split("\\s+");
        int m = Integer.parseInt(strs[0]);
        int n = Integer.parseInt(strs[1]);
        string = in.readLine();
        strs = string.split("\\s+");

        int arrayA[] = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arrayA[i] = Integer.parseInt(strs[i]);
        }

        string = in.readLine();
        strs = string.split("\\s+");
        int arrayB[] = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arrayB[i] = Integer.parseInt(strs[i]);
        }

        int lcm = getArrayLCM(arrayA, 0);
        int count = 0;
        int index = lcm;
        boolean flag;

        while (index <= 100) {
            flag = true;
            for (int i = 0; i < arrayB.length; i++) {
                if (arrayB[i] % index != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
            index += lcm;
        }
        System.out.println(count);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int getArrayLCM(int array[], int i) {
        if (array.length <= 1) {
            return array[array.length - 1];
        }
        if (i == array.length - 1) {
            return lcm(array[i - 1], array[i]);
        }
        array[i + 1] = lcm(array[i], array[i + 1]);
        return getArrayLCM(array, i + 1);
    }
}
