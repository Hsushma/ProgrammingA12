package com.qspiders.whileloop;

import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal number");
		int decimal = sc.nextInt();
		int power=1,binary=0;
		while(decimal>0)
		{
			int rem=decimal%2;
			binary=(rem*power)+binary;
			decimal=decimal/2;
			power=power*10;
		}
		System.out.println(binary);

	}
	
}
