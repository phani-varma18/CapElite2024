class Solution {
    public int widthOfBinaryTree(TreeNode root) 
    {
        class Pair
        {
            int in;
            TreeNode node;

            Pair(TreeNode node,int in)
            {
                this.node = node;
                this.in = in;
            }
        }
        Deque<Pair> q = new LinkedList<>();

        q.offer(new Pair(root,1));

        int ans = 0;

        while(!q.isEmpty())
        {
            int levelSize = q.size();

            ans = Math.max(ans,q.getLast().in-q.getFirst().in+1);

            while(levelSize-->0)
            {
                Pair curr = q.poll();

                TreeNode currNode = curr.node;

                if(currNode.left!=null)
                {
                    q.offer(new Pair(currNode.left,2*curr.in+1));
                }
                if(currNode.right!=null)
                {
                    q.offer(new Pair(currNode.right,2*curr.in+2));
                }
            }
            
        }

        return ans;
    }
}
