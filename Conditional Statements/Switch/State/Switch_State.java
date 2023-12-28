public class Breakfast
{
	public static void main(String args[])
    	{
		String day = "Monday";
				
		switch(day)
		{
			case "Sunday" :
			System.out.println("Dosa");
			break;

			case "Monday" :
			System.out.println("Pohe");
			break;
		
			case "Tuesday" :
			System.out.println("Upma");
			break;

			case "Wednesday" :
			System.out.println("Pav Bhaji");
			break;

			case "Thursday" :
			System.out.println("Shira");
			break;

			case "Friday" :
			System.out.println("Utappa");
			break;
			
			case "Saturday" :
			System.out.println("Idli");
			break;

			default:
			System.out.println("Invalid Day !!!");
			break;
		}
	}
}
		