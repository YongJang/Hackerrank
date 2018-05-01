import java.util.Scanner;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */

public class ClimbingTheLeaderboard {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        int n = scanner.nextInt();
        int[] leaderboard = new int[n];
        for (int i = 0; i < n; i++) {
            leaderboard[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int aliceScores[] = new int[m];
        for (int i = 0; i < m; i++) {
            aliceScores[i] = scanner.nextInt();
        }

        int maxRank = 2;
        int tempScore = leaderboard[0];
        for (int i = 1; i < leaderboard.length; i++) {
            if (tempScore > leaderboard[i]) {
                maxRank++;
                tempScore = leaderboard[i];
            }
        }

        tempScore = leaderboard[leaderboard.length - 1];
        int checkpoint = leaderboard.length - 1;
        for (int i = 0; i < aliceScores.length; i++) {
            for (int j = checkpoint; j >= 0; j--) {
                if (aliceScores[i] < leaderboard[j]) {
                    System.out.println(maxRank);
                    break;
                } else if (aliceScores[i] == leaderboard[j]){
                    System.out.println(maxRank - 1);
                    break;
                } else {
                    if (tempScore != leaderboard[j]) {
                        maxRank--;
                        int temp = tempScore;
                        tempScore = leaderboard[j];
                        System.out.println("tempScore : " + temp + "->" + tempScore);

                    }
                    checkpoint--;
                    if (maxRank == 1) {
                        System.out.println(maxRank);
                    }
                }
            }

        }

        /*
        int aliceScore;
        for (int i = 0; i < m; i++) {
            aliceScore = scanner.nextInt();
            int rank = 1;
            int tempScore = leaderboard[0];
            for (int j = 0; j < leaderboard.length; j++) {
                if (aliceScore >= leaderboard[j])
                    break;
                if (tempScore > leaderboard[j]) {
                    tempScore = leaderboard[j];
                    rank++;
                }
            }
            if (tempScore > aliceScore)
                rank++;
         }
         // System.out.println(rank);
         */


    }
}
