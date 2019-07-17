import java.util.*;
import java.util.Scanner.*;
// Delete a Node in Linkedlist at Random Given postion from User..
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
	public void deletion(int position)
	{
		Node temp = head;
		for(int i = 1;i<position-1;i++)
		{
			temp = temp.next;
		}
		Node tem = temp.next.next;
		temp.next = tem;
		//temp.next = temp.next.next; ye line bhi kaam karega instead of line 26 and 27
	}
	public void printlist()
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
		Linkedlistt llist = new Linkedlistt();
		while(true)
		{
			System.out.println("enter 1 if you want to add node at begning,press 2  for delete , press 5for break");
			   int n = sc.nextInt();
			   if(n ==1)
			   {
			   System.out.println("Enter no to add ::");
			   int number = sc.nextInt();
			   llist.begin(number);
			   }
			   else if(n==2)
			   {
				   System.out.println("Enter no to position ::");
			   int position = sc.nextInt();
			   llist.deletion(position);
			   }
			   else if(n==5)
			   {
				  llist.printlist(); 
				  break;
			   }
		}
	}
}