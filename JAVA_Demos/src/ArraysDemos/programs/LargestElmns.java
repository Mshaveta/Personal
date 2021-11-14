package ArraysDemos.programs;

public class LargestElmns {

	public static void main(String[] args) {
		int[] ballNums = { 34, 5, 67, 89, 345, 678, 90 };
		int biggestBall = ballNums[0];
		for (int i = 0; i < ballNums.length; i++) {

			if (ballNums[i] > biggestBall) { //734>0
				System.out.println("large Number");
				biggestBall = ballNums[i];
			} else {
				System.out.println("Small Number");
			}
		}
		
		System.out.println(biggestBall);

	}

}
