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
		if(user.getRole().equals("client")) {
			System.out.println("CLIENTE");
		}else if(user.getRole().equals("admin")) { 
			System.out.println("ADMIN");
		}
	}
}
