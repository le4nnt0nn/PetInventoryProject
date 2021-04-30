package model;

import java.sql.Date;
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
		Date date = purchase.getDatePurchase();
		double totalPrice = purchase.getTotalPrice();
		
		conexion.EjecutarUpdate("INSERT INTO purchases (idUser, idPet, date, totalPrice) VALUES ('"+idUser+"','"+idPet+"','"+date+"','"+totalPrice+"');");
		
	}
	
	public static void updatePurchase(Purchase purchase) {
		int idPurchase = purchase.getIdPurchase();
		int idUser = purchase.getIdUser();
		int idPet = purchase.getIdPet();
		Date date = purchase.getDatePurchase();
		double totalPrice = purchase.getTotalPrice();
		
		conexion.EjecutarUpdate("UPDATE purchases SET idUser='"+idUser+"',idPet='"+idPet+"',date='"+date+"',totalPrice='"+totalPrice+"';");
		
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
			Date date = rs.getDate("date");
			double totalPrice = rs.getDouble("totalPrice");
			Purchase caughtPurchase = new Purchase(idPurchase, idUser, idPet, date, totalPrice);
			return caughtPurchase;
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
		return null;
	}

public static ArrayList<Purchase> getAllPurchases() {
	ArrayList<Purchase> purchases = new ArrayList<Purchase>();
	ResultSet rs = conexion.EjecutarSentencia("SELECT * FROM purchases;");
	try {
		
		while(rs.next()) {
			int idPurchase = rs.getInt("idPurchase");
			int idUser = rs.getInt("idUser");
			int idPet = rs.getInt("idPet");
			Date date = rs.getDate("date");
			double totalPrice = rs.getDouble("totalPrice");
			purchases.add(new Purchase(idPurchase, idUser, idPet, date, totalPrice));
		}
		
	} catch(SQLException e) {
		e.printStackTrace();
	}
		return purchases;
	}
}
