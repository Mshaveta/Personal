package OOPs_Concepts.CollectionConcepts.Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * LinkedHashSet -  ordered + unique elemns
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhSet =  new LinkedHashSet();
		lhSet.add(110);
		lhSet.add(120);
		lhSet.add(30);
		lhSet.add(40);
		lhSet.add(50);
		lhSet.add(50);
		lhSet.add(50);
		lhSet.add(50);
		
		System.out.println(lhSet);
		System.out.println(lhSet.size());
		
		 List<Integer> list = new ArrayList<Integer>( lhSet );
		 System.out.println(list.get(1));
		
		 
		

	}

}
