class Solution {
    int currMaxLevel = -1;
    public int findBottomLeftValue(TreeNode root) 
    {
        int[] ans = new int[]{0};
        helper(root,0,ans);

        return ans[0];
    }

    void helper(TreeNode root,int level,int[] curr)
    {
        if(root==null)
        {
            return;
        }

        if(level>currMaxLevel)
        {
            currMaxLevel = level;
            curr[0] = root.val;
        }

        helper(root.left,level+1,curr);
        helper(root.right,level+1,curr);
    }
}
