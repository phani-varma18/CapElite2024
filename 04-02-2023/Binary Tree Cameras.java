class Solution {
    int cam = 0;
    public int minCameraCover(TreeNode root) 
    {
        return helper(root)==-1?1+cam:cam;
    }

    public int helper(TreeNode root)
    {
        if(root==null)
        {
            return 1;
        }

        int left = helper(root.left);
        int right = helper(root.right);

        if(left==-1 || right==-1)
        {
            cam++;
            return 0;
        }

        if(left==1 && right==1)
        {
            return -1;
        }

        return 1;
    }
}
