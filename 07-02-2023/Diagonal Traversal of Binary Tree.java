class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<Integer> ans = new ArrayList<>();
           
           if(root==null)
           {
               return ans;
           }
           
           Queue<Node> q = new LinkedList<>();
           q.offer(root);
           
           while(!q.isEmpty())
           {
               Node curr = q.poll();
               
               while(curr!=null)
               {
                   ans.add(curr.data);
                   
                   if(curr.left!=null)
                   {
                       q.offer(curr.left);
                   }
                   
                   curr = curr.right;
               }
           }
           
           return ans;
      }
}
