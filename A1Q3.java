package assgn;

public class A1Q3 {
    public boolean getspynum(int n) {
    	int sum=0; int product=1;
    	while(n>0) {
    		int a=n%10;
    		sum+=a;
    		product*=a;
    		n/=10;
    	}
    	
    	return (sum==product); 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = Integer.parseInt(args[0]);
       A1Q3 a1q3 = new A1Q3();
       boolean flag = a1q3.getspynum(n);
       System.out.println(flag);
       
	}

}
