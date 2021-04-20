package main;

import java.awt.EventQueue;

import bbdd.conexion;
import loginPage.LoginPageJF;

public class Main {
	
	public static void main(String[] args) {
		
		//conexion a bbdd
		conexion.Conectar();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPageJF frame = new LoginPageJF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
