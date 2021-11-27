package ArraysDemos.programs;

import java.util.Arrays;

public class RightShift {

	public static void main(String[] args) {
		 int[] numbers= {2,3,4,5,60};
		 int size = numbers.length;
		 int lastIndex = size-1;
			/*
			 * System.out.println("Total elements of an Array-"+size);
			 * System.out.println("Last Index Number-"+lastIndex);
			 */
		 int lastIndexVal = numbers[lastIndex];
		 System.out.println("Value store at last index -"+lastIndexVal);
		 
		 System.out.println("Before Shifting..."+Arrays.toString(numbers));
		 
		 
		 for(int i=0;i<size-1;i++) { 
			numbers[size-(i+1)] = numbers[size-(i+2)];
			
		 }
		 
		 numbers[0]= lastIndexVal;
		 System.out.println(Arrays.toString(numbers));
		 
	}

}
