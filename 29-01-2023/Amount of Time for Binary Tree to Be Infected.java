class Solution {
    public int amountOfTime(TreeNode root, int start) {

        Map<TreeNode,TreeNode> parents = new HashMap<>();

        getParentsMap(root,null,parents);

        List<Integer> ans = new LinkedList<>();

        Queue<TreeNode> q = new LinkedList<>();

        Set<TreeNode> visited = new HashSet<>(); 

        TreeNode target = getNode(root,start);

        q.offer(target);

        visited.add(target);

        int maxMin = -1;

        while(!q.isEmpty())
        {
            int levelSize = q.size();

            while(levelSize-->0)
            {
                TreeNode curr = q.poll();

                if(curr.left!=null && !visited.contains(curr.left))
                {
                    q.offer(curr.left);
                    visited.add(curr.left);
                }

                if(curr.right!=null && !visited.contains(curr.right))
                {
                    q.offer(curr.right);
                    visited.add(curr.right);
                }

                TreeNode currPar = parents.get(curr);

                if(currPar!=null && !visited.contains(currPar))
                {
                    q.offer(currPar);
                    visited.add(currPar);
                }
            }

            maxMin++;
        }

        return maxMin;
    }

    public void getParentsMap(TreeNode root,TreeNode par,Map<TreeNode,TreeNode> parents)
    {
        if(root==null)
        {
            return;
        }

        parents.put(root,par);

        getParentsMap(root.left,root,parents);
        getParentsMap(root.right,root,parents);
    }

    public TreeNode getNode(TreeNode root,int va)
    {
        if(root==null)
        {
            return null;
        }

        if(root.val==va)
        {
            return root;
        }

        TreeNode left = getNode(root.left,va);
        TreeNode right = getNode(root.right,va);

        if(left!=null)
        {
            return left;
        }

        return right;
    }
}
