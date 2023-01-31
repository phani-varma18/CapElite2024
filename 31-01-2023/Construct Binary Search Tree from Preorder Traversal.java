class Solution {
    public TreeNode bstFromPreorder(int[] preorder) 
    {
        int lr = 0,rr = 1001;
        return helper(preorder,lr,rr,new int[]{0});
    }

    TreeNode helper(int[] preorder,int lr,int rr,int[] curr)
    {
        if(curr[0]>=preorder.length || preorder[curr[0]]>=rr || preorder[curr[0]]<=lr)
        {
            return null;
        }

        TreeNode root = new TreeNode(preorder[curr[0]++]);

        root.left = helper(preorder,lr,root.val,curr);
        root.right = helper(preorder,root.val,rr,curr);

        return root;
    }
}
