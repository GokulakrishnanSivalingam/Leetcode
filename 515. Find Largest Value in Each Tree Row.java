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
    private List<Integer> r;
    public List<Integer> largestValues(TreeNode root) {
        r = new ArrayList<>();
        dfs(root, 0);

        return r;
    }

    private void dfs(TreeNode root, int level) {
        if (root != null) {
            int val = root.val;
            
            if (r.size() == level) 
                r.add(val);
            else 
                r.set(level, Math.max(r.get(level), val));
            
            dfs(root.left, level + 1);
            dfs(root.right, level + 1);
        }
    }
}
