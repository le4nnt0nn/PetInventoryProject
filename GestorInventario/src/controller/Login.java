package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import bbdd.conexion;
import beans.User;
import utils.GenerateFrame;

public class Login {

	public static void login(String username, String password) {
		ResultSet rs = conexion.EjecutarSentencia("select * from users where username='"+username+"' and password='"+password+"';");
		try {
			if(rs.next() && user.getRole().equals("admin")) {
				new GenerateFrame().genSucLogin();
				new GenerateFrame().genMainPage();
			}else if(rs.next() && user.getRole().equals("client")){
				new GenerateFrame().genSucLogin();
				new GenerateFrame().genUserMainPage();
			}else if(!rs.next()){
				new GenerateFrame().genFailLogin();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
