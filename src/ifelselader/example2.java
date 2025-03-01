package ifelselader;

public class example2 
{
	public static void main(String[] args) 
	{
		int marks = 72;
		if(marks>=90 && marks<=100)
		{
			System.out.println("excelent");
		}
		else if(marks>=60 && marks<90)
		{
			System.out.println("average");	
		}
		else if(marks>40 && marks<60)
		{
			System.out.println("not bad");
		}
		else if(marks>=0 && marks<40)
		{
			System.out.println("bad");
		}
		else
		{
			System.out.println("invalid input");
		}
	}

}
