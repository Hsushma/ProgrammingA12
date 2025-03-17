package patternprograms;

import java.util.Scanner;

public class Charater1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		for(int row =1;row<=n;row++)
		{
			char ch='A';
			for(int col=1;col<=n;col++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
