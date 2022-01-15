package traning;

public class Calculationmethods {
	int i = 10;
	int j = 5;

	static int p = 20;
	static int q = 2;

	public void add() {
		int k = i+j;
		System.out.println("addition of number:" + k);
	}
	public void sub() {
		int k = i-j;
		System.out.println("sub of number:"  + k);
	}	
	public static void division() {
		int r = p/q;
		System.out.println("divide of number:" + r );
	}
	public static void main(String[] args) {
		Calculationmethods obj = new Calculationmethods ();
		obj.add();
		obj.sub();
		division();
	}	
}
	// static & non static using methods 
	

