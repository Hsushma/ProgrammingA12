package patternprograms;

import java.util.Scanner;

public class Character2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		char ch='A';
		for(int row =1;row<=n;row++)
		{
			
			for(int col=1;col<=n;col++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
