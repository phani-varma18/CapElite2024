class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) 
    {
        Map<TreeNode,TreeNode> parents = new HashMap<>();
        getParentsMap(root,null,parents);
        List<Integer> ans = new LinkedList<>();

        if(k==0)
        {
            ans.add(target.val);
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        Set<TreeNode> visited = new HashSet<>(); 

        q.offer(target);

        visited.add(target);

        int dist = 0;

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

            dist++;

            if(dist==k)
            {
                break;
            }
            
        }

        while(!q.isEmpty())
        {
            ans.add(q.poll().val);
        }

        return ans;
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
}
