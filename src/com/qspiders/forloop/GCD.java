package com.qspiders.forloop;

import java.util.Scanner;

public class GCD 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gcd=0;
		for (int i = 1; i <= n1 && i <= n2; i++) 
		{
	        if (n1 % i == 0 && n2 % i == 0) 
	        {
	            gcd = i;
	        }
	    }
		System.out.println(gcd);
	}

}
