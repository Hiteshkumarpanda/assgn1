package assgn;
 class x{


   public int getCount(int a) {
    	int count=0;
    	while(a>2) {
    		a/=2;
    		count++;
    		}
    	return count;
    	}
   public class A1Q1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(args[0]);
		int a = Integer.parseInt(args[0]);
		
		//System.out.println(p.getCount(a));
	}

}
