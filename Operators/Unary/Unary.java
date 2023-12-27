public class Unary
{
	public static void main(String args[])
    	{
		int a = 23;

		System.out.println("\n*************Post-Increment**************\n");
			
		int b = a++;
		System.out.println(a); //24
		System.out.println(a++); //24
		System.out.println(b++); //23
		System.out.println(a);	//25
		System.out.println(b);//24	
		
		System.out.println("\n*************Post-Decrement**************\n");	
			         
		a = 23;
		b = a--;
		System.out.println(a); //22
		System.out.println(a--); //22
		System.out.println(b--); //23
		System.out.println(a); //21	
		System.out.println(b); //22

		System.out.println("\n*************Pre-Increment**************\n");
		
		a = 23;	
		b = ++a;
		System.out.println(a); //24
		System.out.println(++a); //25
		System.out.println(++b); //25
		System.out.println(a);	//25
		System.out.println(b);	//25

		System.out.println("\n*************Pre-Decrement**************\n");	
			         
		a = 23;
		b = --a;
		System.out.println(a); //22
		System.out.println(--a);//21
		System.out.println(--b);//21
		System.out.println(a);	//21
		System.out.println(b);	//21	 
	}
}