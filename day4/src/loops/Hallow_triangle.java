package loops;

public class Hallow_triangle {
	public class Pattern2 {
		public static void hallo_triangle(int n) {
			for(int i =1 ; i<=n;i++) {
				for(int j =1 ; j<=i;j++) {
					
						System.out.println(" ");
						
				}
				for(int k =1 ; k<=(2*i;k++){
					if(k == 1 || i ==n || k==2*i - 1) {
						System.out.print("*");
					}
				    else {
				    	System.out.println(" ");
				    }
					
				}
			
			    System.out.println(" ");
			}
	}
			
	    
		public static void main(String[] args) {
			hallo_triangle(6);
			
		}

	}


}
