package basicthings.Collection;

import java.util.Scanner;

public class ArrayDS {
	
	int size,loc,i;
	int a[]=new int[size];
	
	Scanner sc=new Scanner(System.in);

	public void add()
	{
		System.out.println("Enter the Array Size:");
		size=sc.nextInt();
		
		int a[]=new int[size];
		
		if(a[i]==size)
		{
			System.out.println("Array is full");
		}
		else
		{
		System.out.println("Enter the Array Element:");
		for(i=0;i<=size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		}
	}
	
	public void delete()
	{
		System.out.println("Enter Array Location:");
		loc=sc.nextInt();
		for(i=loc;i<size-1;i++)
		{
			a[i]=a[i+1];
		}
		size--;
		
	}
	public void display()
	{
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		ArrayDS a=new ArrayDS();
		a.add();
		
	}

}
 