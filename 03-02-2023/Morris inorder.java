class Solution {
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> ans = new LinkedList<>();

        if(root==null)
        {
            return ans;
        }

        TreeNode curr = root;

        while(curr!=null)
        {
            TreeNode left = curr.left;

            if(left==null)
            {
                ans.add(curr.val);
                curr = curr.right;
            }
            else
            {
                TreeNode pre = left;

                while(pre.right!=null && pre.right!=curr)
                {
                    pre = pre.right;
                }

                if(pre.right==null)
                {
                    pre.right = curr;
                    curr = curr.left;
                }
                else
                {
                    pre.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }

            }
        }

        return ans;
    }
}
