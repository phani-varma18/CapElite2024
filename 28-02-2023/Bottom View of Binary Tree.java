

//User function Template for Java


class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        class Pair
        {
            int off;
            Node node;
            
            Pair(int off,Node node)
            {
                this.off = off;
                this.node = node;
            }
        }
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        Queue<Pair> q = new LinkedList<>();
        
        q.offer(new Pair(0,root));
        map.put(0,root.data);
        
        while(!q.isEmpty())
        {
            int levelSize = q.size();
            
            while(levelSize-->0)
            {
                Pair curr = q.poll();
                
                Node currNode = curr.node;
                
                map.put(curr.off,currNode.data);
                
                if(currNode.left!=null)
                {
                    q.offer(new Pair(curr.off-1,currNode.left));
                }
                
                if(currNode.right!=null)
                {
                    q.offer(new Pair(curr.off+1,currNode.right));
                }
            }
            
            
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
            //System.out.println(map);
        
        for(int i : map.values())
        {
            ans.add(i);
        }
        
        return ans;
    }
}
