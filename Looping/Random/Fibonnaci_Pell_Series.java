package com.sgm.task.Random;

public class Fibonnaci_Pell_Series {
	
	public static void main(String[] args) {
		
		int no = 6, a = 0 , b = 1, ans = 0, i= 0;
		
		System.out.println("\nfibonnaci Series \n");
		System.out.println(a+ "\n" +b);
		while(i <= no)
		{
			ans = a + b;
			System.out.println(ans);
			a = b;
			b = ans;
			i++;
		}
		
		no = 6; a = 0; b = 1; ans = 0; i= 0;
		
		System.out.println("\nPell Series \n");
		System.out.println(a+ "\n" +b);
		while(i <= no)
		{
			ans = a + b * 2;
			System.out.println(ans);
			a = b;
			b = ans;
			i++;
		}
	}

}
