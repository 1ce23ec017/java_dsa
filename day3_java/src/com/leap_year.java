package com;

public class leap_year {
	public static void main(String[] args) {
		int year = 2040;
		if ( year % 4==0 || year % 400 == 0 && year % 100 != 0)
		{	
		    System.out.println("its a leap year");
		}
		else
		{
		
		    System.out.println("its not a leap");
		}
		
		
	}

}
