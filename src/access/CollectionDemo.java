package access;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionDemo {

	int a=40;
	static int b=50;
	
	public static void main(String[] args) {

		
		
		int[] number= {1,2,3,4,5};
		
		ArrayList al=new ArrayList<>();
		for(int i=0;i<number.length;i++) {
			al.add(number[i]);
		}
		
		System.out.println(al);
		
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		ll.add("6");
		ArrayList arrayList=new ArrayList<>(ll);
		
		//System.out.println(arrayList);

	}

}
