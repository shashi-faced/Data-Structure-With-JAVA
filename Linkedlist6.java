import java.util.*;
import java.util.Scanner.*;
import java.lang.*;
//Write a function that counts the number of times a given int occurs in a Linked List
public class Linkedlist6
{
	Node head;
	public class Node
	{
		int data;
		Node next;
		Node(int d){data = d;next = null;}
	}
	public void begin(int newdata)
	{
		Node newnode = new Node(newdata);
		newnode.next = head;
		head = newnode;
	}
	public void searchcount(int num)
	{   int count = 0;
		Node tempp = head;
		while(tempp!=null)
		{
			if(tempp.data == num)
			{
				count++;
			}
			tempp = tempp.next;
		}
		System.out.println(num+" is "+count+" times");
	}
	public void printlist()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Linkedlist6 llist= new Linkedlist6();
		while(true)
		{
			System.out.println("Enter 1 to add no at begin...enter 2 for search an node");
			int n = sc.nextInt();
			if(n==1)
			{
				System.out.println("ENter number :: ");
				int numb = sc.nextInt();
				llist.begin(numb);
			}
			else if(n==2)
			{
				System.out.println("enter Number to check ::");
				int nu = sc.nextInt();
				llist.searchcount(nu);
				break;
			}
			else if(n==3)
			{
				llist.printlist();
				llist.printlist();
				break;
			}
		}
	}
	
}