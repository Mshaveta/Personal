package ArraysDemos;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputsIntoArray {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 System.out.println("Please enter the size of an array");
		 int size = scn.nextInt(); 
		 int[] marks = new int[size];
		 int sum=0;
		 for(int i=0;i<marks.length;i++) {
			 System.out.println("Please enter the value for index no.-"+ i);
			 marks[i]= scn.nextInt(); 
			 sum=sum+marks[i];
		 }
		 
		 System.out.println("Sum of array elmns is-"+sum);

	}

}
