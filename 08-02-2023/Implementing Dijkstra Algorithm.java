class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    
    static class Pair
    {
        int dist,vertex;
        
        Pair(int dist,int vertex)
        {
            this.dist = dist;
            this.vertex = vertex;
        }
    }
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        boolean[] visited = new boolean[V];
        
        int[] ans = new int[V];
        
        PriorityQueue<Pair> q = new PriorityQueue<>((o1,o2)->o1.dist-o2.dist);
        
        q.add(new Pair(0,S));
        
        while(!q.isEmpty())
        {
            Pair curr = q.poll();
            
            if(visited[curr.vertex])
            {
                continue;
            }
            
            visited[curr.vertex] = true;
            
            ans[curr.vertex] = curr.dist;
            
            for(ArrayList<Integer> ad : adj.get(curr.vertex))
            {
                if(!visited[ad.get(0)])
                {
                    q.add(new Pair(curr.dist+ad.get(1),ad.get(0)));
                }
            }
        }
        
        return ans;
    }
}
