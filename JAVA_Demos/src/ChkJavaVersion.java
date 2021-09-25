
public class ChkJavaVersion {

	public static void main(String[] args) {
		 String java_version = System.getProperty("java.version");
		 System.out.println(java_version);
		 
		 String userDir = System.getProperty("user.dir");
		 System.out.println(userDir);
	}

}
