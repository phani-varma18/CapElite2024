class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // code here
        boolean[] visited = new boolean[V];
        boolean[] predecessor = new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(cycleCheck(i,visited,predecessor,adj))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean cycleCheck(int curr,boolean[] visited,boolean[] predecessor,ArrayList<ArrayList<Integer>> adj)
    {
        visited[curr] = true;
        predecessor[curr] = true;
        
        for(int i : adj.get(curr))
        {
            if(predecessor[i])
            {
                return true;
            }
            
            if(!visited[i])
            {
                if(cycleCheck(i,visited,predecessor,adj))
                {
                    return true;
                }
            }
        }
        
        predecessor[curr] = false;
        
        return false;
    }
}
