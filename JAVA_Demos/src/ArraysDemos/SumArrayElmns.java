package ArraysDemos;

public class SumArrayElmns {
	public static void main(String[] args) {
		int[] arr = {2,1,4,1,1};
		int size = arr.length;
		int sum=0;
		for(int index =0;index<size;index++) {
			 
			sum = sum+arr[index];
			
		}
		
		System.out.println("Sum is- "+sum);
	}
}
