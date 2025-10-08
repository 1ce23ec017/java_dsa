package day5_java;

public class even_odd {
	public static void main(String[] args) {
		int [] arr = {1,2,35,67,9};
		System.out.println("even number:");
		for(int num : arr) {
			if(num % 2 == 0) {
				System.out.println(num+ " ");
			}
		}
		System.out.println("odd number:");
		for(int num : arr) {
			if(num % 2 != 0) {
				System.out.println(num+ " ");
			}
		}
		
	}

}
