package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {

		TreeSet<String> hs=new TreeSet<>();
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		hs.add("Xyz");
		hs.add("Abc");
		hs.add("pqr");
		hs.add("Atp");
		hs.add("Ghi");
		hs.add("Xyz");
		hs.add("Abc");
//		hs.add(null);
//		hs.add(null);
		System.out.println(hs);
		Iterator<String> itr=hs.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
