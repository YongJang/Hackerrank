import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 */
public class PickingNumbers {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String str = in.readLine();
        String strs[] = str.split("\\s+");
        int numbers[] = new int[100];
        for(int i = 0; i < strs.length; i++) {
            int temp = Integer.parseInt(strs[i]);
            numbers[temp - 1]++;
        }

        int max = 0;
        int index = 0;

        for(int i = 0; i < 99; i++) {
            if(numbers[i] + numbers[i + 1] > max) {
                max = numbers[i] + numbers[i + 1];
                index = i;
            }
        }
        System.out.println(max);
    }
}
