class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) 
    {
        addAll(root);
    }
    
    public int next() 
    {
        TreeNode curr = stack.pop();
        addAll(curr.right);

        return curr.val;
        
    }

    public void addAll(TreeNode root)
    {
        while(root!=null)
        {
            stack.push(root);

            root = root.left;
        }
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
