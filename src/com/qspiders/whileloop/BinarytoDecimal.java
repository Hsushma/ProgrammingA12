package com.qspiders.whileloop;

import java.util.Scanner;

public class BinarytoDecimal 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the binary number");
		int binary = sc.nextInt();
		int power=1,decimal=0;
		while(binary>0)
		{
			int rem = binary%10;
			decimal=(rem*power)+decimal;
			binary=binary/10;
			power=power*2;
		}
		System.out.println("decimal:"+decimal);
	}

}
