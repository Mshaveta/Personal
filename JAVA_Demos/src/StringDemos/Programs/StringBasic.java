package StringDemos.Programs;

public class StringBasic {

	public static void main(String[] args) {
		String name = "Jagroop Kaur";
		int size = name.length();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			System.out.println(name.charAt(i)); 
		}
	}

}
