package com.qspiders.whileloop;

import java.util.Scanner;

public class Sumnumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int sum=0;
		while(number>0)
		{
			int rem = number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println("sum is:"+sum);
		sc.close();
	}

}
