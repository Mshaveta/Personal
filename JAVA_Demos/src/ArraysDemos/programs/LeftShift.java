package ArraysDemos.programs;

import java.util.Arrays;

public class LeftShift {

	public static void main(String[] args) {
		int[] arr = { 23, 455, 6, 78, 9 };
		int size = arr.length;
		int lastIndex = size-1;
		int firstElm = arr[0];// 23 value stores in temp var
		for (int i = 0; i < size-1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[lastIndex] = firstElm;
		System.out.println(Arrays.toString(arr));
	}

}
