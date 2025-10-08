package day_6;



public class LinearSearch {
	public static int linearSearch(int[] arr, int key) {
		{
			for(int i =0;i<arr.length;i++) {
				if(key==arr[i])
					
				{
					return i ;
				}
				
			}
			       return -1 ;
		}
		}
		public static void main(String[] args) {
			int[] arr = {2,4,6,8,10,12,14,16};
			int key=10;
			
			int index=linearSearch(arr,key);
			 
			if(index == -1)
				System.out.println("element not found");
			else
				System.out.println("elements found:" +index);
		    

	
		
	}

}
