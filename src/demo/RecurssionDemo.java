package demo;

public class RecurssionDemo {
	
	final int y=35;
	//y=45;
	
	public void get() {
		System.out.println(y);
	}
	
	static int sum(int k){
		
		if(k>0) {
			return k+sum(k-1);
		}else
		{
			return 0;
		}
	}

	public static void main(String[] args) {

		int result=sum(10);
		System.out.println(result);

		RecurssionDemo object=new RecurssionDemo();
		//object.y=55;
		object.get();
	}

}
