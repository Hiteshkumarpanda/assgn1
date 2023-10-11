package assgn;

public class Y {
	protected void getdata() {
		getprivatedata();
		System.out.println("getdata");
	}
	private void getprivatedata() {
		System.out.println("getprivatedata");
	}
	public void getpublicdata() {
		System.out.println("getpublicdata");
	}
	       void getdefaultdata() {
		System.out.println("getdefaultdata");
	}
}
