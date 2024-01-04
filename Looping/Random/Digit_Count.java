package com.sgm.task.Random;

public class Digit_Count {

	public static void main(String[] args) {
		
		int no = 34343434 , Cnt = 0;
		
		System.out.println("Given Number is => "+no);
		
		while(no > 0)
		{
			no = no / 10;
			
			Cnt++;
		}
		
		System.out.println("Count of Number is => "+Cnt); 	
	}	
}
