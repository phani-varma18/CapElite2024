class Solution {
    class BstPair
    {
        int rightZigZagLen = -1;
        int leftZigZagLen = -1;
        int maxLen = -1;
    }
    public int longestZigZag(TreeNode root) 
    {
        BstPair ans = helper(root);

        return ans.maxLen;
    }

    public BstPair helper(TreeNode root)
    {
        if(root==null)
        {
            return new BstPair();
        }

        BstPair left = helper(root.left);
        BstPair right = helper(root.right);

        BstPair ans = new BstPair();

        ans.rightZigZagLen = 1+right.leftZigZagLen;
        ans.leftZigZagLen = 1+left.rightZigZagLen;

        ans.maxLen = Math.max(Math.max(ans.rightZigZagLen,ans.leftZigZagLen),Math.max(left.maxLen,right.maxLen));

        return ans;
    }
}
