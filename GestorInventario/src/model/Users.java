package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.User;


public class Users {
	
	public static void addUser(User user) {
		String username = user.getUsername();
		String password = user.getPassword();
		String role = user.getRole();
		String name = user.getName();
		String lastname = user.getLastName();
		String address = user.getAddress();
		String birth = user.getBirth();
		int phone = user.getPhone();
		
		conexion.EjecutarUpdate("INSERT INTO users (username,password,role,name,lastname,address,birth,phone) VALUES ('"+username+"','"+password+"','"+role+"','"+name+"','"+lastname+"','"+address+"','"+birth+"','"+phone+"');");
		
	}
	
	public static void updateUser(User user) {
		int idUser = user.getIdUser();
		String username = user.getUsername();
		String password = user.getPassword();
		String role = user.getRole();
		String name = user.getName();
		String lastname = user.getLastName();
		String address = user.getAddress();
		String birth = user.getBirth();
		int phone = user.getPhone();
		
		conexion.EjecutarUpdate("UPDATE users SET username='"+username+"',password='"+password+"',role='"+role+"',name='"+name+"',lastname='"+lastname+"',address='"+address+"',birth='"+birth+"',phone='"+phone+"' where idUser='"+idUser+"';");
		
	}
	
	public static void deleteUser(User user) {
		
		conexion.EjecutarUpdate("DELETE FROM users WHERE idUser='"+user.getIdUser()+"';");
		
	}
	
	public User getUser(int idUserSelected) {
		ResultSet rs = conexion.EjecutarSentencia("SELECT * FROM users WHERE idUser='"+idUserSelected+"';");
		try {
			
			if(rs.next()) {
				int idUser = rs.getInt("idUser");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String role = rs.getString("role");
				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				String address = rs.getString("address");
				String birth = rs.getString("birth");
				int phone = rs.getInt("phone");
				User caughtUser = new User(idUser, username, password, role, name, lastname, address, birth, phone);
				return caughtUser;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static ArrayList<User> getAllUsers() {
		ArrayList<User> users = new ArrayList<User>();
		ResultSet rs = conexion.EjecutarSentencia("SELECT * FROM users;");
		try {
			
			while(rs.next()) {
				int idUser = rs.getInt("idUser");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String role = rs.getString("role");
				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				String address = rs.getString("address");
				String birth = rs.getString("birth");
				int phone = rs.getInt("phone");
				users.add(new User(idUser, username, password, role, name, lastname, address, birth, phone));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	/*Collect user by username and password*/
	public User getUserByNamePass(String username, String password) {
		ResultSet userBD = conexion.EjecutarSentencia("SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"'");
		User user = new controller.Helper().resultSet2Object(userBD);
		return user;
	}

}
