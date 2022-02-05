package OOPs_Concepts.Methods;

import java.util.Scanner;

public class MethodsDemo {
	String expectedTitle="Facebook";
	public void launchBrowser(String browser) {
		System.out.println(browser+" browser has  been launched successfully");
	}

	public void launchApp(String appName) {
		System.out.println(appName+" has  been launched successfully");
	}

	public void verifyTitle(String appActualTitle) {
		//if(appActualTitle.equals(expectedTitle)) {
		if(appActualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Yes, matched!");
		}else {
			System.out.println("Not Matched!");
		}
	}

	public void login(String username, String password) {
		System.out.println( "Login with valid creds- "+username + " & "+ password);
	}
	public void logOut() {
		System.out.println("user has been logged out successfully.");
	}

	public static void main(String[] args) {
		MethodsDemo md = new MethodsDemo();
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the browser name to launch");
		String browserName = scn.nextLine();
		md.launchBrowser(browserName);
		
		System.out.println("Please enter the application name to launch");
		String appName = scn.nextLine();
		System.out.println(appName);
 		md.launchApp(appName);
 		System.out.println("Please enter the title of an application");
 		String actualTitle = scn.nextLine();
		md.verifyTitle(actualTitle);
		
		String username="test1";
		String password = "pass1";
 		md.login(username,password);
 		md.logOut();
	}
}
