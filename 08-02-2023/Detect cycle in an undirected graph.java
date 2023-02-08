class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // Code here
        boolean[] visited = new boolean[V];
        boolean ans = false;
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                ans = ans || dfs(i,-1,visited,adj);
            }
        }
        
        return ans;
    }
    
    public boolean dfs(int curr,int par,boolean[] visited,ArrayList<ArrayList<Integer>> adj)
    {
        visited[curr] = true;
        
        boolean ans = false;
        
        for(int i : adj.get(curr))
        {
            if(visited[i] && i!=par)
            {
                return true;
            }
            
            if(!visited[i])
            {
                ans = ans || dfs(i,curr,visited,adj);
            }
        }
        
        return ans;
    }
}
