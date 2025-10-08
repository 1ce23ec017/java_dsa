package day2_java;

import java.util.Scanner;

public class number_of_digits {
	public static void main(String[] args) {
		int num = 123456789;
		int count = 0;
		
		while (num > 0)
		{
			num = num / 10;
			count++;
		}
		System.out.println("the number of digits are "  +count);
		
	}

}
