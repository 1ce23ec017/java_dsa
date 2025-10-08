package com;

public class swapping_variables {
	public static void main(String[] args) {
		String a ="good";
		String b = "bad";
		
		//Swapping
		a = a + b;//goodbad
		b = a.substring(0, a.length() - b.length());//good
		a=a.substring(b.length());//a.length = 10 - b.length =5
	
		
		System.out.println(" a : " +a);
		System.out.println(" b : " +b);
	
	}

}
