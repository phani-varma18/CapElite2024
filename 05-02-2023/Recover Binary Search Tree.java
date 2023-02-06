class Solution {
    TreeNode node1 = null,node2 = null,prev = null;
    public void recoverTree(TreeNode root) 
    {
        inorder(root);

        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;    
    }

    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        inorder(root.left);

        if(prev!=null && prev.val>=root.val)
        {
            if(node1==null)
            {
                node1 = prev;
            }

            node2 = root;
        }

        prev = root;

        inorder(root.right);
    }
}
