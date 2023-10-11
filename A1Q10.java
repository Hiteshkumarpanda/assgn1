package assgn;

import java.util.Scanner;

public class A1Q10 {
         public static double sumColumn(double [][] arr, int columnIndex ) {
        	double sum=0;
        	 for(int i=0;i<3;i++) {
// 	        	 for(int j=0;j<4;j++) {
// 	        		 if(j==columnIndex)
// 	        		 sum+=arr[i][j];
// 	        	 }
        		 sum = sum + arr[i][columnIndex];
 	         }
        	 return sum;
         }
	
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
	 	   double arr[][]= new double[4][4];
	 	   System.out.println("Enter a 3-by-4 matrix row by row: ");
	 	         for(int i=0;i<3;i++) {
	 	        	 for(int j=0;j<4;j++) {
	 	        		 arr[i][j]=sc.nextDouble();
	 	        	 }
	 	         }
	 	        for(int i=0;i<3;i++) {
		        	 for(int j=0;j<4;j++) {
		        		 
		        	System.out.print(arr[i][j]+" ");	 
		             }
		  	        System.out.println();

	 	        }
	 	       for(int k=0;k<4;k++) {
	 	    	  System.out.println("sum of the elements in the colomn "+k+ " is "+sumColumn(arr,k));
	 	       }
	 	        
	}

}
