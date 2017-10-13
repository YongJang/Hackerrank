import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.readLine();
        String str = in.readLine();
        int level = 0;
        int isValley = 0;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'U')
                level++;
            else
                level--;
            if (level < 0) {
                isValley = 1;
            }
            if (level >= 0 && isValley == 1) {
                isValley = 0;
                result++;
            }
        }
        System.out.println(result);
    }
}
