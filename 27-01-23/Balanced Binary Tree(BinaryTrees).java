class Solution {
    public boolean isBalanced(TreeNode root) 
    {
        if(root==null)
        {
            return true;
        }
        return Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left,right)+1;
    }
}
