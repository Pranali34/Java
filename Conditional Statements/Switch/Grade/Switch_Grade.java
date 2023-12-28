public class Switch_Grade
{
	public static void main(String args[])
    	{
		String Grade = "A";
		
		switch(Grade)
		{
			case "A+" :
			System.out.println("You Got 90+");
			break;

			case "A" :
			System.out.println("You Got Between 90-80");
			break;
		
			case "B" :
			System.out.println("You Got Between 80-65");
			break;

			case "C" :
			System.out.println("You Got Between 65-50");
			break;

			case "D" :
			System.out.println("You Got Between 50-35");
			break;

			default:
			System.out.println("Fail !!!");
			break;
		}
	}
}
		