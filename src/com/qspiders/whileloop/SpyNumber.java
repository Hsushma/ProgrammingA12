package com.qspiders.whileloop;

import java.util.Scanner;

public class SpyNumber 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0,product=1;
		System.out.println("enter the number");
		int num =sc.nextInt();
		while(num>0)
		{
			int rem = num%10;
			sum=rem+sum;
			product=product*rem;
			num=num/10;
		}
		if(product==sum)
		{
			System.out.println("is a spy number");
		}
		else
		{
			System.out.println("not a spy number");
		}
		sc.close();
			
	}

}
