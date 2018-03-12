import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 */
class Node {
    private int weight;
    private int length;
    private Node children[];
    private int nodeNumber;
    public Node(int nodeNumber) {
        this.nodeNumber = nodeNumber;
        weight = 1;
        length = 0;
        children = new Node[100];
    }

    public int getWeight() { return weight; }
    public Node getIndexChild(int i) { return children[i]; }
    public int getLength() { return this.length; }

    public void addChild(Node n, int nodeNumber) {
        if(this.nodeNumber == nodeNumber)
            children[this.length++] = n;
        else if(this.length == 0)
            return;
        else {
            for (int i = 0; i < this.length; i++) {
                children[i].addChild(n, nodeNumber);
            }
        }
    }


}

public class EvenTree {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        String strings[] = string.split("\\s+");
        int N = Integer.parseInt(strings[0]);
        int M = Integer.parseInt(strings[1]);

        Node n = new Node(1);

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            String strs[] = str.split("\\s+");
            int nodeNumber = Integer.parseInt(strs[0]);
            int parrent = Integer.parseInt(strs[1]);
            n.addChild(new Node(nodeNumber), parrent);
        }

        while(n.getLength() != 0) {
            n =
        }
    }
}
