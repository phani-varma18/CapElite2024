public static boolean find(Node root, int data){
    // write your code here
    if(root==null)
    {
        return false;
    }
    
    if(root.data==data)
    {
        ans.add(data);
        return true;
    }
    
    boolean inLeft = find(root.left,data);
    boolean inRight = find(root.right,data);
    
    if(inLeft || inRight)
    {
        ans.add(root.data);
    }
    
    return inLeft || inRight;
  }
