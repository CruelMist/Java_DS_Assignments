class Node
{
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

class searchbst
{
    public static Node insert(Node root, int key)
    {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
        else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static void search(Node root, int key, Node parent)
    {
        if (root == null)
        {
            System.out.print("Key Not found");
            return;
        }

        if (root.data == key)
        {
            if (parent == null) {
                System.out.print("The node with key " + key + " is root node");
            }

            else if (key < parent.data) {
                System.out.print("Given key is left node of node with key "
                                        + parent.data);
            }
            else {
                System.out.print("Given key is right node of node with key "
                                        + parent.data);
            }
            return;
        }
        if (key < root.data) {
            search(root.left, key, root);
        }
        else {
            search(root.right, key, root);
        }
    }

    public static void main(String[] args)
    {
        Node root = null;
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        for (int key : keys) {
            root = insert(root, key);
        }
        search(root, 25, null);
    }
}