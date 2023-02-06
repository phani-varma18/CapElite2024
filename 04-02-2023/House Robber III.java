class Solution {
    static class BstPair
    {
        int withRob;
        int withOutRob;

        public BstPair(){}

        public BstPair(int a,int b)
        {
            withRob = a;
            withOutRob = b;
        }
    }

    public int rob(TreeNode root) 
    {
        BstPair ans = helper(root);

        return Math.max(ans.withRob,ans.withOutRob);
    }

    public BstPair helper(TreeNode root)
    {
        if(root==null)
        {
            return new BstPair(0,0);
        }

        BstPair left = helper(root.left);
        BstPair right = helper(root.right);

        BstPair curr = new BstPair();

        curr.withRob = left.withOutRob + right.withOutRob + root.val;
        curr.withOutRob = Math.max(left.withOutRob,left.withRob) + Math.max(right.withRob,right.withOutRob);

        return curr;
    }
}
