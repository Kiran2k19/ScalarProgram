package basicthings.Collection;

import java.util.Scanner;

public class DataOperation {

	public static void main(String[] args) {
		

		int choice=-1;
		char str;
		do {

			System.out.println("1. Stack");
			System.out.println("2. Queue");
			System.out.println("3. Linked List");
			System.out.println("4. Array");
			System.out.println("5. Exit"); 
			System.out.println("-----------------");
			System.out.println("Enter Your choice: ");

			
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Stack Operation:");
				StackDS s=new StackDS();
				char str1;
				
					do
					{
						System.out.println("1. push");
						System.out.println("2. Pop");
						System.out.println("3. peak");
						System.out.println("4. display");
						System.out.println("5. Exit");
			
					System.out.println("Which operation you have to perform:");
					int ch=sc.nextInt();
					switch(ch)
					{
						case 1:s.push();break;
						case 2:s.pop();break;
						case 3:s.peak();break;
						case 4:s.display();break;
						case 5:System.out.println("thank...");break; 
						default:System.out.println("Invalid intput");
					}
					System.out.println("Do you want to continue: ");
					str1=sc.next().charAt(0);
					}while(str1=='y');
					break;
				
			case 2:
					System.out.println("Queue Operation:");
					QueueDS queue=new QueueDS();
					char str2;
					
					do
					{
						System.out.println("1. Enqueue");
						System.out.println("2. Dequeue");
						System.out.println("3. peak");
						System.out.println("4. Exit"); 
						
						System.out.println("Which operation you have to perform:");
						int ch=sc.nextInt();
						switch(ch)
						{
							case 1:queue.enqueue();break;
							case 2:queue.dequeue();break;
							case 3:queue.peak();break;
							case 4:System.out.println("thank...");break; 
							default:System.out.println("Invalid intput");
						}
						
						System.out.println("Do you want to continue:{y/n} ");
						str2=sc.next().charAt(0);
					}while(str2=='y');
					break;
			
			
			
			
			case 3:
					System.out.println("Link List Operation:");
					LinkedListDS linkedList=new LinkedListDS();
					char str3;
				
				do
				{
					System.out.println("1. Insert");
					System.out.println("2. insertAtStart");
					System.out.println("3. insertAtIndexPosition");
					System.out.println("4. Display");
					System.out.println("5. DeleteAtIndexPosition");
					System.out.println("6. Exit"); 
					
					System.out.println("Which operation you have to perform:");
					int ch=sc.nextInt();
					switch(ch)
					{
						case 1:linkedList.insert();break;
						case 2:linkedList.insertAtStart();break;
						case 3:linkedList.insertAtIndexPosition();break;
						case 4:linkedList.display();break;
						case 5:linkedList.deleteAt();break;
						case 6:System.out.println("thank...");break; 
						default:System.out.println("Invalid intput");
					}
					
					System.out.println("Do you want to continue:{y/n} ");
					str3=sc.next().charAt(0);
				}while(str3=='y');
				
				
				
				break;
			case 4:
					System.out.println("Array Operation:");
					ArrayDS array=new ArrayDS();
					char str4;
				
				do
				{
					System.out.println("1. Add");
					System.out.println("2. Remove");
					System.out.println("3. Display");
					System.out.println("4. Exit"); 
					
					System.out.println("Which operation you have to perform:");
					int ch=sc.nextInt();
					switch(ch)
					{
						case 1:array.add();break;
						case 2:array.delete();break;
						case 3:array.display();break;
						case 4:System.out.println("thank...");break; 
						default:System.out.println("Invalid intput");
					}
					
					System.out.println("Do you want to continue:{y/n} ");
					str4=sc.next().charAt(0);
				}while(str4=='y');
				break;
				
			case 5: System.out.println("Thanks.....");break;
			default:System.out.println("Invalid intput");

			}
		
			System.out.println("Do you want to Perform any DS operation:{y/n} ");
			str=sc.next().charAt(0);

		}while(str=='y');
}
	
}
