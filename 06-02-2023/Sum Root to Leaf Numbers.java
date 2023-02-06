class Solution {
    int totalSum = 0;
    public int sumNumbers(TreeNode root) 
    {
        helper(root,0);

        return totalSum;
    }

    void helper(TreeNode root,int sum)
    {
        if(root==null)
        {
            return;
        }

        sum = sum*10 + root.val;

        if(root.left==null && root.right==null)
        {
            totalSum += sum;
        }

        helper(root.left,sum);
        helper(root.right,sum);
    }
}
