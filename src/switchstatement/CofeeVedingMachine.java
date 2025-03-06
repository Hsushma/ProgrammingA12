package switchstatement;

import java.util.Scanner;

public class CofeeVedingMachine 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please Select what do you want:");
		System.out.println("1.coffee\n2.Tea \n 3.soda");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("coffee");
		
				break;
		case 2:System.out.println("Tea");
				break;
		case 3:System.out.println("Sod");
				break;
		
		}
		

	}
	public static void vendingmachine()
	{
		
	}
}
