//Delete Duplicate Elements
import java.util.Scanner;
class Node3
{
    int data;
    Node3 next;
    Node3 head=null;
    Node3 head1=null;
    Node3 head2=null;
    public Node3()
    {
        this.data=0;
        this.next=null;
    }
    public Node3(int data)
    {
        this.data=data;
        this.next=null;
    }
    public Node3 add(int data)
    {
        Node3 n=new Node3(data);
        if(head==null)
        {
            head=n;
        }
        else
        {
            //System.out.println(head.data+" "+head.next);
            Node3 temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
            //System.out.print(" "+temp.data+" "+temp.next);
        }
        return head;
    }
    

    public void display(Node3 head)
    {
        Node3 temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}
class Func
{
    public Node3 Merge(Node3 head,Node3 head1)
    {
        int flag=-1;
        int i=0;
        Node3 temp1=head;
        Node3 temp2=head1;
        Node3 head2=new Node3(0);
        Node3 temp=head2;
        while (true)
        {
            if(temp1==null)
            {
                temp.next=temp2;
                break;                
            }
            if(temp2==null)
            {
                temp.next=temp1;
                break;                
            }
            if(temp2.data<temp1.data)
            {
                temp.next=temp2;
                temp2=temp2.next;
            }
            else
            {
                temp.next=temp1;
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        return head2.next;
    }
}
class MergeSortedLL
{
    public static void main(String[] args)
    {
        Node3 n1=new Node3();
        Node3 n2=new Node3();
        int a;
        Node3 d,d2,d3;
        int count=0;
        Scanner s=new Scanner(System.in);
        int i;
        System.out.println("Enter size of List 1");
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
        System.out.println("Enter size of List 2");
        i=s.nextInt();
        num=i;
        System.out.println("Enter sorted Elements");
        a=s.nextInt();
        d2=n2.add(a);
        do {
            a=s.nextInt();
            if(i>0)
            {
                d2=n2.add(a);
                i--;
            }
        } while (i>1);
        System.out.println("List 1");
        n1.display(d);
        System.out.println("List 2");
        n2.display(d2);
        d3=new Func().Merge(d,d2);
        System.out.println("Merged List");
        n1.display(d3);
    }
}