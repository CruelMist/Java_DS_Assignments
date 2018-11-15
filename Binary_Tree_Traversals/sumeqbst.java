import java.util.*;
class Node
{
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

class sumeqbst
{
    public static Node MinValue(Node node)
    {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static Node MaxValue(Node node)
    {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

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

    public static boolean findPair(Node X, Node Y, int pair_sum, Node x, Node y)
    {
        if (X == null || Y == null) {
            return false;
        }
        if (x.data + y.data < pair_sum)
        {
            if (findPair(X.left, Y, pair_sum, x, y)) {
                return true;
            }
            x = X;
            if (x != y && x.data + y.data == pair_sum)
            {
                System.out.print("Pair found (" + x.data + ", " + y.data + ")");
                return true;
            }
            return findPair(X.right, Y, pair_sum, x, y);
        }
        else
        {
            if (findPair(X, Y.right, pair_sum, x, y)) {
                return true;
            }
            y = Y;
            if (x != y && x.data + y.data == pair_sum)
            {
                System.out.print("Pair found (" + x.data + ", " + y.data + ")");
                return true;
            }
            return findPair(X, Y.left, pair_sum, x, y);
        }
    }

    public static void main(String[] args)
    {
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        Node root = null;
        for (int key : keys) {
            root = insert(root, key);
        }
        int pair_sum = 28;
        Node x = MinValue(root);
        Node y = MaxValue(root);
        if (!findPair(root, root, pair_sum, x, y)) {
            System.out.print("Pair do not exists");
        }
    }
}