package day5_java;

import java.util.Arrays;

public class array_sorted {
	public static void main(String[] args) {
		int [] arr= {6,5,2,9};
		Arrays.sort(arr);
		System.out.println("sorted array");
		for(int num :arr) {
			System.out.println(num + " ");
		}
	}

}
