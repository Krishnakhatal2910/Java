package inheritanceDemo;

public class BabyCar extends Vehicle{
	
	String carName="Nano";
	
	

	public static void main(String[] args) {
		BabyCar car=new BabyCar();

		System.out.println(car.brand);
		car.honk();
		System.out.println(car.carName);
	}

}
