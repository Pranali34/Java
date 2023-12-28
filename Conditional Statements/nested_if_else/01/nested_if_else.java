public class nested_if_else
{
	public static void main(String args[])
    	{
		int age = 78;

		if(age >= 18)
		{
			System.out.println(" You are Eligible for Vote !!!");	
		   	if(age >= 25)
	           	{
	 	      		System.out.println(" You are Eligible for Vidhaan-Sabha !!!");
		     		if(age >= 35)
	              		{
	 	        		System.out.println(" You are Eligible for Lokk-Sabha !!!");
			 		if(age >= 40)
	                		{
	 	           			System.out.println(" You are Eligible for CM !!!");
			   			if(age >= 40)
	                   			{
	 	               				System.out.println(" You are Eligible for PM !!!");
		           			}
		        		}
		      		}
		   	}
		}
		else
		{
		   System.out.println(" You are Note Eligible for Vote !!!");
		}
	}
}