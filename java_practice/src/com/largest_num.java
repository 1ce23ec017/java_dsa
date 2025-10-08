package com;

public class largest_num {
	public static void main(String[] args) {
		int a = 20 , b = 30 , c = 40;
		if(a>=b && a>=c)
			System.out.println(a + "is the largest");
		if(b>=c && b>=a)
			System.out.println(b+ "is the largest");
		else
			System.out.println(c + "is the largest");
	}

}
