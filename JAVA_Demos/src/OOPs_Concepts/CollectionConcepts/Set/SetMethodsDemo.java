package OOPs_Concepts.CollectionConcepts.Set;

import java.util.HashSet;
import java.util.Set;

public class SetMethodsDemo {

	public static void main(String[] args) {
		Set s1 = new HashSet();
		s1.add(10);
		s1.add(20);
		
		s1.removeAll(s1);
		s1.remove(20);
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		
		Set s2 = new HashSet();
		s2.add(50);
		s2.add(30);
		
		s2.addAll(s1);//
		
		System.out.println("Elements of s1 - "+s1); //[20, 10]
		System.out.println("Elements of s2 - "+s2);//[50, 20, 10, 30]
		
//		s2.retainAll(s1);
//		System.out.println(s2);
		
		s2.removeAll(s1);
		System.out.println(s2);
		
		
		
		
		
		

	}

}
