import java.util.*;
import java.util.Scanner.*;
import java.lang.*;
//Detect A Loop in Given LinkedLinkedlist..
public class Linkedlist7
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d){data = d;next = null;}
	}
	/*int detectloop()
	{
		Node slow = head;
		Node fast = head;
		
		while(slow != null && fast.next != null && fast != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow.data==fast.data)
				return 1;
		
		}
		return 0;
		
	}*/
	 int detectLoop() 
    {   
        Node slow = head, fast = head; 
        while (slow != null && fast != null && fast.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
            if (slow == fast) 
			{ 
                return 1; 
            } 
        } 
        return 0; 
    } 
	public void begin(int newdata)
	{
		Node newnode = new Node(newdata);
		newnode.next = head;
		head = newnode;
	}
	public void loop()
	{
		//head.next.next.next.next.next = head.next.next;
	}
	public void printlist()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Linkedlist7 llist = new Linkedlist7();
		while(true)
		{
		System.out.println("Enter 1 for add node at begin .Enter 2 for detect Loop is Exist or Not..press 5 for Break");
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("enter no: ");
			int num = sc.nextInt();
			llist.begin(num);
		}
		
		else if(n==5)
		{
			llist.printlist();
			break;
		}
		else if(n==2)
		{
			llist.loop();
			llist.detectLoop();
			if(llist.detectLoop()==0)
			{
				System.out.println("Not found Hurray");
			    break;
		    }
			else if(llist.detectLoop()== 1)
			{
				System.out.println("Loop Found Hurray");
				break;
			}
		}
	}
	/*Node head;
	head = new Node(1);
	head.next = new Node(2);
	head.next.next = new Node(3);
	head.next.next.next = new Node(4);
	head.next.next.next.next = new Node(5);
	head.next.next.next.next.next = head.next.next;
	Linkedlist7 li = new Linkedlist7();
	if(li.detectloop(head)==true)
		System.out.println("FOund");
	else
		System.out.println("Not FOund");
	
	
	
	
	
	
	
	
	
	*/
	
}
}