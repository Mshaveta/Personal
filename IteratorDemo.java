package OOPs_Concepts.CollectionConcepts.List;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		//ArrayList  list =  new ArrayList(); //Non -Generic Collection- we can store differnt type of data
		
//		list.add(10);
//		list.add(20.5);
//		list.add("Test2");
//		list.add(true);
		
		
		ArrayList<Integer>  list =  new ArrayList<Integer>(); //Non -Generic Collection- we can store differnt type of data
		
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//Object
		
		//System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int val = itr.next();
			System.out.println(val);
			if(val==30) {
				itr.remove();
			}
		}
		
		System.out.println(list);
		
		
		
	}
}
