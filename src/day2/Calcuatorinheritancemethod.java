package day2;

public class Calcuatorinheritancemethod extends Calculator
{
	public void calc() 
	{
		System.out.println("All the output is ");	
	}

	public static void main(String[] args)
	{
		Calcuatorinheritancemethod obj = new Calcuatorinheritancemethod();

		obj.add(11, 12, 14);
		obj.calc();
	}

}
