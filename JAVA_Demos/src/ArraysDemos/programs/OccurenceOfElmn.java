package ArraysDemos.programs;

public class OccurenceOfElmn {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3, 1, 1, 1, 1 };
		int targetNum = 3;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == targetNum) {
				count++;
			}
		}

		System.out.println("Total count of 1 is - " + count);

	}

}
