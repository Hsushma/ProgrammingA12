package com.qspiders.whileloop;

import java.util.Scanner;

public class ReversNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int rev=0;
		while(number>0)
		{
			int rem = number%10;
			rev=(rev*10)+rem;
			number=number/10;
		}
		System.out.println(rev);
	}

}
