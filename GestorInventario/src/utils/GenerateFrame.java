package utils;

import java.awt.Image;
import java.awt.Toolkit;

import view.dataPage.addPetJF;
import view.dataPage.addPurchaseJF;
import view.dataPage.addUserJF;
import view.dataPage.deletePet;
import view.dataPage.deletePurchase;
import view.dataPage.deleteUser;
import view.dataPage.listPets;
import view.dataPage.listPurchases;
import view.dataPage.listPurchasesByUser;
import view.dataPage.listUsers;
import view.dataPage.updatePets;
import view.dataPage.updatePurchases;
import view.dataPage.updateUsers;
import view.loginPage.*;
import view.mainPage.MainPageJF;
import view.mainPage.clientPage;
import view.mainPage.petPage;
import view.mainPage.purchasePage;
import view.mainPage.successfulAction;
import view.mainPage.userMainPageJF;
import sounds.Sound;

public class GenerateFrame {

	
	public static void genDeletePet() {
		deletePet frame = new deletePet();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Delete Pet Page");
	}
	
	public static void genDeleteUser() {
		deleteUser frame = new deleteUser();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Delete User Page");
	}
	
	public static void genDeletePurchase() {
		deletePurchase frame = new deletePurchase();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Delete Purchase Page");
	}
}
