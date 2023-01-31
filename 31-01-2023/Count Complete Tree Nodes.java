class Solution {
    int height(TreeNode root)
    {
        return root==null?-1:1+height(root.left);
    }
    public int countNodes(TreeNode root) 
    {
        int height = height(root);

        if(height<0)
        {
            return 0;
        }

        if(height(root.right)==height-1)
        {
            return (1<<height)+countNodes(root.right);
        }

        return (1<<height-1)+countNodes(root.left);
    }
}
