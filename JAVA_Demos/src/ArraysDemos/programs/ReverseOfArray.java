package ArraysDemos.programs;

import java.util.Arrays;

public class ReverseOfArray {
	public static void main(String[] args) {
		int[] arr = {2,34,56,78,65,12,38};
		
		int size=arr.length;//5
		int temp=0;
		System.out.println("Before reverse-"+Arrays.toString(arr));
		System.out.println("Size of an Array - "+size);
		for(int index=0;index<size/2;index++) {
			temp = arr[index];//temp=arr[0]
			arr[index] = arr[size-(index+1)];//arr[0] =  arr[4];
			arr[size-(index+1)] = temp;
		}
		System.out.println("After reverse-"+Arrays.toString(arr));
	}	
}
