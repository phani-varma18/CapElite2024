class Solution {
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> ans = new LinkedList<>();

        if(root==null)
        {
            return ans;
        }

        TreeNode curr = root;

        while(curr!=null)
        {
            TreeNode currLeft = curr.left;

            if(currLeft==null)
            {
                ans.add(curr.val);
                curr = curr.right;
            }
            else
            {
                TreeNode prev = currLeft;

                while(prev.right!=null && prev.right!=curr)
                {
                    prev = prev.right;
                }

                if(prev.right==null)
                {
                    prev.right = curr;
                    ans.add(curr.val);
                    curr = curr.left;
                }
                if(prev.right==curr)
                {
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }

        return ans;
    }
}
