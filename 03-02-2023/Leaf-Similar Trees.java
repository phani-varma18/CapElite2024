class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        int[] ans1 = new int[1],ans2 = new int[1];

        getLeafSequence(root1,ans1);
        getLeafSequence(root2,ans2);

        return ans1[0]==ans2[0];
    }

    void getLeafSequence(TreeNode root,int[] ans)
    {
        if(root==null)
        {
            return;
        }

        getLeafSequence(root.left,ans);

        if(root.left==null && root.right==null)
        {
            ans[0] = ans[0]*10 + root.val;
        }

        getLeafSequence(root.right,ans);

    }
}
