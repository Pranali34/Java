package com.sgm.task.Random;

public class Armstrong {

	public static void main(String[] args) {
		
		int no = 193 , cnt = 0,temp = no, cube = 0,rem = 0;
		
		while(no > 0)
		{
			no = no / 10;
			
			cnt++;
		}
		System.out.println("Power of Given Number > "+cnt);
		
		no = temp;
		
		while(temp > 0 )
		{
		   	rem = temp % 10;
		   	
			cube = cube +(int)Math.pow(rem,cnt);
			
		   	temp = temp / 10;   	
		}
		System.out.println("Cube of Given Number > "+cube);
		System.out.println("********************************");
		
		if(no == cube)
		{
			System.out.println(no+" is the Armstrong Number");
		}
		else
		{
			System.out.println(no+" is Not the Armstrong Number");
		}
		System.out.println("********************************");
	}
}
