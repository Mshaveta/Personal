package ArraysDemos.programs;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] ballNums = { 34, 5, 67, 89, 345, 678, 90 };
		int smallestBall = ballNums[0];
		for (int i = 0; i < ballNums.length; i++) {

			if (ballNums[i] < smallestBall) {  
				smallestBall = ballNums[i];
			}  
		}
		
		System.out.println(smallestBall);

	}

}
