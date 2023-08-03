package fileHandling;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner	sc=new Scanner(System.in);
//		System.out.println("Enter your name");
//		String text = sc.nextLine();
//		System.out.println(text);
		System.out.println("Enter number");
		int result = 0;
		while(sc.hasNext()) {
			String no = sc.next();
			String[] nos = no.split(" ");
			
			for (String string : nos) {
				int numbers = Integer.parseInt(string);
				//System.out.println(numbers);
				
				result=numbers+numbers;
				
				
			}
			
			
		}
		System.out.println(result);
	}

}
