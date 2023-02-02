class Solution {
    int i=0;
    Integer kthMin = null;
    public int kthSmallest(TreeNode root, int k) 
    {
        helper(root,k);
        return kthMin;
    }

    public void helper(TreeNode root,int k)
    {
        if(root==null || i==k)
        {
            return;
        }
        helper(root.left,k);

        if(i<k)
        {
            kthMin = root.val;
            i++;
        }

        helper(root.right,k);
    }
}
