class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(v==0)
        {
            return ans;
        }
        
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v];
        
        q.offer(0);
        
        while(!q.isEmpty())
        {
            int curr = q.poll();
            
            if(visited[curr])
            {
                continue;
            }
            
            visited[curr] = true;
            
            ans.add(curr);
            
            for(int i : adj.get(curr))
            {
                q.offer(i);
            }
        }
        
        return ans;
    }
    
}
