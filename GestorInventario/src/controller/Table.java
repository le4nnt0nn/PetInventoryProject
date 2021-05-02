package controller;
import java.sql.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;

public class Table {

	public static JTable showTablePets(JTable table) {
		try {
			DefaultTableModel model = new DefaultTableModel();
			table.setModel(model);
			
			ResultSet rs = null;
			rs = new conexion().EjecutarSentencia("SELECT * FROM pets");
			ResultSetMetaData rsMd = rs.getMetaData();
			int columns = rsMd.getColumnCount();
			
			model.addColumn("idPet");
			model.addColumn("Species");
			model.addColumn("Breed");
			model.addColumn("Sex");
			model.addColumn("Age");
			model.addColumn("Price");
			
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
}
