class Solution {
    public TreeNode deleteNode(TreeNode root, int key) 
    {
        
        if(root==null)
        {
            return null;
        }

        if(root.val==key)
        {
            if(root.left==null && root.right==null)
            {
                return null;
            }
            else if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            else
            {
                TreeNode node = root.left;

                while(node.right!=null)
                {
                    node = node.right;
                }

                root.val = node.val;

                root.left = deleteNode(root.left,node.val);
            }
        }
        else if(root.val>key)
        {
            root.left = deleteNode(root.left,key);
        }
        else
        {
            root.right = deleteNode(root.right,key);
        }

        return root;
    }
}
