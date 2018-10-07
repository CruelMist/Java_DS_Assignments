//Delete Duplicate Elements
import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node head=null;
    public Node()
    {
        this.data=0;
        this.next=null;
    }
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    public Node add(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else
        {
            //System.out.println(head.data+" "+head.next);
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
            //System.out.print(" "+temp.data+" "+temp.next);
        }
        return head;
    }
    public Node Check_Dup(Node head)
    {
        int i=0;
        Node temp=head;
        int prev;
        while(temp.next!=null)
        {
            i++;
            prev=temp.data;
            temp=temp.next;
            if(prev==temp.data)
            {
                head=Deletion(head,i);
            }
        }
        return head;
    }

    public void display(Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public Node Deletion(Node head, int i)
    {
        Node temp=head;
        Node perv=null;
        while(i>2)
        {
            temp=temp.next;
            i--;
        }
        Node temp1=temp.next;
        temp.next=temp1.next;
        return head;
    }
}
class RemDupLL
{
    public static void main(String[] args)
    {
        Node n1=new Node();
        int a;
        Node d;
        int count=0;
        Scanner s=new Scanner(System.in);
        int i;
        System.out.println("Enter size of List");
        i=s.nextInt();
        int num=i;
        System.out.println("Enter sorted Elements");
        a=s.nextInt();
        d=n1.add(a);
        do {
            a=s.nextInt();
            if(i>0)
            {
                d=n1.add(a);
                i--;
            }
        } while (i>1);
        n1.display(d);
        d=n1.Check_Dup(d);
        System.out.println("Unique List");
        n1.display(d);
    }
}