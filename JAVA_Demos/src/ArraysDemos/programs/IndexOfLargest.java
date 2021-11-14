package ArraysDemos.programs;

public class IndexOfLargest {

	public static void main(String[] args) {
		int[] ballNums = { 34, 5, 67, 89, 345, 678, 90 };
		int biggestBall = ballNums[0];
		int indexVal=0;
		for (int index = 0; index < ballNums.length; index++) {

			if (ballNums[index] > biggestBall) {  
				 
				biggestBall = ballNums[index];
				indexVal=index;
			}  
		}
		
		 
		System.out.println("Index number of Largest Elmn ("+biggestBall+") is - "+indexVal);
	}

}
