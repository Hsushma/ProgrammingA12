import java.util.Scanner;

public class Character3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		char ch='z';
		for(int row =1;row<=n;row++)
		{
			
			for(int col=1;col<=n;col++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}

}
