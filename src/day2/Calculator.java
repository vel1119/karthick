package day2;

public class Calculator {

	public void add(int i, int j,int k)
	{
		int l=i+j+k;
		System.out.println("addition of number is " +l);

	}
	public void sub(int i, int j,int k)
	{
		int l=i-j-k;
		System.out.println("sub of number is " +l);

	}
	public void divide(int i, int j)
	{
		int l=i/j;
		System.out.println("divide of number is " +l);

	}
	
	public int returnname(int i, int j, int k )  //method name should be always camal form so 
	{
		int l =i+j+k;;
		System.out.println("current value is "+ l) ;
		return l;
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator ();
		obj.add(11, 12, 15);
		int o= obj.returnname(11, 12, 15);
		System.out.println(o);
		obj.sub(12, 14, 15);
		obj.divide(50, 5);
	
		
		
		
	}
}
	

