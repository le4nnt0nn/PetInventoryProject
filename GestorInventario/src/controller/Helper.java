package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.User;

public class Helper {

	/*Rs to object*/
	public User resultSet2Object(ResultSet result){
		try {
			if(result.next()) {
				int idUser = result.getInt("idUser");
				String username = result.getString("username");
				String password = result.getString("password");
				String role = result.getString("role");
				String name = result.getString("name");
				String lastname = result.getString("lastname");
				String address = result.getString("address");
				String birth = result.getString("birth");
				int phone = result.getInt("phone");
				User user = new User(idUser, username, password, role, name, lastname, address, birth, phone);
				return user;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error");
		}
		return null;
	}
	
	/*Rs to ArrayList*/
	public ArrayList ResultSet2ArrayList(ResultSet results) {
		ArrayList<User> arraylist = new ArrayList<User>();
		try {
			while(results.next()) {
				int idUser = results.getInt("idUser");
				String username = results.getString("username");
				String password = results.getString("password");
				String role = results.getString("role");
				String name = results.getString("name");
				String lastname = results.getString("lastname");
				String address = results.getString("address");
				String birth = results.getString("birth");
				int phone = results.getInt("phone");
				arraylist.add(new User(idUser, username, password, role, name, lastname, address, birth, phone));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}
		
		return arraylist;
	}
}
