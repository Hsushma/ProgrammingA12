package com.qspiders.forloop;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println(factorial(n));
		
	}
	public static int factorial(int n)
	{
		int fct=1;
		for(int i=n;i>=1;i--)
		{
			fct=fct*i;
		}
		return fct;
	}

}
