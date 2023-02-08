class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(V==0)
        {
            return ans;
        }
        
        boolean[] visited = new boolean[V];
        
        helper(0,adj,visited,ans);
        
        return ans;
    }
    
    public void helper(int i, ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer> ans)
    {
        visited[i] = true;
        
        ans.add(i);
        
        for(int j : adj.get(i))
        {
            if(!visited[j])
            {
                helper(j,adj,visited,ans);
            }
        }
    }
}
