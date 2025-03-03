package com.qspiders.whileloop;

import java.util.Scanner;
 
public class Countnum 
{
	//count the digits present in given number
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++; 
		}
		System.out.println("total count is :"+count);
	}
}
