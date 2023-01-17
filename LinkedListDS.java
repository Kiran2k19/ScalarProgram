package basicthings.Collection;

import java.util.Scanner;

public class LinkedListDS {
	
	Node head;
	Scanner sc=new Scanner(System.in);
	int data;
	public void insert()
	{
	
		System.out.println("Enter the Data: ");
		data=sc.nextInt();
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void insertAtStart()
	{
		System.out.println("Enter the Data: ");
		data=sc.nextInt();
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
		
	}
	public void insertAtIndexPosition()
	{
		System.out.println("Enter the Data: ");
		data=sc.nextInt();
		System.out.println("Enter the index position: ");
		int index=sc.nextInt();
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(index==0)
		{
			insertAtStart();
		}
		Node n=head;
		for(int i=0;i<index;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node; 
		
	}
	public void deleteAt()
	{
		System.out.println("Enter the index position: ");
		int index=sc.nextInt();
		
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("Deleted Element: "+n1.data);
			n1=null;
		}
	}
	
	public void display()
	{
		Node node=head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	
	
	

}
