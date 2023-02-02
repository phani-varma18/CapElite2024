class Solution {
    int maxCt = 0,curCt = 0;
    TreeNode prevNode = null;
    public int[] findMode(TreeNode root) 
    {
        List<Integer> ans = new LinkedList<>();

        helper(root,ans);

        int[] res = new int[ans.size()];

        int j=0;

        for(int i:ans)
        {
            res[j++] = i;
        }

        return res;
    }

    public void helper(TreeNode root,List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }

        helper(root.left,ans);

        if(prevNode!=null && prevNode.val==root.val)
        {
            curCt++;
        }
        else
        {
            curCt = 1;
            prevNode = root;
        }

        if(curCt==maxCt)
        {
            ans.add(root.val);
        }

        if(curCt>maxCt)
        {
            ans.clear();
            ans.add(root.val);
            maxCt = curCt;
        }

        helper(root.right,ans);
    }
}
