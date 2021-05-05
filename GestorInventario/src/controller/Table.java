package controller;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;
import beans.Pet;
import model.Pets;

public class Table {

	public static JTable showTable(JTable table, String sql, String[]colNames) {
		try {
			DefaultTableModel model = new DefaultTableModel();
			table.setModel(model);
			
			ResultSet rs = null;
			rs = new conexion().EjecutarSentencia(sql);
			ResultSetMetaData rsMd = rs.getMetaData();
			int columns = rsMd.getColumnCount();
			

			for(int i=0; i<colNames.length;i++) {
				model.addColumn(i);
			}
			
			while(rs.next()) {
				
				Object[] rows = new Object[columns];
				for(int i=0; i<columns; i++) {
					rows[i] = rs.getObject(i+1);
				}
				
				model.addRow(rows);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return table;
		
	}
	
	public static JTable findPets(JTable table, String textField, String[]colNames) {
		ArrayList<Pet> pets = new Pets().getAllPetsToSearch(textField);
		DefaultTableModel model = new DefaultTableModel();
		Object[] rows = new Object[6];
		
		for(int i=0; i<colNames.length;i++) {
			model.addColumn(i);
		}
		
		for(int i=0; i<pets.size(); i++) {
			rows [0] = pets.get(i).getIdPet();
			rows [1] = pets.get(i).getSpecies();
			rows [2] = pets.get(i).getBreed();
			rows [3] = pets.get(i).getSex();
			rows [4] = pets.get(i).getAge();
			rows [5] = pets.get(i).getPrice();
			
		}
		model.addRow(rows);
		table.setModel(model);
		
		return table;
		
	}
	
}
