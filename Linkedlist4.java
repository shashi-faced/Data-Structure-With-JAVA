import java.util.*;
import java.lang.*;
import java.util.Scanner.*;
//Find the SIze ofLinked List..
public class Linkedlist4
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
	   public void printlist()
	   {
		   Node temp = head;
		   while(temp!=null)
		   {
			   System.out.println(temp.data+" ");
			   temp = temp.next;
		   }
	   }
	   public void sizeoflist()
	   {int count = 0;
		   Node temp = head;
		   while(temp!=null)
		   {
			   temp = temp.next;
			   count++;
		   }
		   System.out.println("size of list is : "+count);
	   }
	   public static void main(String []args)
	   {
		  
		   Scanner sc = new Scanner(System.in);
		   Linkedlist4 llist = new Linkedlist4();
		    while(true)
		   {
			   System.out.println("enter 1 if you want to add node at begning,press 2 for add at LAST , press 5for break");
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
		   }
		   llist.sizeoflist();
	   }
}
			   