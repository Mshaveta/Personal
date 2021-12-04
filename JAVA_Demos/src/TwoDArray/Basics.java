package ArraysDemos.TwoDArray;

import java.util.Arrays;

public class Basics {

	public static void main(String[] args) {
		// way1: 2D Array Declaration----valid way
		 int[][] arr_name = new int[5][3];
		 System.out.println("Array Name-"+arr_name);//[[I@15db9742
		 System.out.println(Arrays.toString(arr_name)); //[[I@6d06d69c, [I@7852e922, [I@4e25154f, [I@70dea4e]
		 System.out.println("Get row value - "+arr_name[1]);//[I@7852e922
		 //System.out.println(arr_name[2][3]);//ArrayIndex out of bound exception
		 
		 
		 System.out.println(arr_name[0][0]);//int->0
		 System.out.println(arr_name[0][1]);
		 System.out.println(arr_name[1][0]);
		 System.out.println(arr_name[1][1]);
	 
		 //assign the value
		 arr_name[0][0] = 12;
		 arr_name[0][1] = 13;
		 arr_name[1][0] = 23;
		 arr_name[1][1] = 33;
		// System.out.println(Arrays.toString(arr_name[0]));
		 //System.out.println(Arrays.toString(arr_name[1]));
		 System.out.println(arr_name[1][1]);
		
		 System.out.println("==========================================================================");
		 //way2: 
		 double[][] arr_name2 = new double[5][];
		 System.out.println("Array2 - "+arr_name2);//[[I@33909752
		 System.out.println(Arrays.toString(arr_name2));//[null, null, null, null, null]
		 System.out.println(Arrays.toString(arr_name2[2]));//null
		// System.out.println(arr_name2[5]);//ArrayIndex out of bound exception
		 
		 System.out.println("==========================================================================");
		 //way3: not possible -  compilation error
		// double[][] arr_name3 = new double[][2];
	}

}
