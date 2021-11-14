package ArraysDemos.programs;

public class ScndLargest {

	public static void main(String[] args) {
		int[] nums = { 34, 5, 67, 89, 345, 678, 90 };
		int largest = 0;
		int scndlargest = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > largest) {
				scndlargest = largest;
				largest = nums[i];
			}
		}

		System.out.println("Largest Elmn - "+largest);
		System.out.println("Second Largest Elmn - "+scndlargest);

	}

}
