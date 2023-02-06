class Solution {
    Node arr[];
    public Node connect(Node root) 
    {
        int h = height(root);
        arr = new Node[h];
        Arrays.fill(arr,null);

        helper(root,0);

        return root;
    }

    void helper(Node root,int level)
    {
        if(root==null)
        {
            return;
        }

        if(arr[level]!=null)
        {
            arr[level].next = root;
        }

        arr[level] = root;

        helper(root.left,level+1);
        helper(root.right,level+1);
    }



    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        return 1+Math.max(height(root.left),height(root.right));
    }
}
