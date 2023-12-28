public class Grade_System
{
	public static void main(String args[])
    	{
		String Grade = "90+";
		
		if(Grade == "90+")
		{
			System.out.println("A+");
		}
		else if(Grade == "70+")
		{
			System.out.println("A");
		}
		else if(Grade == "60+")
		{
			System.out.println("B");
		}
		else if(Grade == "50+")
		{
			System.out.println("C");
		}
		else if(Grade == "35+")
		{
			System.out.println("D");
		}
		else 
		{
			System.out.println("FAIL !!!");
		}
		
	}
}