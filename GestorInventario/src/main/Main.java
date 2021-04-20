package main;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

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
					Image icon = Toolkit.getDefaultToolkit().getImage("\\icon.png"); 
					frame.setIconImage(icon);
					frame.getContentPane().setLayout(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
