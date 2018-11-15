class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Que4
{
    Node root1, root2;
    boolean identicalTrees(Node a, Node b)
    {

        if (a == null && b == null)
            return true;

        if (a != null && b != null)
            return (a.data == b.data
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));
        return false;
    }

    public static void main(String[] args)
    {
        Que4 tree = new Que4();

        // 1st Tree
        tree.root1 = new Node(15);
        tree.root1.left = new Node(20);
        tree.root1.right = new Node(37);
        tree.root1.left.left = new Node(94);
        tree.root1.left.right = new Node(55);
        tree.root1.right.left = new Node(35);
		tree.root1.right.right = new Node(78);

		//2nd Tree
        tree.root2 = new Node(15);
        tree.root2.left = new Node(20);
        tree.root2.right = new Node(37);
        tree.root2.left.left = new Node(94);
        tree.root2.left.right = new Node(55);
        tree.root2.right.left = new Node(35);
		tree.root2.right.right = new Node(78);

        if (tree.identicalTrees(tree.root1, tree.root2))
            System.out.println("Both trees are Equal");
        else
            System.out.println("Trees are not Equal");

    }
}