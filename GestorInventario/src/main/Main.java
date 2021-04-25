package main;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import bbdd.conexion;
import loginPage.LoginPageJF;
import utils.GenerateFrame;

public class Main {
	
	public static void main(String[] args) {
		
		//conexion a bbdd
		conexion.Conectar();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerateFrame gen = new GenerateFrame();
					gen.genLogin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
