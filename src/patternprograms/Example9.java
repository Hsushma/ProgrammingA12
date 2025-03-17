package patternprograms;

import java.util.Scanner;

public class Example9 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int count =1;
		for(int row =1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
