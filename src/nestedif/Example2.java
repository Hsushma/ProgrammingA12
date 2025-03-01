package nestedif;

public class Example2 
{

	public static void main(String[] args)
	{
		int num = 6;
		if(num%2==0 )
		{
			System.out.println("it is even");
			if(num%5==0)
			{
				System.out.println("divisible by 5");
			}
			else
			{
				System.out.println("not divisible by 5");
			}
		}
		else
		{
			System.out.println("not a even");
		}
	}

}
