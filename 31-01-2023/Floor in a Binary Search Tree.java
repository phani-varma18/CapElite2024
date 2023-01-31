class Solution {
    public static int floor(Node root, int x) 
    {
        // Code here
        int ans = -1;
        Node curr = root;
        
        while(curr!=null)
        {
            if(curr.data==x)
            {
                return x;
            }
            else if(curr.data>x)
            {
                curr = curr.left;
            }
            else
            {
                ans = curr.data;
                curr = curr.right;
            }
        }
        
        return ans;
    }
}
