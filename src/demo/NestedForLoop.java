package demo;

public class NestedForLoop {

	public static void main(String[] args) {

//		for(int i=1;i<=3;i++) {
//			
//			for(int j=1;j<=3;j++) {
//				
//				System.out.println(j);
//			}
//			
//		}
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//		for (String str : cars) {
//			System.out.println(str);
//			
//		}
		for(int k=0;k<=cars.length-1;k++) {
			System.out.println(cars[k]);
		}

	}

}
