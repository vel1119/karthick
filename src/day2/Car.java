package day2;

public class Car  extends Vechile{

	public void engineSpeed()
	{
		System.out.println("car engine speed is ");
	}
	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.speed);
		obj.engineSpeed();
		
		
		
	}
	
	
}
