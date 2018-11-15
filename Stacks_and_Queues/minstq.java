import java.util.*;
class Stck1
{
	private int data;
	private Stck1 next;
	Stck1 Head1=null;
	int Min=1000000;
	public void push(int data2)
	{
		Stck1 temp = new Stck1();
		temp.data=data2;
		if(Min>temp.data)
			Min = temp.data;
		if(Head1==null)
			Head1=temp;
		else
		{
			temp.next=Head1;
			Head1=temp;
		}
	}
	public int peek()
	{
		return Head1.data;
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

public class minstq {

	public static void main(String[] args) {
		Stck1 S1 = new Stck1();
		System.out.println("creating Stack...........");
		for(int i=1;i<=5;i++)
		 S1.push(i*10);
		System.out.println("displaying Stack...........");
		S1.display();
		System.out.println("Minimum="+S1.Min);
		S1.pop();
		System.out.println("after pop");
		S1.display();
		}
}