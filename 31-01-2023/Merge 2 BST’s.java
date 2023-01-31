class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        helper(root1,l1);
        helper(root2,l2);
        
        int i=0,j=0,m=l1.size(),n=l2.size();
        
        List<Integer> temp = new ArrayList<>();
        
        while(i<m && j<n)
        {
            if(l1.get(i)>l2.get(j))
            {
                temp.add(l2.get(j++));
            }
            else
            {
                temp.add(l1.get(i++));
            }
        }
        
        while(i<m)
        {
            temp.add(l1.get(i++));
        }
        
        while(j<n)
        {
            temp.add(l2.get(j++));
        }
        
        //List<Integer> ans = new ArrayList<>(new LinkedHashSet<Integer>(temp));
        
        return temp;
    }
    
    void helper(Node root,List<Integer> l)
    {
        if(root==null)
        {
            return;
        }
        
        helper(root.left,l);
        
        l.add(root.data);
        
        helper(root.right,l);
    }
}



















