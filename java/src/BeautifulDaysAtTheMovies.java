import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/editorial
 */


public class BeautifulDaysAtTheMovies {
    private final static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws IOException {
        String string = in.readLine();
        String input[] = string.split("\\s+");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        int dividingNum = Integer.parseInt(input[2]);

        int beautifulNum = 0;

        for (int i = start; i <= end; i++) {
            String tempString = String.valueOf(i);
            StringBuilder sb = new StringBuilder();
            for (int j = tempString.length() - 1; j >= 0; j--) {
                sb.append(tempString.charAt(j));
            }
            if ((i - Integer.parseInt(sb.toString())) % dividingNum == 0)
                beautifulNum++;
        }
        System.out.println(beautifulNum);
    }
}
