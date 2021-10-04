package operators.programs;

import java.util.Scanner;

public class NotesProg {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amount =  scn.nextInt();//5200
		
		//int amount = 2300;
		
		int notes_500 = 0,notes_100 = 0,notes_50=0,notes_20=0,notes_10=0,notes_5=0,notes_2=0,notes_1=0;
		if(amount >=500){
			notes_500 = amount/500;
			amount = amount-(notes_500*500);//5200-(10*500) =  200
		}
		if(amount >=100) {
			notes_100 = amount/100;//200/100===2
			amount = amount-(notes_100*100); //200 - (2*100)=0
		}
		if(amount >=50) {
			notes_50 = amount/50;//200/100===2
			amount = amount-(notes_50*50); //200 - (2*100)=0
		}
		if(amount >=20) {
			notes_20 = amount/20;//200/100===2
			amount = amount-(notes_20*20); //200 - (2*100)=0
		}
		 
		if(amount >=10) {
			notes_10 = amount/10;//200/100===2
			amount = amount-(notes_10*10); //200 - (2*100)=0
		}
		if(amount >=5) {
			notes_5 = amount/5;//200/100===2
			amount = amount-(notes_5*5); //200 - (2*100)=0
		}
		if(amount >=2) {
			notes_2 = amount/2;//200/100===2
			amount = amount-(notes_2*2); //200 - (2*100)=0
		}
		 
		if(amount==1) {
			notes_1 = amount/1;//200/100===2
			amount = amount-(notes_1*1); //200 - (2*100)=0
		}
		 System.out.println("Notes of 500 - "+notes_500);
		 System.out.println("Notes of 100 - "+notes_100);
		 System.out.println("Notes of 50 - "+notes_50);
		 System.out.println("Notes of 20 - "+notes_20);
		 System.out.println("Notes of 10 - "+notes_10);
		 System.out.println("Notes of 5 - "+notes_5);
		 System.out.println("Notes of 2 - "+notes_2);
		 System.out.println("Notes of 1 - "+notes_1);

	}

}
