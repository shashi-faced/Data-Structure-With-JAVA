import java.util.*;
import java.lang.*;
import java.util.Scanner.*;
//searching a node with node value in linkedlist
public class Linkedlist5
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
		public void searchnode(int num)
	   {    int count = 1;
		   Node temp = head;
		   while(temp!=null)
		   {
			  if(temp.data == num)
			  {
				  System.out.println("your number is at pos : "+count);
				  
			  }
			   temp = temp.next;
			   count++;
		   }
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
		   Linkedlist5 llist = new Linkedlist5();
		    while(true)
		   {
			   System.out.println("enter 1 if you want to add node at begning,press 3 for search a NODE , press 5for break");
			   int n = sc.nextInt();
			   if(n ==1)
			   {
			   System.out.println("Enter no to add ::");
			   int number = sc.nextInt();
			   llist.begin(number);
			   }
			   else if(n==5)
			   {
		   System.out.println("Linked list is created");
		   llist.printlist();
		   break;
	          }
			  else if(n==3)
	         	{
					int search = sc.nextInt();
					llist.searchnode(search);
			   }
		   }
	   }
}