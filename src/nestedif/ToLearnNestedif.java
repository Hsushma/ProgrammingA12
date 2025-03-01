package nestedif;

public class ToLearnNestedif 
{

	public static void main(String[] args) 
	{
		char ch ='A';
		if(ch>='a'&& ch<='z'||ch>='A' && ch<='Z')
		{
			if(ch>='a' && ch<='z')
			{
				System.out.println("lowecase");
			}
			else
			{
				System.out.println("uppercase");
			}
		}
		else
		{
			System.out.println("not a character");
		}

	}

}
