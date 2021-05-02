package controller;
import java.sql.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;

public class Table {

	public static JTable showTable(JTable table, String sql) {
		try {
			DefaultTableModel model = new DefaultTableModel();
			table.setModel(model);
			
			ResultSet rs = null;
			rs = new conexion().EjecutarSentencia(sql);
			ResultSetMetaData rsMd = rs.getMetaData();
			int columns = rsMd.getColumnCount();
			
			
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
