package OOPs_Concepts.CollectionConcepts.MapDemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMapDemo {
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		map.put(1, 100); //entry- k,V
		map.put(2, 200);
		map.put(3, 300);
		map.put(4, 400);
		map.put(5, 500);
		//map.put("test", 500);
		
	
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		 
	}
}
