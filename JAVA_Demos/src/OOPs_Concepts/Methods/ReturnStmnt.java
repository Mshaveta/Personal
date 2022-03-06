package OOPs_Concepts.Methods;

public class ReturnStmnt {
	public int sumOfTerms(int a, int b) {
		int sum = a+b; 
		//System.out.println(sum);
		return sum;
	}
	
	public void getAvg(int x, int y) {
		//int sum = sumOfTerms(x,y); //method calling
		//int avgRes = sum/2;
		//return avgRes;
	}

	public static void main(String[] args) {
		ReturnStmnt rs = new ReturnStmnt();
//		int avg = rs.getAvg(100,100);
//		System.out.println(avg);
//		System.out.println("end of main method....");
		//rs.sumOfTerms(12,34);
		int res = 100 + rs.sumOfTerms(12,34);
		System.out.println(res);
		 
	}
}
