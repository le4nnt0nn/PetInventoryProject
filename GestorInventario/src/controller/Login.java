package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import bbdd.conexion;
import beans.User;
import model.Users;
import utils.GenerateFrame;

public class Login {

	public void checkUser(String username, String password) {
		User user = new Users().getUserByNamePass(username, password);
		if(user==null) {
			new GenerateFrame().genFailLogin();
		}
		if(user.getRole().equals("client") && user!=null) {
			System.out.println("CLIENTE");
			new GenerateFrame().genUserMainPage();
			new GenerateFrame().genSucLogin();
		}else if(user.getRole().equals("admin") && user!=null) { 
			System.out.println("ADMIN");
			new GenerateFrame().genMainPage();
			new GenerateFrame().genSucLogin();
		}
	}
}
