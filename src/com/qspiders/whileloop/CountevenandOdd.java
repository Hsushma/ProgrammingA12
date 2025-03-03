package com.qspiders.whileloop;

import java.util.Scanner;

public class CountevenandOdd 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int evencount=0;
		int oddcount=0;
		
		System.out.println("enter the number");
		int number=sc.nextInt();
		
		while(number>0)
		{
			int rem = number%10; //fetch last digit from given number
			
			if(rem%2==0)
			{
				evencount++;
			}
				
			else
			{
				oddcount++;
			}
				
			number = number/10; //remove the last digit
		}
			System.out.println("evencount :"+evencount);
			System.out.println("oddcount :"+oddcount);
			sc.close();
	}

}
