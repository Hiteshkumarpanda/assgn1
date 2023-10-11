package assgn;
import java.util.*;
public class A1Q5 {
    public static  int sum_Of_Digits(int n) {
    	int sum =0;
    	while(n>0) {
    		int a=n%10;
    		sum+=a;
    		n/=10;
    	}
    	if(sum>=10) {
    		return sum_Of_Digits(sum);
    	}
    	else
    		return sum;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in); 
		System.out.println("Enter a number");
		int n = sc.nextInt();
		//A1Q5 a1q5 = new A1Q5();
		//int p = a1q5.sum_Of_Digits(n);
		System.out.println("sum of digitd of "+n+" untill the number is a single digit is "+sum_Of_Digits(n));
	}

}
