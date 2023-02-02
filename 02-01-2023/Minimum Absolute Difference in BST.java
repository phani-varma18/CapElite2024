class Solution {
    Integer prev = null;
    int min = 10000;
    public int getMinimumDifference(TreeNode root) 
    {
        helper(root);
        return min;
    }

    void helper(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        helper(root.left);

        if(prev!=null)
        {
            min = Math.min(min,root.val-prev);
        }

        prev = root.val;

        helper(root.right);
    }
}
