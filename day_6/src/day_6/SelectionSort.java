package day_6;

public class SelectionSort {
	public static void main(String[] args) {
		int [] arr = {3,6,2,1,8,7,4,5,3,1};
		selectionSort(arr);
		System.out.println("sorted array");
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i = 0; i<n-1; i++) {
			int minIndex=i;
			for(int j = i+1; j<n; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;	
					}
		}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i]=temp;
				
		}
	}

}
