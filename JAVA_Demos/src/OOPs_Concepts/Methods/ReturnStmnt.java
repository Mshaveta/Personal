package OOPs_Concepts.Methods;

public class ReturnStmnt {
	public int sumOfTerms(int a, int b) {
		int sum = a+b; 
		return sum;
	}
	
	public int getAvg(int x, int y) {
		int sum = sumOfTerms(x,y); //method calling
		int avgRes = sum/2;
		return avgRes;
	 
		
	}

	public static void main(String[] args) {
		ReturnStmnt rs = new ReturnStmnt();
		int avg = rs.getAvg(100,100);
		System.out.println(avg);
		System.out.println("end of main method....");
		 
	}
}
