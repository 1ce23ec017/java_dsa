package day5_java;

public class smallest_elements {
	public static void main(String[] args) {
		int[] arr = {25,35,45,55};
		int smallest=arr[0];
		for(int i =1; i< arr.length; i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("smallest in the array:" +smallest);
	}

}
