public class Job_Role
{
	public static void main(String args[])
    	{
		String Qualification = "MCA";

		if(Qualification == "MCA")
		{
			System.out.println(" You are Eligible for This Job !!!");
	
			String Experience = "1+";

		   	if( Experience == "1+")
	           	{
	 	      		System.out.println(" You are Hired in th Company !!!");

				int Proj_Cnt = 3;
 
		     		if(Proj_Cnt >= 3)
	              		{
	 	        		System.out.println("You are Promoted as Team Head !!!");

					String Position = "Team Head";

			 		if(Position == "Team Head")
	                		{
	 	           			System.out.println(" Your Salary is 1Lakh !!!");
		        		}
		      		}
		   	}
		}
		else
		{
		   System.out.println(" You are Note Eligible for Job !!!");
		}
	}
}