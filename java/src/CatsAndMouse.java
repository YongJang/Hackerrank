import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */

public class CatsAndMouse {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(in.readLine());
        for (int i = 0; i < q; i++) {
            String str = in.readLine();
            String strs[] = str.split("\\s+");
            int locationA = Integer.parseInt(strs[0]);
            int locationB = Integer.parseInt(strs[1]);
            int locationC = Integer.parseInt(strs[2]);
            int distanceA = Math.abs(locationC - locationA);
            int distanceB = Math.abs(locationC - locationB);
            if (distanceA > distanceB) {
                System.out.println("Cat B");
            } else if (distanceA < distanceB) {
                System.out.println("Cat A");
            } else {
                System.out.println("Mouse C");
            }
        }
    }
}
