class Solution {
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> ans = new LinkedList<>();
        helper(root,ans);
        return ans;
    }

    public static void helper(TreeNode root,List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }

        helper(root.left,ans);
        helper(root.right,ans);
        ans.add(root.val);
    }
}
