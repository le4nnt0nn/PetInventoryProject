package model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;

import bbdd.conexion;
import beans.Pet;

public class Pets {
	
	public static void addPet(Pet pet) {
		String species = pet.getSpecies();
		String breed = pet.getBreed();
		String sex = pet.getSex();
		int age = pet.getAge();
		double price = pet.getPrice();
		
		conexion.EjecutarUpdate("INSERT INTO pets (species,breed,sex,age,price) VALUES ('"+species+"','"+breed+"','"+sex+"','"+age+"','"+price+"');");
		
	}
	
	public static void updatePet(Pet pet) {
		int idPet = pet.getIdPet();
		String species = pet.getSpecies();
		String breed = pet.getBreed();
		String sex = pet.getSex();
		int age = pet.getAge();
		double price = pet.getPrice();
		
		conexion.EjecutarUpdate("UPDATE pets SET species='"+species+"',breed='"+breed+"',sex='"+sex+"',age='"+age+"',price='"+price+"' where idPet='"+idPet+"';");
		
	}
	
	public static void deletePet(int idPet) {
	
		conexion.EjecutarUpdate("DELETE FROM pets WHERE idPet='"+idPet+"';");
		
	}
	
	public Pet getPet(int idPetSelected) {
		ResultSet rs = conexion.EjecutarSentencia("SELECT * FROM pets WHERE idPet='"+idPetSelected+"';");
		try {
			
			if(rs.next()) {
				int idPet = rs.getInt("idPet");
				String species = rs.getString("species");
				String breed = rs.getString("breed");
				String sex = rs.getString("sex");
				int age = rs.getInt("age");
				double price = rs.getDouble("price");
				Pet caughtPet = new Pet(idPet, species, breed, sex, age, price);
				return caughtPet;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/*Collect all pets and stores them*/
	public static ArrayList<Pet> getAllPets() {
		ArrayList<Pet> pets = new ArrayList<Pet>();
		ResultSet rs = conexion.EjecutarSentencia("SELECT * FROM pets;");
		try {
			
			while(rs.next()) {
				int idPet = rs.getInt("idPet");
				String species = rs.getString("species");
				String breed = rs.getString("breed");
				String sex = rs.getString("sex");
				int age = rs.getInt("age");
				double price = rs.getDouble("price");
				pets.add(new Pet(idPet, species, breed, sex, age, price));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return pets;
	}
	
	/*Collect all pets according to the search value*/
	public static ArrayList<Pet> getAllPetsToSearch(String value) {
		ArrayList<Pet> pets = new ArrayList<Pet>();
		ResultSet rs = conexion.EjecutarSentencia("SELECT * FROM pets where idPet='"+value+"' OR Species='"+value+"' OR Breed='"+value+"' OR Sex='"+value+"' OR Age='"+value+"' OR Price='"+value+"';");
		try {
			
			while(rs.next()) {
				int idPet = rs.getInt("idPet");
				String species = rs.getString("species");
				String breed = rs.getString("breed");
				String sex = rs.getString("sex");
				int age = rs.getInt("age");
				double price = rs.getDouble("price");
				pets.add(new Pet(idPet, species, breed, sex, age, price));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return pets;
	}
	
}
