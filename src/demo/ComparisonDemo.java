package demo;

public class ComparisonDemo {

	public static void main(String[] args) {
	
		int a=10 , b=11;
		
		System.out.println(a < b);
		System.out.println(a==b);
		System.out.println(a>=b);	
		System.out.println(a>b  && b>a);
		System.out.println(a>b || b<a );//faslse
		
		System.out.println(!(a>b));//true
		
					//H->0 e->1 ..... o->4
		String str="Hello";
		String s="Java";
		char ch = 0;
		System.out.println(str.length());//1
		
//		for(int i=0;i<=str.length()-1;i++) {
//			ch=str.charAt(i);
//			System.out.println(ch);
//		}
		String txt = "We are the so-called \"Vikings\" from the north.";
		String txt1 = "It\'s alright.";
		System.out.println(txt1);
		System.out.println(txt);
		String s1="10";
		int s2=20;
		System.out.println(s1+s2);//1020
		
//		10*10=100;
//		100/10=10
		int randomNum = (int)(Math.random() * 101);
		System.out.println(randomNum);
		
		System.out.println(Math.random());
		
//		System.out.println(str+" "+s);
//		System.out.println(str.concat(s));
//		
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
//		
//		System.out.println(str.indexOf('o'));
//		
		
	}

}
