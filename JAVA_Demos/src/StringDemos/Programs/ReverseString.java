package StringDemos.Programs;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Jagroop Kaur";
		int size = name.length();
		
		for(int i=size-1;i>=0;i--) {
			System.out.print(name.charAt(i)); 
		}

	}
}
