package StringDemos.Programs;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String str = "jagroop kaur";
		int size = str.length();
		int vCount=0;
		int cCount=0;
		for(int i=0;i<size;i++) {
			char ch = str.charAt(i);
			System.out.println("char at index position-["+i+"] is- "+ch);
			if(ch=='a' || ch=='e' ||ch=='i'|| ch=='o'|| ch=='u') {
				vCount++;
			}else {
				cCount++;
			}
		}
		
		System.out.println("Vowel Count - "+vCount);
		System.out.println("Consonant Count - "+cCount);
		

	}

}
