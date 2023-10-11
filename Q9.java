package assgn;

import java.util.Scanner;

public class Q9 {
    public static double sumMajorDiagonal(double[][] arr1) {
    	double sum=0;
    	       	   for(int i=0;i<4;i++) {
    	  	 for(int j=0;j<4;j++) {
    	  		 if(i==j)
    	  		 sum+=arr1[i][j];
    	  	 }
    	  	 System.out.println();
    	   }
    	   return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
 	   System.out.print("Enter a  ");
 	    
 	   
 	   double arr1[][]= new double[4][4];
 	   System.out.println("Enter a 4-by-4 matrix row by row: ");
 	         for(int i=0;i<4;i++) {
 	        	 for(int j=0;j<4;j++) {
 	        		 arr1[i][j]=sc.nextDouble();
 	        	 }
 	         }
 	        for(int i=0;i<4;i++) {
	        	 for(int j=0;j<4;j++) {
	        		 
	        	System.out.print(arr1[i][j]+" ");	 
	             }
	  	        System.out.println();

 	        }
 	        Q9 q9 = new Q9();
 	        double s = q9.sumMajorDiagonal(arr1);
 	        System.out.println("sum of the elements in the major diagonal is "+s);
	}

}
