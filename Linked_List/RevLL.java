//Reverse of LinkList
import java.util.Scanner;
class Node2
{
    int data;
    Node2 next;
    Node2 prev;
    Node2 head=null;
    public Node2()
    {
        this.data=0;
        this.next=null;
        this.prev=null;
    }
    public Node2(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    public Node2 add(int data)
    {
        Node2 n=new Node2(data);
        if(head==null)
        {
            head=n;
        }
        else
        {
            //System.out.println(head.data+" "+head.next);
            Node2 temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }

            temp.next=n;
            n.prev=temp;
            //System.out.print(" "+temp.data+" "+temp.next);
        }
        return head;
    }
    public void display(Node2 head)
    {
        Node2 temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void display_rev(Node2 head)
    {
        Node2 temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        while(temp.prev!=null)
        {
            System.out.println(temp.data);
            temp=temp.prev;
        }
        System.out.println(temp.data);
    }
}
class RevLL
{
    public static void main(String[] args)
    {
        Node2 n1=new Node2();
        int a;
        Node2 d;
        Scanner s=new Scanner(System.in);
        System.out.println("Size of Linked List : ");
        int i=s.nextInt();
        System.out.println("Enter Elemens : ");
        a=s.nextInt();
        d=n1.add(a);
        i--;
        do {
            a=s.nextInt();
            if(i>0)
            {
                d=n1.add(a);
                i--;
            }
        } while (i>0);
        n1.display(d);
        System.out.println("Reverse Link List : ");
        n1.display_rev(d);
        s.close();
    }
}