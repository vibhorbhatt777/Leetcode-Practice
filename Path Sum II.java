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
        List<List<Integer>> helper(TreeNode root, int sum, int target, List<List<Integer>> ans, List<Integer> smallAns){
        if(root == null) 
            return ans;
        smallAns.add(root.val);
        if(root.left == null && root.right == null && ){
            if(targetSum - root.val==0){
            ans.add(new ArrayList<>(list));
                list.add(root.val);
                ans.add(list)
            }
        }
        helper(root.left, sum + root.val, target, ans, smallAns);
        helper(root.right, sum + root.val, target, ans, smallAns);
        list.remove(smallAns.size() - 1);
        return ans;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) 
        return new ArrayList<>();
        return helper(root, 0, targetSum, new ArrayList<>(), new ArrayList<>());
    }
}
