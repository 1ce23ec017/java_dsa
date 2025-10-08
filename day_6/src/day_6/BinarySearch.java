package day_6;

public class BinarySearch {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int target = 4;
		int result = binarySearch(arr,target);
		if(result==-1) {
			System.out.println("element not found ");
			
		}else {
			System.out.println("element found:" +result);
		}
		
		
	}
	public static int binarySearch (int[] arr,int key) {
		int left =0;
		int right=arr.length-1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(arr[mid]<key) {
				left=mid + 1;
				}
			else {
				right=mid-1;
			
			}
		}
		return-1;
	}

}
