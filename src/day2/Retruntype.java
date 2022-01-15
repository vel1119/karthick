package day2;

public class Retruntype 
{

	public void add(String city , String country)
	{
		String location= city+country;
		System.out.println("Details  is :" + location );

	}


	public String returnname(String city , String country)  //method name should be always camal form so 
	{
		String location = city+country;
		System.out.println("current value is "+ location) ;
		return location;
	}


	public static void main(String[] args) {

		Retruntype obj = new Retruntype();
		obj.add("chennai", "india");
		String a = obj.returnname("chennai", "india");
		System.out.println(a);




	}
}


