package switchstatement;

public class TolearnSwitch 
{

	public static void main(String[] args) 
	{
		String str ="North";
		str=str.toUpperCase();
		switch(str)
		{
		case "NORTH" : System.out.println("heading north");
		  				break;
		case "EAST" : System.out.println("heading East");
						break;
		case "West" : System.out.println("heading West");
						break;
		case "South" : System.out.println("heading South");
						break;
		default:System.out.println("invalid");
		}
	}

}
