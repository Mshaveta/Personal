package OOPs_Concepts.CollectionConcepts.MapDemos;

import java.util.HashMap;
import java.util.Map;
/*
 * //entry- k,V
 * collection of entries - entrySet
 */
public class ElementsTraversing {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
		map.put(1, 100); //entry- k,V
		map.put(2, 200);
		map.put(3, 300);
		map.put(4, 400);
		map.put(5, 500);
		//map.put("test", 500);
		

		System.out.println(map);
		
	    //Map.Entry ----> Generic collection
		for(Map.Entry<Integer,Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+" - "+e.getValue()*2);
		}

	}

}
