package inheritanceDemo;

public class Car extends Vehicle {
	
	protected String modelName = "Mustang";    // Car attribute
	
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.brand);
		c.honk();
		System.out.println(c.modelName);
		
	}
}
