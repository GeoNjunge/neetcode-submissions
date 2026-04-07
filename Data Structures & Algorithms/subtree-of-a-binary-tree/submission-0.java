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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left ,subRoot) || isSubtree(root.right, subRoot);
    }


    static boolean isSameTree(TreeNode a, TreeNode b) {
       if (a == null && b == null) return true;

       Stack<TreeNode[]> stack = new Stack<>();
       stack.push(new TreeNode[]{a, b});

       while (!stack.isEmpty()) {
        TreeNode[] node = stack.pop();
        TreeNode nodeA = node[0];
        TreeNode nodeB = node[1];

        if (nodeA == null && nodeB == null) continue;
        if (nodeA == null || nodeB == null || nodeA.val != nodeB.val) {
            return false;
        }

        stack.push(new TreeNode[]{nodeA.left, nodeB.left});
        stack.push(new TreeNode[]{nodeA.right, nodeB.right});
       }

       return true;
    }
}
