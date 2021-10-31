package ArraysDemos;

public class StoreTable2InArray {

	public static void main(String[] args) {
		 int[] arr = new int[10];
		 for(int i=0;i<arr.length;i++) {
			 arr[i] = 2*(i+1) ;
			 System.out.println("value store at index ["+i+"] is-"+arr[i]);
			 
			
		 }

	}

}
