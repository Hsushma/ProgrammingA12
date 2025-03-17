package nestedloop;

import java.util.Scanner;

public class StrongNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum=0,temp=n;
		while(n>0)
		{
			int fact=1;
			int rem = n%10;
			for(int i = rem;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
	} 

}
