package nestedloop;

import java.util.Scanner;

public class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sqrt;
		while(true)
		{
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				sqrt=rem*rem;
				sum=sum+sqrt;
				n=n/10;
			}
			n=sum;
			if(sum==1)
			{
				System.out.println("happy number");
				break;
			}
			else if(sum==4)
			{
				System.out.println("not a happy number😒😒😒😒😒");//window+.
				break;
			}
		}
	}

}
