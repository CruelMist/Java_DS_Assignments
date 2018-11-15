class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class leafgen
{

    Node root;

    int getLeafCount()
    {
        return getLeafCount(root);
    }

    int getLeafCount(Node node)
    {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }

    public static void main(String args[])
    {
        leafgen tree = new leafgen();
        tree.root = new Node(11);
        tree.root.left = new Node(21);
        tree.root.right = new Node(35);
        tree.root.left.left = new Node(74);
        tree.root.left.right = new Node(65);
		tree.root.right.left = new Node(30);
		tree.root.right.right = new Node(30);

        System.out.println("The leaf count of binary tree is : "
                             + tree.getLeafCount());
    }
}