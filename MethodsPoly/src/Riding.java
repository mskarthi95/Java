
public class Riding {

	void run()
	{
		System.out.println("Ride");
	}
	
	class Car extends Riding {
	{
		System.out.println("Car runs");	
	}
	
	public static void main(String args[])
	{
		Car Obj = new Car();
		Obj.run();
	}
}
}
