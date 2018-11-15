/*Stack to Queue*/
import java.util.*;
class Que1
{
	private int data;
	private Que1 next;
	Que1 head =null;
	public void push(int data2)
	{
		Que1 temp = new Que1();
		temp.data=data2;
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Que1 ptr = head;
			while( ptr.next != null )
			{
				ptr = ptr.next;
			}
			ptr.next = temp;
		}
	}
	public int pop()
	{
		Que1 temp = null;
		if(head==null)
			System.out.println("underflow");
		else
		{
			temp=head;
		    head=head.next;
		}
		return temp.data;
	}
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		return false;
	}
	public void display()
	{
		Que1 ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr =ptr.next;
		}
		System.out.println();
	}
}

class Stck1
{
	private int data;
	private Stck1 next;
	Stck1 Head1=null;
	public void push(int data2)
	{
		Stck1 temp = new Stck1();
		temp.data=data2;
		if(Head1==null)
			Head1=temp;
		else
		{
			temp.next=Head1;
			Head1=temp;
		}
	}
	public int pop()
	{
	    Stck1 temp = null;
		if(Head1==null)
			System.out.println("underflow");
		else
		{
			temp=Head1;
		    Head1=Head1.next;
		}
		return temp.data;
	}
	public boolean isEmpty()
	{
		if(Head1==null)
			return true;
		return false;
	}
	public void display()
	{
		Stck1 ptr = Head1;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
}

public class stq {

	public static void main(String[] args) {
		Stck1 S1 = new Stck1();
		System.out.println("creating Stack...........");
		for(int i=1;i<=5;i++)
		 S1.push(i*10);
		System.out.println("displaying Stack...........");
		S1.display();
		Que1 Q1 = new Que1();
		Que1 Q2 = new Que1();
		System.out.println("transfering Stack to first Que.............");
		while(true)
		{
			if(S1.isEmpty())
				break;
			Q1.push(S1.pop());
		}
		System.out.println("transfering first Stack into second Stack............... ");
		while(true)
		{
			if(Q1.isEmpty())
				break;
			Q2.push(Q1.pop());
		}
		Q2.display();
	}
}