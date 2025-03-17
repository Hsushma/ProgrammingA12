package com.qspiders.forloop;

import java.util.Scanner;

public class FibonaciNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		fibonacci(num);
	} 
	public static void fibonacci(int num)
	{
		int n1 =0,n2=1,temp=0;
		for(int i=0;i<num;i++)
		{
			System.out.println(n1);	
			temp=n1+n2;
			n1=n2;
			n2=temp;
		}
		
	}
}
