package ArraysDemos;

public class SumArrayElmns {
	public static void main(String[] args) {
		int[] arr = {2,1,4,1,1};
		int size = arr.length;//5
		int sum=0;//3->7
		for(int index =0;index<size;index++) {
			 
			sum = sum+arr[index];//1- 0+2, sum=2, 2- 2+1, 3- 3+4=7
			
		}
		
		System.out.println("Sum is- "+sum);
	}
}
