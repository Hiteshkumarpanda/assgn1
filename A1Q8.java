package assgn;

import java.util.Scanner;

public class A1Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the Row and Columns of 2D-Array: ");
   int m = sc.nextInt(); int sum=0;
   int n = sc.nextInt();
   int  arr[][]= new int[m][n];
   System.out.println("Enter the elements of 2D-Array: ");
         for(int i=0;i<m;i++) {
        	 for(int j=0;j<n;j++) {
        		 arr[i][j]=sc.nextInt();
        	 }
         }
   System.out.print("The elements of 2D-Array are: ");
   for(int i=0;i<m;i++) {
  	 for(int j=0;j<n;j++) {
  		 System.out.print(arr[i][j]+" ");
  		 sum+=arr[i][j];
  	 }
  	 System.out.println();
   }
   System.out.println("The sum of elements of 2D-Array is: "+sum);
	}

}
