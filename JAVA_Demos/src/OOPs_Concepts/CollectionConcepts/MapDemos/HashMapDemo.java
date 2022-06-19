package OOPs_Concepts.CollectionConcepts.MapDemos;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		//nonGenric
		 Map map = new HashMap();
		 //System.out.println(map);//{}-->json format--key:value
		 
		 map.put(1,100);
		 map.put("name","SM");
		 map.put(1,"Testing");
		 map.put(null,"Testing");
		 map.put(2,null);
		 map.put(null,null);
		 
		 System.out.println(map);
		 
//		 System.out.println("Total Map Elmenets Count - "+map.size());
//		 System.out.println(map.containsKey("Name"));
//		 System.out.println(map.containsValue("Testing"));
		 
		 Map map1 = new HashMap();
		 //System.out.println(map);//{}-->json format--key:value
		 
		 map1.put(4,400);
		 map1.put(5,500);
		 
		 map1.putAll(map);
		 System.out.println(map1);
		 
		 System.out.println(map1.get(5));
		 
		 map1.remove("name");
		 System.out.println(map1);
		 
		 
		 
		 
		 

	}

}
