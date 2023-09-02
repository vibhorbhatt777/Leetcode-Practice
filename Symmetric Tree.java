/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     Tr
    
       */
class Solution{
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetric(root.left , root.right);
    }
    private boolean isSymmetric(TreeNode left , TreeNode right){
        if(left==null || right==null)
            return left==right;
        if(left.val != right.val)
            return false;
        return isSymmetric(left.left , right.right) && isSymmetric(left.right , right.left);
        
    }
}
