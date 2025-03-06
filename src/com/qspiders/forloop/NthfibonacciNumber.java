package com.qspiders.forloop;

import java.util.Scanner;

public class NthfibonacciNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int n1 =0,n2=1,temp=0;
		for(int i=1;i<=num;i++)
		{
			
			temp=n1+n2;
			n1=n2;
			n2=temp;
		}
		System.out.println("fibonacci number is "+n1);	

	}

}
