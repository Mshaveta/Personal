package ArraysDemos;

import java.util.Arrays;

public class ArrayBasics {
	public static void main(String[] args) {
		int [] ar = new int[5];
		System.out.println(ar);//[I@15db9742
//		System.out.println(ar[0]);//default value acc to DT-0
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
	
		//System.out.println(ar[5]);// throw ArrayIndexOutOfBound Exception
		
		System.out.println(Arrays.toString(ar));
		//Value Assignment in an array
		ar[3]=100;
		System.out.println(Arrays.toString(ar));
		System.out.println("Value Store at index 3 is - "+ar[3]);
		
		
		//Array declaration along with values
		int[] arr1 = {10,20,30,40,50};
		System.out.println(Arrays.toString(arr1));
		
	
		///////////////////////////////////////////////
		int[] arr = {1,2,3,4,5,6,4,2,4,5};
		System.out.println("Length of an Array -"+ arr.length);
		int lastIndex= arr.length-1;
		System.out.println("Last IndexNumber -"+ (arr.length-1));
		
	}
}
