package exceptionInJava;

public class ArrayException {

	public static void main(String[] args) {
		try {
			int[] num = { 1, 2, 3 };
			System.out.println(num[5]);
		}catch(Exception e){
			
		}
		finally {
			System.out.println("Finally code get executed");
		}
	}

}
