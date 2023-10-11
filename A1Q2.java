package assgn;

public class A1Q2 {
    public double get_BMI(double weight , double height) {
    	
    	double Bmi= weight/(height*height);
    	return Bmi;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = Double.parseDouble(args[0]) ; 
		double height = Double.parseDouble(args[1]);
		A1Q2 p = new A1Q2();
		double c = p.get_BMI(weight, height);
		 if(c<18.5) {
			 System.out.println("Under weight");
		 }
		 else if(c>=18.5 && c<=24.9) {
			 System.out.println("Normal weight");
		 }
		 else if(c>=25.0 && c<=29.9) {
			 System.out.println("Over weight");
		 }
		 else
			 System.out.println("obese");
	}

}
