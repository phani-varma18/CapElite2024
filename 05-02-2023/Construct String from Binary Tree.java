class Solution {
    public String tree2str(TreeNode root) 
    {
        StringBuilder ans = new StringBuilder("");

        helper(root,ans);

        return ans.toString();
    }

    void helper(TreeNode root,StringBuilder ans)
    {
        if(root==null)
        {
            return;
        }

        ans.append(root.val+"");

        if(root.left!=null || root.right!=null)
        {
            ans.append('(');
        }

        helper(root.left,ans);

        if(root.left!=null || root.right!=null)
        {
            ans.append(')');
        }

        if(root.right!=null)
        {
            ans.append('(');
        }        

        helper(root.right,ans);

        if(root.right!=null)
        {
            ans.append(')');
        }
    }
}
