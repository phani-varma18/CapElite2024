class Solution {
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        return helper(nums,0,nums.length-1);
    }

    public TreeNode helper(int[] nums,int l,int h)
    {
        if(l>h)
        {
            return null;
        }

        int mid = l+(h-l)/2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums,l,mid-1);
        root.right = helper(nums,mid+1,h);

        return root;
    }
}
