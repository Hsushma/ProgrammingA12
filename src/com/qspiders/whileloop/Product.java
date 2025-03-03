package com.qspiders.whileloop;

import java.util.Scanner;

public class Product 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int product =1;
		System.out.println("enter the number");
		int number = sc.nextInt();
		while(number>0)
		{
			int rem = number%10;
			product = product*rem;
			number=number/10;
		}
		System.out.println(product);
		sc.close();
	}

}
