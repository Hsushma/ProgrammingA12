
public class increment 
{

	public static void main(String[] args) 
	{
		int a= -9;
		int b=a++ + ++a + --a + a++ - a--;
		int c =b++ + a++ + ++b + ++a + a++ - b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
