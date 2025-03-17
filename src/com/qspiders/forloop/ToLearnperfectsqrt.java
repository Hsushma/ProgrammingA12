package com.qspiders.forloop;

import java.util.Scanner;

public class ToLearnperfectsqrt 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println(isperfect(num));
	}
	public static String isperfect(int num)
	{
		boolean flag =false;
		int i;
		for(i=1;i<=num/2;i++)
		{
			if(i*i==num)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
			return "perfect sqr for given number"+i;
		else
			
			return "there is no perfect sqr for given number";
	}

}
