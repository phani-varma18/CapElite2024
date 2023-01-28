

/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    int maxGCD(Node root) 
    {
        // code here 
        Queue<Node> q = new LinkedList<>();
        
        int max = 1,ans=0;
        
        q.offer(root);
        
        while(!q.isEmpty())
        {
            Node curr = q.poll();
            
            if(curr.left!=null && curr.right!=null)
            {
                int tempGcd = gcd(curr.left.data,curr.right.data);
                if(tempGcd>=max)
                {
                    ans = curr.data;
                    max = tempGcd;
                }
                
                q.offer(curr.left);
                q.offer(curr.right);
            }
            else if(curr.left!=null)
            {
                q.offer(curr.left);
            }
            else if(curr.right!=null)
            {
                q.offer(curr.right);
            }
        }
        
        return ans;
    }
    
    static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        
        return gcd(b%a,a);
    }
}
