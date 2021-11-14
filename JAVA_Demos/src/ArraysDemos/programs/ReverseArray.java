package ArraysDemos.programs;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {12,34,67,8,344};
		System.out.println(Arrays.toString(arr));//[12, 34, 67, 8, 344]
		for(int index=0;index<arr.length;index++) {
			System.out.print(arr[index]+" ");
		}
		System.out.println("-------------------------");
		//reverse of arr elmns
		for(int index=arr.length-1;index>=0;index--) {
			System.out.print(arr[index]+" ");
		}
		
		System.out.println(Arrays.toString(arr));//[12, 34, 67, 8, 344]
	}

}
