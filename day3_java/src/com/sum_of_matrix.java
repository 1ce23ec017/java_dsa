package com;

public class sum_of_matrix {
	public static void main(String[] args) {
		int[] []matrix= {
				      {5,5},
				      {4,5   }
				      };
		int sum=0;
		// for adding diagonal elements
		for(int i =0; i<matrix.length;i++)
		{
			sum = sum + matrix[i][i]; 
		}
		System.out.println("sum of diagonal is :" +sum);
	}
	

	
	
	
			    
	

}
