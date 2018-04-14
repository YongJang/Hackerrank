import java.util.Scanner;

/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/30-binary-search-trees
 */
class BinarySearchTrees30Node {
    BinarySearchTrees30Node left, right;
    int data;
    BinarySearchTrees30Node (int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTrees30 {
    /* My Solution
    public static int getHeight(BinarySearchTrees30Node root) {
        int height = 0;
        List<BinarySearchTrees30Node> nodeList = new Vector<Node>();
        nodeList.add(root);
        while (nodeList.size() != 0) {
            List<BinarySearchTrees30Node> tmpList = new Vector<BinarySearchTrees30Node>();
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
    public static int getHeight(BinarySearchTrees30Node root) {
        if (root == null) {
            return -1;
        }
        int leftDepth = getHeight(root.left);
        int rightDepth = getHeight(root.right);
        return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
    }


    public static BinarySearchTrees30Node insert(BinarySearchTrees30Node root, int data){
        if (root == null) {
            return new BinarySearchTrees30Node(data);
        } else {
            BinarySearchTrees30Node cur;
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
        BinarySearchTrees30Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
