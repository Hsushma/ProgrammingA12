package nestedloop;

import java.util.Scanner;

public class AmstrongNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum=0,temp=n,count=0;
		while(n>0)
		{
			n/=10;
			count++;
		}
		n=temp;
		while(n>0)
		{
			int rem=n%10;
			int pow=1;
			for(int i =1;i<=count;i++)
			{
				pow=pow*rem;
			}
			sum=sum+pow;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("it is amstrong number");
		}
		else
		{
			System.out.println("it is not a amstrong number");
		}
	}
}
