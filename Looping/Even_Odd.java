package com.sgm.task;

public class Even_Odd {
	
	public static void main(String[] args) {
		
		System.out.println("\nOdd \tEven ");
		
		for(int i = 1; i <= 50; i++)
		{
			if(i % 2 == 0) {
				System.out.println(" \t "+i);
			}
			else
			{
				System.out.print(i);
			}
		}
	}

}
