class Solution {
    public Node connect(Node root) 
    {
        if(root==null)
        {
            return null;
        }

        Node curr = root;

        while(curr.left!=null)
        {
            Node temp = curr.left;

            while(curr!=null)
            {
                curr.left.next = curr.right;

                curr.right.next = (curr.next==null)?null:curr.next.left;

                curr = curr.next;
            }

            curr = temp;
        }

        return root;
    }
}
