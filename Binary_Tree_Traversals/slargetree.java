class Node {

    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class Que3 {


    Node root;

    Que3()
    {
        root = null;
    }

    public void insert(int data)
    {
        this.root = this.insertRec(this.root, data);
    }

    Node insertRec(Node node, int data)
    {

        if (node == null) {
            this.root = new Node(data);
            return this.root;
        }


        if (data < node.data) {
            node.left = this.insertRec(node.left, data);
        } else {
            node.right = this.insertRec(node.right, data);
        }
        return node;
    }


    public class count {
        int c = 0;
    }


    void secondLargestUtil(Node node, count C)
    {
        if (node == null || C.c >= 2)
            return;

        this.secondLargestUtil(node.right, C);
        C.c++;

        if (C.c == 2) {
            System.out.print("2nd largest element is "+ node.data);
            return;
        }
        this.secondLargestUtil(node.left, C);
    }

    void secondLargest(Node node)
    {
        count C = new count();
        this.secondLargestUtil(this.root, C);
    }

    public static void main(String[] args)
    {
        Que3 tree = new Que3();


        tree.insert(100);
        tree.insert(80);
        tree.insert(790);
        tree.insert(1100);
        tree.insert(1233);
        tree.insert(1234);
        tree.insert(8);

        tree.secondLargest(tree.root);
    }
}