package com.qspiders.whileloop;
import java.util.Scanner;
public class PrintEvenNumbers
{

	public static void main(String[] args) 
	{
	//print the even numbers from 1 to 100
		int i=1;
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
