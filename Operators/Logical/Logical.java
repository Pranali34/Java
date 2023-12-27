public class Logical
{
	public static void main(String args[])
    	{
		int x = 20;
		int y = 30;
		boolean z;
		
		System.out.println("\n*************Logical-Operator**************\n");

		System.out.println("x = "+x+ "\ny = "+y);

		z =  x < y && x <= y ;
		System.out.println("x is Less than y And x is Less than Or Equal to y = "+z); // T && T = true

		z =  x <= y && x == y;
		System.out.println("x is Less than Equal to y And x is Equal Equal to y = "+z); // T && F = false

		z =  x >= y && x != y ;
		System.out.println("x is Greater than Equal to y And x is Not Equal y = "+z); // F && T = false 

		z =  x == y && x > y;
		System.out.println(" x is Equal Equal to y And x is Greater than y = "+z); // F && F = false

		z =  x <= y || x != y;;
		System.out.println("x is Less than Or Equal to y Or x is Not Equal y = "+z); // T || T = true

		z =  x <= y || x > y;
		System.out.println("x is Less than Equal to y Or x is Greater than y = "+z); // T || F = true
		
		z =  x == y|| x != y;
		System.out.println("x is Equal Equal to y Or x is Not Equal y = "+z); // F|| T = true

		z =  x == y ||x > y;
		System.out.println("x is Equal Equal to y Or x is Greater than y = "+z); // F || F = true

	
		System.out.println("\n************************************************\n");

	}	    
}