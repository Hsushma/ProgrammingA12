package com.qspiders.forloop;

import java.util.Scanner;

public class Perfectsqure 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		isperfect(num);
	}
	public static void isperfect( int num)
	{
		int sqrt=0;
		for(int i=1;i<num/2;i++)
		{
			sqrt=i*i;
		}
		if(sqrt==num)
		{
			System.out.println("perfect sqr");
		}
		else
		{
			System.out.println("not perfect sqr");
		}
	}
}
