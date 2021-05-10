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

	/*Receive a table and returns it edited with the sql statement*/
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
		
}
