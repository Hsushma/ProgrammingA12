package com.qspiders.whileloop;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		int rev=0,temp=n;
		while(n>0)
		{
			int rem = n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("is palindrome");
		}	
		else
		{
			System.out.println("not palindrome");
		}
	}
}
