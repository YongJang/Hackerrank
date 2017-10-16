package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/matching-specific-string/problem
 */

public class MatchingSpecificString{
    public static void main(String args[]) throws IOException {
        RegexTest tester = new RegexTest();
        tester.checker("hackerrank");
    }
}

class RegexTest {
    public void checker(String regexPattern) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String testString = in.readLine();
        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(testString);
        int count = 0;
        while(m.find())
            count++;
        System.out.println("Number of matches : " + count);
    }
}
