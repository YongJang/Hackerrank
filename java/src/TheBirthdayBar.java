import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBirthdayBar {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String str = in.readLine();
        String strs[] = str.split("\\s+");
        str = in.readLine();
        String strs2[] = str.split("\\s+");
        int numbers[] = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        }
        int d = Integer.parseInt(strs2[0]);
        int m = Integer.parseInt(strs2[1]);
        int result = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                if (i + j >= n)
                    break;

                sum += numbers[i + j];
            }
            if (sum == d)
                result++;
        }
        System.out.println(result);
    }
}
