package ArraysDemos;

public class AvgArrayElmns {

	public static void main(String[] args) {
		 int[] marks = {12,34,56,78,89};
		 int avg=0;
		 int sum=0;
		 for(int i=0;i<marks.length;i++) {
			 sum = sum+marks[i];
		 }
		 avg = sum / marks.length;
		 System.out.println("Avergare is- "+ avg);

	}

}
