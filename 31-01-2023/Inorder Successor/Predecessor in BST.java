class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       
       if(root==null)
       {
           return;
       }
       
       Node curr = root;
       
       p.pre = null;
       
       while(curr!=null)
       {
           if(curr.data>key)
           {
               curr = curr.left;
           }
           else if(curr.data<key)
           {
               p.pre = curr;
               curr = curr.right;
           }
           else
           {
               Node temp = curr.left;
               
               if(temp==null)
               {
                   break;
               }
               
               while(temp.right!=null)
               {
                   temp = temp.right;
               }
               
               p.pre = temp;
               break;
           }
       }
       
       curr = root;
       
       s.succ = null;
       
       while(curr!=null)
       {
           if(curr.data>key)
           {
               s.succ = curr;
               curr = curr.left;
           }
           else if(curr.data<key)
           {
               curr = curr.right;
           }
           else
           {
               Node temp = curr.right;
               
               if(temp==null)
               {
                   break;
               }
               
               while(temp.left!=null)
               {
                   temp = temp.left;
               }
               
               s.succ = temp;
               break;
           }
       }
    }
}
