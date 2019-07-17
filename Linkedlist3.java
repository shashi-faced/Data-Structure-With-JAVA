import java.util.*;
import java.util.Scanner.*;

public class Linkedlistt
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d){data = d;next = null;}
	}
	public void  begin(int newdata)
	   {
		  Node newnode = new Node(newdata);
		  newnode.next = head;
		  head = newnode;
	   }
	public class delbegin(int position)
	{
		Node temp = head;
		for(int i = 1;i<position-1;i++)
		{
			temp = temp.next;
		}
		Node aa = temp.next;
		Node tem = aa.next;
		temp.next = tem;
	}
	public void printllist()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Linkedlistt llist3 = new Linkedlistt();
		while(true)
		{
			System.out.println("enter 1 if you want to add node at begning,press 2 for add at LAST , press 5for break");
			   int n = sc.nextInt();
			   if(n ==1)
			   {
			   System.out.println("Enter no to add ::");
			   int number = sc.nextInt();
			   llist3.begin(number);
			   }
			   else if(n==2)
			   {
				   System.out.println("Enter no to pos ::");
			   int position = sc.nextInt();
			   llist3.delbegin(position);
			   }
		}
	}
}