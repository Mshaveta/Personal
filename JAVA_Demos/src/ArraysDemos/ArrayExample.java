package ArraysDemos;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		// St1: Specify the size of an array
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter the size of an array");
		int size = scn.nextInt();
		int[] arr = new int[size];
		System.out.println(Arrays.toString(arr));
		
		int arrCount = arr.length;//5
		 for(int i=0;i<arrCount;i++) {
			 
			arr[i]=(i+1)*100;
			
		 }
		System.out.println(Arrays.toString(arr));
		
		
	}
}
