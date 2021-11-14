package ArraysDemos.programs;

public class ForEachloop {
	public static void main(String[] args) {
		int[] arrName = {1,2,45,56,6,78,3};
		//Way2: to iterate the Array elmns
		for( int newVarName : arrName ) {
			System.out.println(newVarName);
		}
	}
}
