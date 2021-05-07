package main;

import java.awt.EventQueue;

import java.awt.Image;
import java.awt.Toolkit;

import bbdd.conexion;
import view.loginPage.*;
import utils.GenerateFrame;

public class Main {
	
	public static void main(String[] args) {
				
		//conexion a bbdd
		conexion.Conectar();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new GenerateFrame().genLogin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
