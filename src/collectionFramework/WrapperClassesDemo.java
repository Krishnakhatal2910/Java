package collectionFramework;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		int i=10;
		 Integer myInt = 556343763;
		    Double myDouble = 5.99;
		    Character myChar = 'A';
		    String noString = myInt.toString();
		    System.out.println(noString.length());
		   
		    Integer value = Integer.valueOf("8722");
		    System.out.println(value);
		    int nos = myInt.parseInt("5432723");
		    System.out.println(nos);

	}

}
