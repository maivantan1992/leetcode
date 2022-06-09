class Solution {
    int max;
    public int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        max = root.val;
        dfs(root);
        return max;
    }

    int dfs(TreeNode node){
        if(node == null)
            return 0;
        int maxLeft = dfs(node.left);
        int maxRight = dfs(node.right);
        max = Math.max(max, maxLeft + node.val + maxRight);
        return Math.max(node.val + Math.max(maxLeft, maxRight), 0);
    }
}