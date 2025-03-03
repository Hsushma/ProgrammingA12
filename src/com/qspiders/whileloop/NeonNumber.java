package com.qspiders.whileloop;

import java.util.Scanner;

public class NeonNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum =0;
		int sqrt=n*n;
		while(sqrt>0)
		{
			int rem=sqrt%10;
			sum=sum+rem;
			sqrt=sqrt/10;
		}
		if(sum==n)
			System.out.println("is neon number");
		else
			System.out.println("not");
		sc.close();

	}

}
