package com.qspiders.forloop;

import java.util.Scanner;

public class PerfactNumber
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("is perfact");
		}
		else
		{
			System.out.println("not a perfact");
		}
	}
}
