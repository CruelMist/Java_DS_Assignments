/*QueUeWith2Stacks*/
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

public class qts {

	public static void main(String[] args) {
		Que1 Q1 = new Que1();
		System.out.println("creating Queue...........");
		for(int i=1;i<=5;i++)
		 Q1.push(i*10);
		System.out.println("displaying Queue...........");
		Q1.display();
		Stck1 S1 = new Stck1();
		Stck1 S2 = new Stck1();
		System.out.println("transfering Queue to first Stack.............");
		while(true)
		{
			if(Q1.isEmpty())
				break;
			S1.push(Q1.pop());
		}
		System.out.println("transfering first Stack into second Stack............... ");
		while(true)
		{
			if(S1.isEmpty())
				break;
			S2.push(S1.pop());
		}
		S2.display();
	}
}