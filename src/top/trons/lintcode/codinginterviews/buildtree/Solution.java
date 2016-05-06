package top.trons.lintcode.codinginterviews.buildtree;

/**
 * Created by trons on 16-4-13.
 *
 *
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


class Solution {
    /**
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length <= 1)
            return new TreeNode(preorder[0]);
        return new TreeNode(1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] pre = {2};
        int[] in = {1};
        System.out.println(solution.buildTree(pre, in));
    }
}