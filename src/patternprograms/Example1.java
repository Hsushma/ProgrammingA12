package patternprograms;

import java.util.Scanner;

public class Example1 
{

	public static void main(String[] args) 
	{
		int n = 3;
		for(int row =1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(row==1|| col==1 || row==n || col==n)
					System.out.print("*"+" ");
				else
					System.out.print("-"+" ");
			}
			System.out.println();
		}

	}

}
