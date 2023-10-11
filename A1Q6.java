package assgn;

import java.util.Scanner;

public class A1Q6 {
    public static boolean isOdd(int n) {
    	int b=n&1;
    	if(b==1) {
    		return true;
    	}
    	else 
    		return false;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    int n = sc.nextInt();
    System.out.println(n+" is odd: "+ isOdd(n));
	}

}
