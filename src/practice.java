import java.util.Scanner;

public class practice 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int evencount=0,oddcount=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			n=n/10;
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}

}
