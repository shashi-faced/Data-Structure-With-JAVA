import java.util.*;
import java.lang.*;
import java.util.Scanner.*;

public class Linkedlist2
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
	   
	   public void last(int newdata)
	   {
		Node newnode = new Node(newdata);
		
		if(head==null)
		{
			head = new Node(newdata);
			head.next = null;//jab ek hi node head hai bus to head ke next me null otherwise double print hoga first time jab last me add hoga to
		}
		else{
        newnode.next = null;
		Node last = head;
		while(last.next !=null)
		{
			last = last.next;
		}
		last.next = newnode;
           }
	   }
	   
	   public void random(int pos,int newdata)
	   {
		   Node newnode = new Node(newdata);
		   Node temp = head;
		   
		   for(int i = 1;i<pos-1;i++)
		   {
			   temp = temp.next;
		   }
		   Node b = temp.next;
		   temp.next = newnode;
		   newnode.next = b;
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
		   Linkedlist2 llist = new Linkedlist2();
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
	   else if(n==2)
	   {
		 System.out.println("Enter no to add ::");
			   int number = sc.nextInt();
			   llist.last(number);  
	   }
	   else if(n==3)
	   {
		 System.out.println("Enter no to add ::");
			   int number = sc.nextInt();
			   int p = sc.nextInt();
			   llist.random(p,number); 
               llist.printlist();			   
	   }
		   }
}
}