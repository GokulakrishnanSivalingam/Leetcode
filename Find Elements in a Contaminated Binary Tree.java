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
class FindElements {
      Set<Integer> hash=new HashSet<>();
    public FindElements(TreeNode node) {
        
        dfs(node,0);
    }
    
    public boolean find(int target) {
      return hash.contains(target);
    }
    public void dfs(TreeNode node,int c)
    {
 if(node==null)
 {
    return;
 }
         hash.add(c);
        dfs(node.left,2*c+1);
        dfs(node.right,2*c+2);

    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
