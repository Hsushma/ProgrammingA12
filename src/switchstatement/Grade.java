package switchstatement;

public class Grade 
{

	public static void main(String[] args) 
	{
		char ch = 'E';
		switch(ch)
		{
		case 'A':System.out.println("Excellent");
					break;
		case 'B':System.out.println("Good");
					break;
		case 'C':System.out.println("passing grade");
					break;
		case 'D':System.out.println("need to improve");
					break;
		case 'E':System.out.println("failed");
					break;			
		default:System.out.println("invalid");
		}

	}

}
