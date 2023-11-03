package Tree1;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    List<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }
}

public class PreorderTraversalExample {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);

        TreeNode grandchild1 = new TreeNode(4);
        TreeNode grandchild2 = new TreeNode(5);

        root.addChild(child1);
        root.addChild(child2);

        child1.addChild(grandchild1);
        child1.addChild(grandchild2);

        preorderTraversal(root);
    }

    public static void preorderTraversal(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");

        for (TreeNode child : node.children) {
            preorderTraversal(child);
        }
    }
}
