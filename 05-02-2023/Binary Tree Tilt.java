class Solution {

    public int findTilt(TreeNode root) 
    {
        int[] ans = new int[]{0};
        helper(root,ans);

        return ans[0];
    }

    int helper(TreeNode root,int[] ans)
    {
        if(root==null)
        {
            return 0;
        }

        int leftSum = helper(root.left,ans);
        int rightSum = helper(root.right,ans);

        ans[0] += Math.abs(leftSum-rightSum);

        return leftSum+rightSum+root.val;
    }
}
