class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        
        if(root==null || (root.left==null && root.right==null))
        {
            return 1;
        }
        
        int child = 0;
        
        if(root.left!=null)
        {
            child += root.left.data;
        }
        
        if(root.right!=null)
        {
            child += root.right.data;
        }
        
        return child==root.data && isSumProperty(root.left)==1 && isSumProperty(root.right)==1?1:0;
    }
}
