import java.util.Scanner;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/30-binary-search-trees
 */
class Node {
    Node left, right;
    int data;
    Node (int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTrees30 {
    /* My Solution
    public static int getHeight(Node root) {
        int height = 0;
        List<Node> nodeList = new Vector<Node>();
        nodeList.add(root);
        while (nodeList.size() != 0) {
            List<Node> tmpList = new Vector<Node>();
            for (int i = 0; i < nodeList.size(); i++) {
                if (nodeList.get(i).left != null)
                    tmpList.add(nodeList.get(i).left);
                if (nodeList.get(i).right != null)
                    tmpList.add(nodeList.get(i).right);
            }
            nodeList = tmpList;
            if (nodeList.size() > 0)
                height++;
        }
        return height;
    }
    */

    // Better Solution
    public static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }
        int leftDepth = getHeight(root.left);
        int rightDepth = getHeight(root.right);
        return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
    }


    public static Node insert(Node root, int data){
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
