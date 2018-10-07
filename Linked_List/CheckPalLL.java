//Check for Palindrome
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
    public void Check_Pal(Node2 head,int i)
    {
        int j,k;
        int flag=-1;
        Node2 temp1=head;
        Node2 temp2=head;
        while(temp2.next!=null)
        {
            temp2=temp2.next;
        }
        //temp2=temp2.next;
        for(k=i-1,j=0;j!=k;k--,j++)
        {
            if(temp2.data==temp1.data)
            {
                flag=1;
            }
            else
            {
                flag=0;
                break;
            }
            temp2=temp2.prev;
            temp1=temp1.next;
        }
        if(flag==1)
        {
            System.out.println("List is Palindrome");
        }
        else if(flag==0)
        {
            System.out.println("List is not Palindrome");
        }
    }
}

class CheckPalLL
{
    public static void main(String[] args)
    {
        Node2 n1=new Node2();
        int a;
        Node2 d;
        Scanner s=new Scanner(System.in);
        int i;
        System.out.println("Enter size of List");
        i=s.nextInt();
        int num=i;
        System.out.println("Enter Elements");
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
        System.out.println("Doubly Link List : ");
        n1.display(d);
        n1.Check_Pal(d,num);
        s.close();
    }
}