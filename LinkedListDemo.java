package OOPs_Concepts.CollectionConcepts.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(4100);
		ll.add(true);
		ll.add(12.56);
		
		ll.add(0,10090);
		ll.addFirst(32001);
		ll.addLast(3300);
		
		System.out.println(ll);
		
		 
//		
//		// To get the size of ArrayList
 		System.out.println(ll.size());
//		
//		//to get the element of list
 		System.out.println(ll.get(2));
//		
//		//To remove
 		ll.remove(0);
//		 
 		System.out.println("List after removing the element - "+ll);
//		
//		//add element at specified position
 		ll.add(0, 1000);
//		
 		System.out.println("List after removing the element - "+ll);
//		
//		//clear the list
 		//ll.clear();
 		//System.out.println("List after clearing the list collection - "+ll);
		
		//contains
 		System.out.println(ll.contains(100000));
 
 		
 		LinkedList ll1 = new LinkedList();
		ll1.add(10078);
		ll1.add(1234);
		ll1.add(false);
		ll1.add(121.561);
		
		
		ll1.addAll(ll);
		System.out.println(ll1);
 	 

	}

}
