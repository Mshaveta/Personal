package OOPs_Concepts.CollectionConcepts.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSetElmns {
	public static void main(String[] args) {
		Set set =  new HashSet();
		set.add(10);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}
