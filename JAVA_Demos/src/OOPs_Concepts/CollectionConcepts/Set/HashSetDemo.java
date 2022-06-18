package OOPs_Concepts.CollectionConcepts.Set;

import java.util.HashSet;
import java.util.Set;
/*
 * Set may not contains duplicate elemnets
 * Insertion order is not preserved
 * indexing is not allowed, because order is not preserved
 */
public class HashSetDemo {

	public static void main(String[] args) {
		 Set set = new HashSet();
		 set.add(10);
		 set.add(15);
		  
		 
		 //System.out.println(set);
		 
//		 System.out.println(set.size());
//		 System.out.println(set.contains(16));
//		 System.out.println(set.remove(16));
//		 System.out.println(set);
		 
		 Set set1 = new HashSet();
		 set1.add(130);
		 set1.add(150);
		 set1.add(10);
		 set.addAll(set1);//10,15.130.150.10
		 //System.out.println(set1);//[160, 16, 130, 100, 150, 10, 15]
		 //System.out.println(set);//[16, 160, 130, 100, 150, 10, 15]
		 
		  
 		// set.retainAll(set1);// it will keep the elements of set which is mentioned in the (setName)
		// System.out.println(set);
		 
		 //System.out.println(set.containsAll(set1));
		 
		 set.removeAll(set1);
		 System.out.println(set);
		 
		  
		 
		 
		 
	}

}
