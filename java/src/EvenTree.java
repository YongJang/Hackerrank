import java.util.Scanner;

class EvenTreeNode {
    private int childNodeNum = 0;
    private EvenTreeNode parentNode;

}

public class EvenTree {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        String[] treeNodesEdges = scanner.nextLine().split("\\s");
        int treeNodes = Integer.parseInt(treeNodesEdges[0].trim());
        int treeEdges = Integer.parseInt(treeNodesEdges[1].trim());

        int[] treeFrom = new int[treeEdges];
        int[] treeTo = new int[treeEdges];

        for (int treeItr = 0; treeItr < treeEdges; treeItr++) {
            String[] treeFromTo = scanner.nextLine().split("\\s");
            treeFrom[treeItr] = Integer.parseInt(treeFromTo[0].trim());
            treeTo[treeItr] = Integer.parseInt(treeFromTo[1].trim());
        }


    }
}
