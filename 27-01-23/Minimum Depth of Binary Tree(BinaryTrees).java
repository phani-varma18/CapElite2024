class Solution {
    public int minDepth(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        
        int levelCount = 1;

        while(!q.isEmpty())
        {
            int levelSize = q.size();

            while(levelSize-->0)
            {
                TreeNode curr = q.poll();

                if(curr.left==null && curr.right==null)
                {
                    return levelCount;
                }
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
            }
            levelCount++;
        }

        return levelCount;
    }
}
