package TwoDArray;

public class pewDefinedvaluesinArray {

	public static void main(String[] args) {
		 // Array with predefined values
		 int[][] arr = new int[][] { {1,2}, {2,3}, {3,4}, {40,5}, {5,6}};
		 int rowCount = arr.length;
		 int colCount = arr[0].length;//
		 System.out.println("RowCount-"+rowCount+" colCount- "+colCount);
//		 //rows--0
		 
		 for(int rowIndex=0;rowIndex<rowCount;rowIndex++) {
			 //cols
			 for(int colIndex=0;colIndex<colCount;colIndex++) {
				 System.out.print(arr[rowIndex][colIndex]+" ");
			 }
			 System.out.println();
		 }
	}

}
