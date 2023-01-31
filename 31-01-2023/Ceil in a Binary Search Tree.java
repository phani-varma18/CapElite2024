

// User function Template for Java

class Tree {
    // Function to return the ceil of given number in BST.
    int ans = -1;
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        helper(root,key);
        
        return ans;
    }
    
    void helper(Node root,int key)
    {
        if(root==null)
        {
            return;
        }
        
        if(root.data==key)
        {
            ans = key;
            return;
        }
        
        if(root.data>key)
        {
            ans = root.data;
            helper(root.left,key);
        }
        else
        {
            helper(root.right,key);
        }
        
    }
}
