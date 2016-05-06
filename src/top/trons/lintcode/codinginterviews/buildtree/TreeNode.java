package top.trons.lintcode.codinginterviews.buildtree;

/**
 * Created by trons on 16-4-13.
 */
public class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
