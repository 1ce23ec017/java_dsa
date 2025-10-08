package day_6;

public class largest_num {
	public static void main(String[] args) {
		int[] arr = {15,34,45,14,67};

		int largest = Integer.MAX_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int i = 1; i< arr.length;i++) {
			if(arr[i] >largest)
			{
				largest = arr[i];
			}
			if(arr[i]<smallest)
			{
				smallest = arr[i]
			}
		}
		System.out.println("largest element in array:" +largest);
		System.out.println("smallest element in the array:" +smallest);
		
	}

}
