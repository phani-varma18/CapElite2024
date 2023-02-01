class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        TreeMap<Integer,List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0,root));

        while(!q.isEmpty())
        {
            int levelSize = q.size();

            Map<Integer,List<Integer>> temp = new HashMap<>();

            while(levelSize-->0)
            {
                Pair curr = q.poll();
                TreeNode currNode = curr.bNode;

                if(!temp.containsKey(curr.off))
                {
                    temp.put(curr.off,new ArrayList());
                }

                temp.get(curr.off).add(currNode.val);

                if(currNode.left!=null)
                {
                    q.offer(new Pair(curr.off-1,currNode.left));
                }
                if(currNode.right!=null)
                {
                    q.offer(new Pair(curr.off+1,currNode.right));
                }
            }

            for(int i : temp.keySet())
            {
                List<Integer> row = temp.get(i);

                Collections.sort(row);

                if(!map.containsKey(i)) map.put(i,new LinkedList());

                map.get(i).addAll(row);

            }
        }

        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet())
        {
            List<Integer> row = entry.getValue();
            ans.add(row);
        }

        return ans;
    }
}

class Pair
{
    int off;
    TreeNode bNode;

    Pair(int offset,TreeNode bNode)
    {
        off = offset;
        this.bNode = bNode;
    }
}
