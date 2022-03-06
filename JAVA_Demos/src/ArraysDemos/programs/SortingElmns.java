package ArraysDemos.programs;

import java.util.Arrays;

public class SortingElmns {

	public static void main(String[] args) {
		int[] arr = {12,3,45,6,7,89,4};
		int size = arr.length;
		int temp=0;
		System.out.println("Before Sorting---"+ Arrays.toString(arr));
		for(int i=0;i<size;i++) {
			System.out.println("--------------------inside i loop- "+i+"-----------");
			for(int j=i+1;j<size;j++) {
				System.out.println("inside j loop- "+j);
				if(arr[i]>arr[j]) {
					System.out.println(arr[i]+" > "+arr[j]+"--- need to shuffle");
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}else {
					System.out.println(arr[i]+" < "+arr[j]+"--- no need to shuffle");
				}
			}
			System.out.println("=============="+Arrays.toString(arr)+"==================");
			 
		}
		
		System.out.println("After Sorting---"+ Arrays.toString(arr));
	}

}
