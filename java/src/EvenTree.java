import java.util.Scanner;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/even-tree/problem
 */

class EvenTreeNode{
    private EvenTreeNode parent;
    private int descendantCount = 0;
    public void setParent(EvenTreeNode parent){
        this.parent = parent;
        EvenTreeNode ancestor = parent;
        while(ancestor != null){
            ancestor.descendantCount++;
            ancestor = ancestor.getParent();
        }
    }
    public EvenTreeNode getParent(){
        return this.parent;
    }
    public int getDescendantCount() {
        return this.descendantCount;
    }
}
public class EvenTree {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int vertices = scanner.nextInt();
        int edges = scanner.nextInt();
        EvenTreeNode[] nodes = new EvenTreeNode[vertices];
        while (vertices-- > 0)
            nodes[vertices] = new EvenTreeNode();
        while(edges-- > 0)
            nodes[scanner.nextInt() - 1].setParent(nodes[scanner.nextInt() - 1]);
        int disconnects = -1;
        for(EvenTreeNode n:nodes)
            if(n.getDescendantCount() % 2 == 1)
                disconnects++;
        System.out.println(disconnects);
    }
}
