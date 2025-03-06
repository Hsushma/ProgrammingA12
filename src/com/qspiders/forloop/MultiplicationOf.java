package com.qspiders.forloop;

import java.util.Scanner;

public class MultiplicationOf 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		multiplication(n);

	}
	public static int multiplication(int n)
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
			
		}
		return n;
	}

}
