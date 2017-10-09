import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */

public class DayofTheProgrammer {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(in.readLine());
        int isLeapYear = 0;
        if ((year <= 1917 && year % 4 == 0) || ((year > 1918) && (year % 400 == 0)) || ((year % 4 == 0) && (year % 100 != 0))) {
            isLeapYear = 1;
        }
        if (year == 1918) {
            System.out.println("26.09.1918");
            return;
        }
        if(isLeapYear == 1)
            System.out.println("12.09." + year);
        else
            System.out.println("13.09." + year);
    }
}
