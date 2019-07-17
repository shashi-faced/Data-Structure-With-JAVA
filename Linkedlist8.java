import java.util.*;
import java.util.Scanner.*;
//find the lenght of loop in Linkekedlist..

public class Linkedlist8
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d){int data = d;next = null;}
	}
	public void begin(int newdata)
	{
		Node newnode = new Node(newdata);
		newnode.next = head;
		head = newnode;
	}	
	static int countloopsize()
	{
	Node slow = head;
    Node fast = head;
     while(slow != null && fast != null && fast.next != null)
	 {
		 slow = slow.next;
		 fast = fast.next.next;
		 if(slow == fast)
		 {
			 return countnodes(slow);
		 }
	 }
return 0;	 
	}
	public static int countnodes(Node n)
	{
		int ans = 0;
		Node temp = n;
		while(temp != n)
		{
			ans++;
		}
		return ans;
	}
	public void printlist()
	{
		Node tempp = head;
		while(tempp != null)
		{
			System.out.println(tempp.data);
			tempp = tempp.next;
		}			
	}
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Linkedlist8 llist = new Linkedlist8();
	while(true)
	{
		System.out.println("Press 1 for add element ");
		System.out.println("Enter 2 for detect loop ");
		System.out.println("Enter 5 for printlist ::");
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("Enter no: ");
			int num = sc.nextInt();
			llist.begin(num);
		}
		else if(n==2)
		{
			head.next.next.next.next = head.next.next;
			int check = llist.countloopsize();
			if(check > 0)
			{
				System.out.println(check);
			  break;
		    }
			else
			{
				System.out.println("Loop not found");
		}}
		else if(n==5)
		{
			llist.printlist();
			break;
		}
		else{
			System.out.println("wrong choice");
		}
	}
	}
}