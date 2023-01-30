class Solution {
    HashMap<Integer,Integer> inIndices = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        for(int i=0;i<inorder.length;i++)
        {
            inIndices.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,inorder.length-1,new int[]{0});
    }

    public TreeNode helper(int[] preorder,int[] inorder,int inSt,int inEn,int[] curr)
    {
        if(curr[0]==inorder.length || inSt>inEn)
        {
            return null;
        }

        TreeNode root = new TreeNode(preorder[curr[0]++]);

        int inIndex = inIndices.get(root.val);

        root.left = helper(preorder,inorder,inSt,inIndex-1,curr);
        root.right = helper(preorder,inorder,inIndex+1,inEn,curr);

        return root;
    }
}
