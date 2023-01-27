class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> ans = new ArrayList<>();

        if(root==null)
        {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty())
        {
            int nodeCount = queue.size();

            List<Integer> l = new ArrayList<>();

            while(nodeCount-->0)
            {
                TreeNode curr = queue.remove();

                l.add(curr.val);

                if(curr.left!=null)
                {
                    queue.add(curr.left);
                }

                if(curr.right!=null)
                {
                    queue.add(curr.right);
                }
            }

            ans.add(l);
        }

        return ans;        
    }
}
