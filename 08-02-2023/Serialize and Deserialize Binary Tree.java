public class Codec {

    // Encodes a tree to a single string.
    public void serialize(TreeNode root,StringBuilder sb)
    {
        if(root==null)
        {
            sb.append("null,");
        }

        sb.append(root.val+",");
        serialize(root.left);
        serialize(root.right);
    }
    public String serialize(TreeNode root) 
    {
        StringBuilder sb = new StringBuilder();
        serialize(root,sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    int i=0;
    public TreeNode deserialize(String[] arr)
    {
        if(i>=arr.length || arr[i].equals("null"))
        {
            i++;
            return null;
        }
        int data = Integer.parseInt(arr[i++]);
        TreeNode node = new TreeNode(data);

        node.left = deserialize(arr);
        node.right = deserialize(arr);

        return node;
    }
    public TreeNode deserialize(String data) 
    {
        String[] arr = data.split(",");

        return deserialize(arr);
    }
}
