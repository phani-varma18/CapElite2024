class Solution {
    public int[] findFrequentTreeSum(TreeNode root) 
    {
        Map<Integer,Integer> map = new HashMap<>();

        int[] maxFreq = new int[]{0};
        List<Integer> l = new LinkedList<>();

        helper(root,map,maxFreq,l);

        int[] ans = new int[l.size()];

        for(int i=0;i<l.size();i++)
        {
            ans[i] = l.get(i);
        }

        return ans;
    }

    int helper(TreeNode root,Map<Integer,Integer> map,int[] currMax,List<Integer> l)
    {
        if(root==null)
        {
            return 0;
        }

        int left = helper(root.left,map,currMax,l);
        int right = helper(root.right,map,currMax,l);

        int ans = root.val+left+right;

        map.put(ans,map.getOrDefault(ans,0)+1);

        int currFreq = map.get(ans);

        if(currFreq>currMax[0])
        {
            currMax[0] = currFreq;
            l.clear();
            l.add(ans);
        }
        else if(currFreq==currMax[0])
        {
            l.add(ans);
        }

        return ans;
    }
}
