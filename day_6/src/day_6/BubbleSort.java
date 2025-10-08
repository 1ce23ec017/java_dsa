package day_6;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {3,6,2,1,8,7,4,5,3,1};
		System.out.println("the unsorted array: ");
		for(int num:arr) {
			System.out.println(num+ " ");
		}
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = 0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		System.out.print("sorted array:");
		for(int num:arr) {
			System.out.print(num+ " ");
		}
		
	}

}
