package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		
		int[] array=new int[5];
		
		ArrayList<Object> al=new ArrayList<>();
		al.add(1);//0
		al.add("Hello");//1
		al.add(36.7f);//2
		al.add(36.777);//3
		al.add(5);//4
		al.add(2);//6
		al.add(3);//
		al.add(4);//3
		al.add(5);//4
		al.add(1);
		al.add(null);
		al.add(null);
		al.add(true);
		
		al.add(5, "Good Evening");
		System.out.println(al);
		
//		System.out.println("Size "+al.size());
//		System.out.println(al.isEmpty());
		//System.out.println(al.remove(2));
//		System.out.println(al.contains(3));
		System.out.println(al.indexOf(5));//4
		System.out.println(al.get(5));//Good Evening
		System.out.println(al.set(1, "Hi All!!!!!!!"));
		System.out.println(al);
		Object[] elements = al.toArray();
		for (Object ele : elements) {
			System.out.println(ele);
		}
		//al.clear();
		System.out.println("=======================");
		System.out.println(al);
		
		
		
//		System.out.println(al.lastIndexOf(5));//4
//		System.out.println(al);
		//System.out.println();
		
//		Iterator<Object> it = al.iterator();
//		
//		while(it.hasNext()) {
//			Object ele = it.next();
//			System.out.println(ele);
//			//System.out.println(ele.toString());
//			
//		}
//		for (Object ele : al) {
//			System.out.println(ele);
//		}

//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//			
//		}
//		System.out.println(al.size());
	}

}
