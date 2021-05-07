package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import bbdd.conexion;
import beans.User;
import model.Users;
import utils.GenerateFrame;

public class Login {
	
	public boolean checkUser(String username, String password) {
		User user = new Users().getUserByNamePass(username, password);
		
		if(user==null) {
			new GenerateFrame().genFailLogin();
		}
		String userRole = user.getRole();
		if(userRole.equals("client")) {
			System.out.println("CLIENTE");
			new GenerateFrame().genUserMainPage();
			new GenerateFrame().genSucLogin();
			
			return true;
		}else if(userRole.equals("admin")) { 
			System.out.println("ADMIN");
			new GenerateFrame().genMainPage();
			new GenerateFrame().genSucLogin();
			
			return true;
		}
		return false;
	}
	public boolean checkUserRole(User user) {
		if(user.getRole().equals("client")) {
			return false;
		}else if(user.getRole().equals("admin")) {
			
		}
		return true;
	}
}
