class Solution {
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> ans = new LinkedList<>();

        helper(root,0,ans);

        return ans;
    }

    public static void helper(TreeNode root,int level,List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }

        if(level==ans.size())
        {
            ans.add(root.data);
        }

        helper(root.right,level+1,ans);
        helper(root.left,level+1,ans);
    }
}
