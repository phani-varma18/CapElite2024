class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) 
    {
        ans = new LinkedList<>();
        helper(root,targetSum,new LinkedList<>());

        return ans;
    }

    void helper(TreeNode root,int target,List<Integer> path)
    {
        if(root==null)
        {
            return;
        }

        target -= root.val;
        path.add(root.val);


        if(target==0 && root.left==null && root.right==null)
        {
            ans.add(new LinkedList<>(path));
        }
        else
        {
            helper(root.left,target,path);
            helper(root.right,target,path);
        }

        target += root.val;
        path.remove(path.size()-1);
    }

    
}
