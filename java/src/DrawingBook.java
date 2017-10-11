import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingBook {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int p = Integer.parseInt(in.readLine());
        int back = ((n - (n % 2)) - p + 1) / 2;
        int front = p / 2;
        System.out.println((front > back) ? back : front);
    }
}
