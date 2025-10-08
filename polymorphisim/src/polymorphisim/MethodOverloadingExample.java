package polymorphisim;

class Calculator {
	int add(int a , int b) {
		return a+b;
		
	}
	int add(int a ,int b, int c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}
	   

}
public class MethodOverloadingExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("sum of two ints :" +calc.add(5, 10));
		System.out.println("sum of three ints:" +calc.add(5,10,5));
		System.out.println("the sum of two double:" +calc.add(5.6,2.5 ));
		
	}
	
}
		

	

