package patternprograms;

import java.util.Scanner;

public class Exmple4
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int row =1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(row==n/2+1)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}

}
