class Solution {
    public List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> ans = new LinkedList<>();
        helper(root,new StringBuilder(),ans);
        return ans;
    }

    void helper(TreeNode root,StringBuilder sb,List<String> ans)
    {
        if(root==null)
        {
            return;
        }

        int len = sb.length();

        sb.append(root.val+"");

        if(root.left==null && root.right==null)
        {
            ans.add(sb.toString());
        }
        else
        {
            sb.append("->");
            helper(root.left,sb,ans);
            helper(root.right,sb,ans);
        }

        sb.setLength(len);
    }
}
