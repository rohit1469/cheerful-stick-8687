package UseCases;

import java.util.Scanner;

import Login.UserActivity;

public class LoginGpm {
	public static void  LGpm() {
		
		Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Username:");
			String uname = sc.next();
			
			System.out.println("Enter Password:");
			String pass = sc.next();
			if(uname.equals("rohit@gmail.com") && pass.equals("rohit")) {
				System.out.println(" login successful");
				UserActivity.gpm();
			}else {
				System.out.println("Username or password are wrong try again");
				
			}	
		
		}
}
