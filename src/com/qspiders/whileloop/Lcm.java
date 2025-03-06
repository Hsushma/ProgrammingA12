package com.qspiders.whileloop;

import java.util.Scanner;

public class Lcm 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("enter the Secound number:");
		int num2 = sc.nextInt();
		int lcm=num1>num2?num1:num2;
		while(true)
		{
			if(lcm%num1==0 && lcm%num2==0)
			{
				System.out.println(lcm);
				break;
			}
			else
				lcm++;
		}
		System.out.println("lcm of"+num1+"and"+num2+"is:"+lcm);

	}

}
