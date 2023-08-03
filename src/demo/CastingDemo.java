package demo;

public class CastingDemo {

	public static void main(String[] args) {
		
		byte b=125;
		int i=b;
		System.out.println("b variable value "+b);
		System.out.println("i variable value "+i);
		

		double d=1.12345676566834757;
		float f=(float)d;
		System.out.println(f);
		
		
		
		int a=10;
		a++;//11-Post increament
		int n=a;
		System.out.println(n);
		
		
		int y=20;
		++y;
		int z=y;
		System.out.println(z);//21
		
		int m=9;
		m%=10;//m=5%10;
		System.out.println(m);
		
		
//		wait.until(ExpectedConditions.or(
//				ExpectedConditions.presenceOfElementLocated(
//						By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div/h4")),
//				ExpectedConditions.presenceOfElementLocated(
//						By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div/div/div[1]/p[1]"))));
//		
	}

}
