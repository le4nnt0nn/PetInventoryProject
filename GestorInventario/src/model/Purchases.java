package model;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Purchase;
import beans.User;

public class Purchases {

	public static void addPurchase(Purchase purchase) {
		int idUser = purchase.getIdUser();
		int idPet = purchase.getIdPet();
		String datePurchase = purchase.getDatePurchase();
		double totalPrice = purchase.getTotalPrice();
		
		conexion.EjecutarUpdate("INSERT INTO purchases (idUser, idPet, datePurchase, totalPrice) VALUES ('"+idUser+"','"+idPet+"','"+datePurchase+"','"+totalPrice+"');");
		
	}
	
	public static void updatePurchase(Purchase purchase) {
		int idPurchase = purchase.getIdPurchase();
		int idUser = purchase.getIdUser();
		int idPet = purchase.getIdPet();
		String datePurchase = purchase.getDatePurchase();
		double totalPrice = purchase.getTotalPrice();
		
		conexion.EjecutarUpdate("UPDATE purchases SET idUser='"+idUser+"',idPet='"+idPet+"',datePurchase='"+datePurchase+"',totalPrice='"+totalPrice+"' where idPurchase='"+idPurchase+"';");
		
	}
	
	public static void deletePurchase(Purchase purchase) {
		
		conexion.EjecutarUpdate("DELETE FROM purchases WHERE idPurchase='"+purchase.getIdPurchase()+"';");
		
	}

	public Purchase getPurchase(int idPurchaseSelected) {
		ResultSet rs = conexion.EjecutarSentencia("SELECT * FROM purchases WHERE idPurchase='"+idPurchaseSelected+"';");
		try {
		
			if(rs.next()) {
				int idPurchase = rs.getInt("idPurchase");
				int idUser = rs.getInt("idUser");
				int idPet = rs.getInt("idPet");
				String date = rs.getString("date");
				double totalPrice = rs.getDouble("totalPrice");
				Purchase caughtPurchase = new Purchase(idPurchase, idUser, idPet, date, totalPrice);
				return caughtPurchase;
			}
		
		} catch (SQLException e) {
		e.printStackTrace();
		}
	
		return null;
	}

	/*Recoge todas las compras y las almacena*/
	public static ArrayList<Purchase> getAllPurchases() {
		ArrayList<Purchase> purchases = new ArrayList<Purchase>();
		ResultSet rs = conexion.EjecutarSentencia("SELECT * FROM purchases;");
		try {
		
			while(rs.next()) {
				int idPurchase = rs.getInt("idPurchase");
				int idUser = rs.getInt("idUser");
				int idPet = rs.getInt("idPet");
				String date = rs.getString("date");
				double totalPrice = rs.getDouble("totalPrice");
				purchases.add(new Purchase(idPurchase, idUser, idPet, date, totalPrice));
			}
		
		} catch(SQLException e) {
		e.printStackTrace();
		}
		return purchases;
	}

	/*Collect all purchases by user and stores them*/ 
	public static ArrayList<Purchase> getAllPurchasesByUser(int idUser) {
		ArrayList<Purchase> purchases = new ArrayList<Purchase>();
		ResultSet rs = conexion.EjecutarSentencia("SELECT * FROM purchases where idUser='"+idUser+"';");
		try {
		
			while(rs.next()) {
				int idPurchase = rs.getInt("idPurchase");
				int idPet = rs.getInt("idPet");
				String date = rs.getString("date");
				double totalPrice = rs.getDouble("totalPrice");
				purchases.add(new Purchase(idPurchase, idUser, idPet, date, totalPrice));
			}
		
		} catch(SQLException e) {
		e.printStackTrace();
		}
		return purchases;
	}
	
	/*Collect all purchases by user id*/
	public static void showPurchasesByUser(int idUser) {
		conexion.EjecutarSentencia("SELECT * FROM purchases where idUser='"+idUser+"';");
	}
}
