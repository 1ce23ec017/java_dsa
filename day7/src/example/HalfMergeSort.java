package example;

public class HalfMergeSort {
	public static void merge(int[]arr,int start,int mid,int end) {
		int n1=mid-start +1;
		int n2 =end-mid;
		
		int[]left=new int[n1];
		int[]right=new int[n2];
		
		for(int i=0;i<n1;i++)
			left[i]=arr[start+i];
		for(int j=0;j<n2;j++)
			right[j]=arr[start+j];
		int i=0,j=0,k=start;
		
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[k++]=left[i++];
				
			}else {
				
			}
		}
		
	}

}
