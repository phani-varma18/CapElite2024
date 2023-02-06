class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) 
    {
        if(depth==1)
        {
            return new TreeNode(val,root,null);
        }
        List<TreeNode> list = new LinkedList<>();

        helper(root,depth-2,0,list);

        for(TreeNode curr : list)
        {
            if(curr.left!=null)
            {
                TreeNode nn = new TreeNode(val),currLeft = curr.left;

                curr.left = nn;

                nn.left = currLeft;
            }
            else
            {
                curr.left = new TreeNode(val);
            }
            
            if(curr.right!=null)
            {
                TreeNode nn = new TreeNode(val),currRight = curr.right;

                curr.right = nn;

                nn.right = currRight;
            }
            else
            {
                curr.right = new TreeNode(val);
            }
        }

        return root;
    }

    public void helper(TreeNode root,int depth,int level,List<TreeNode> ans)
    {
        if(root==null)
        {
            return;
        }

        if(depth==level)
        {
            ans.add(root);
            return;
        }

        helper(root.left,depth,level+1,ans);
        helper(root.right,depth,level+1,ans);
    }
}
