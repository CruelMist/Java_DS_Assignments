import java.util.Scanner;

class Que
{
	private int data;
	private Que next;
	public Que push(Que head,int data2)
	{
		Que temp = new Que();
		temp.data=data2;
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Que ptr = head;
			while( ptr.next != null )
			{
				ptr = ptr.next;
			}
			ptr.next = temp;
		}
		return head;
	}
	public Que pop(Que head)
	{
		if(head==null)
			System.out.println("underflow");
		else
		    head=head.next;
		return head;
	}
	public void display(Que head)
	{
		Que ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr =ptr.next;
		}
		System.out.println();
	}
}
class Stck
{
	private int data;
	private Stck next;
	public Stck push(Stck head,int data2)
	{
		Stck temp = new Stck();
		temp.data=data2;
		if(head==null)
			head=temp;
		else
		{
			temp.next=head;
			head=temp;
		}
		return head;
	}
	public Stck pop(Stck head)
	{
		if(head==null)
			System.out.println("underflow");
		else
		    head=head.next;
		return head;
	}
	public void display(Stck head)
	{
		Stck ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
}
public class implement {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("type 1 for stack and 2 for Queue.......");
	  int choice = scan.nextInt();
	  if(choice == 1)
	  {
		  Stck head=null;
		  Stck S1 = new Stck();
		  for(int i=1;i<=4;i++)
		  {
			  head=S1.push(head, i*10);
		  }
		  S1.display(head);
		  head = S1.pop(head);
		  S1.display(head);
		  head=S1.push(head, 60);
		  S1.display(head);
	  }
	  else if(choice == 2)
	  {
		  Que head=null;
		  Que S1 = new Que();
		  for(int i=1;i<=4;i++)
		  {
			  head=S1.push(head, i*10);
		  }
		  S1.display(head);
		  head=S1.pop(head);
		  S1.display(head);
		  head=S1.push(head, 60);
		  S1.display(head);
	  }
	  else
		  System.out.println("wrong choice mate ! sad life.....");

	}

}