package OOPs_Concepts.Methods;

import java.util.Arrays;

public class PassArrayasParameterInmethod {

	public void getSum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum is - "+ sum);
	}

	public static void main(String[] args) {
		PassArrayasParameterInmethod obj = new PassArrayasParameterInmethod();
		int[] nums = { 10, 20, 30 };
		obj.getSum(nums);
	}

}
