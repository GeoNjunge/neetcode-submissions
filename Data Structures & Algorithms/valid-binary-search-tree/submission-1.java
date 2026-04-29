/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        return Solution.dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean dfs(TreeNode node, int l_limit, int r_limit) {
       if (node == null) return true;

       if (node.val > l_limit && node.val < r_limit) {
        return (dfs(node.left, l_limit, node.val) &&
        dfs(node.right, node.val, r_limit));
       }
       return false;
    }
}
