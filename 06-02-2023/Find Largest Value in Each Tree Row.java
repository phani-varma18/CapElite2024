class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        helper(root,0,ans);

        return ans;
    }

    public void helper(TreeNode root,int level,List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }

        if(level==ans.size())
        {
            ans.add(root.val);
        }

        ans.set(level,Math.max(ans.get(level),root.val));

        helper(root.left,level+1,ans);
        helper(root.right,level+1,ans);
    }
}
