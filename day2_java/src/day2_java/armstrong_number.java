package day2_java;

public class armstrong_number {
	public static void main(String[] args) {
		int num = 153;
		int original = num;
		int sum = 0;
		
		while (num > 0)
		{
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		if (sum == original)
		{
			System.out.println("It ia a armstrong number");
		}
		else
		{
			System.out.println("It is not a armstrong number");
		}
		
	}

}
