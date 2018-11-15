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

class Que5
{
    Node root;

    void mirror()
    {
        root = mirror(root);
    }

    Node mirror(Node node)
    {
        if (node == null)
            return node;
        Node left = mirror(node.left);
        Node right = mirror(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    void inOrder()
    {
        inOrder(root);
    }

    void inOrder(Node node)
    {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }

    public static void main(String args[])
    {

        Que5 tree = new Que5();
        tree.root = new Node(11);
        tree.root.left = new Node(12);
        tree.root.right = new Node(13);
        tree.root.left.left = new Node(14);
        tree.root.left.right = new Node(15);


        System.out.println("Inorder traversal of Given tree is :");
        tree.inOrder();
        System.out.println("");
        tree.mirror();

        System.out.println("Inorder traversal of Mirror binary tree is : ");
        tree.inOrder();

    }
}