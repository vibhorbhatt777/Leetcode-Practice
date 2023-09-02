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
     public TreeNode helper(TreeNode vb,TreeNode vb1){
        
        if(vb==null && vb1==null){
            return null;
        }
        if(vb==null && vb1!=null){
            return vb1;
        }
        else if(vb!=null && vb1==null){
            return vb;
        }
        TreeNode ans=new TreeNode(vb.val+vb1.val);
        ans.left=helper(vb.left,vb1.left);
        ans.right=helper(vb.right,vb1.right);
        return ans;
       
    }
    
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return helper(root1 , root2);
    }
}
