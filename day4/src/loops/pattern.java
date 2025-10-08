package loops;

public class pattern {
	public static void main(String[] args) {
		int n= 5;
		for(int i =1;i<=n;i++) {
			for(int star = 1;star<=(n-i+1);star++) {
				System.out.print("*");
			}
            System.out.println();
		}
			
	}

}
