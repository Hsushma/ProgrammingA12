package com.qspiders.forloop;

import java.util.Scanner;

public class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println(issunnynumber(num));
	}
	public static String issunnynumber(int num)
	{
		boolean flag =false;
		for(int i=1;i<=num/2;i++)
		{
			int sqr=num+1;
			if(i*i==sqr)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
			return " is sunny number";
		else
			return"is not a sunny number";
		
	}

}
