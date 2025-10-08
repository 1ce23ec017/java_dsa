package com;

import java.util.Scanner;

public class simple_calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a two  number ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("enter a valid operator");
		
		char operator =sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println("sum = " + (a+b));
			break;
		case '-':
			System.out.println("difference= " + (a-b));
			break;
		case '*':
			System.out.println("mul = " + (a*b));
			break;
		case '/':
			System.out.println("div = " + (a/b));
			break;
			
		}
		
	}

}
