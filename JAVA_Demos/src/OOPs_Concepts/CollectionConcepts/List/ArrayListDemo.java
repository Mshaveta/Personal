package OOPs_Concepts.CollectionConcepts.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		// To add the elements in ArrayList
		al.add(10); //0 element
		al.add(23);
		al.add(23.5f);
		al.add(123.50);
		al.add('a');
		al.add("test");
		al.add(true);
		
//		System.out.println(al);
//		
//		// To get the size of ArrayList
//		System.out.println(al.size());
//		
//		//to get the element of list
//		System.out.println(al.get(4));
//		
//		//To remove
//		al.remove(6);
//		 
//		System.out.println("List after removing the element - "+al);
//		
//		//add element at specified position
//		al.add(2, 1000);
//		
//		System.out.println("List after removing the element - "+al);
//		
//		//clear the list
//		al.clear();
//		System.out.println("List after clearing the list collection - "+al);
		
		//contains
		System.out.println(al.contains(123.50));
		
		
		//Two collection methods
		ArrayList al1 = new ArrayList();
		al1.add("Automation"); //0 element
		al1.add("Testing");
		
		 System.out.println("Collection1 -al - "+al);
		 System.out.println("Collection2 -al1 - "+al1);
		 
		 al1.addAll(al);
		 //al1.remove(5);
		 
		 System.out.println(al1.containsAll(al));
		 
		 System.out.println("Collection2 -al1 - "+al1);
//		 System.out.println("Collection1 -al - "+al);
//		 System.out.println("Collection2 -al1 - "+al1);
//		 
//		 al1.removeAll(al);
//		 
//		 System.out.println("Collection2 -al1 - "+al1);
		 
		 
		 ArrayList aList = new ArrayList();
		 aList.add("Automation"); //0 element
		 aList.add("Testing");
		 
		 ArrayList bList = new ArrayList();
		 bList.add("Automation"); //0 element
		 bList.add("Testing11");
//		 
		 System.out.println(aList.equals(bList));
		 
	}

}
