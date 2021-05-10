package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import bbdd.conexion;
import beans.User;
import model.Users;
import view.loginPage.FailedLogin;
import view.loginPage.SuccessfulLogin;
import view.mainPage.MainPageJF;
import view.mainPage.userMainPageJF;

public class Login {
	
	/*Check if user exist and user role*/
	public boolean checkUser(String username, String password) {
		User user = new Users().getUserByNamePass(username, password);
		
		if(user==null) {
			new FailedLogin();
		}
		String userRole = user.getRole();
		if(userRole.equals("client")) {
			System.out.println("CLIENTE");
			new userMainPageJF(user);
			new SuccessfulLogin();
			
			return true;
		}else if(userRole.equals("admin")) { 
			System.out.println("ADMIN");
			new MainPageJF();
			new SuccessfulLogin();
			
			return true;
		}
		return false;
	}
	
	/*Check user role with boolean*/
	public boolean checkUserRole(User user) {
		if(user.getRole().equals("client")) {
			return false;
		}else if(user.getRole().equals("admin")) {
			
		}
		return true;
	}
}
