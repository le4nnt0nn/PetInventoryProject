package utils;

import java.awt.Image;
import java.awt.Toolkit;

import view.dataPage.addPetJF;
import view.dataPage.addPurchaseJF;
import view.dataPage.addUserJF;
import view.dataPage.deletePet;
import view.dataPage.deleteUser;
import view.dataPage.listPets;
import view.dataPage.listPurchases;
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
import sounds.Sound;

public class GenerateFrame {

	public static void genLogin() {
		LoginPageJF frame = new LoginPageJF();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genSucLogin() {
		Sound sound = new Sound();
		SuccessfulLogin suc = new SuccessfulLogin();
		sound.successfulLogin();
		suc.show();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		suc.setIconImage(icon);
		suc.getContentPane().setLayout(null);
		suc.setVisible(true);
	}
	
	public static void genSucAction() {
		Sound sound = new Sound();
		successfulAction frame = new successfulAction();
		sound.successfulLogin();
		frame.show();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genFailLogin() {
		Sound sound = new Sound();
		FailedLogin fail = new FailedLogin();
		sound.fail_login();
		fail.show();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		fail.setIconImage(icon);
		fail.getContentPane().setLayout(null);
		fail.setVisible(true);
	}
	
	public static void genMainPage() {
		MainPageJF frame = new MainPageJF();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genPetPage() {
		petPage frame = new petPage();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genClientPage() {
		clientPage frame = new clientPage();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genPurchasePage() {
		purchasePage frame = new purchasePage();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genAddPetPage() {
		addPetJF frame = new addPetJF();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genAddUserPage() {
		addUserJF frame = new addUserJF();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genAddPurchasePage() {
		addPurchaseJF frame = new addPurchaseJF();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genListPets() {
		listPets frame = new listPets();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genListUsers() {
		listUsers frame = new listUsers();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genListPurchases() {
		listPurchases frame = new listPurchases();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genUpdatePets() {
		updatePets frame = new updatePets();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genUpdateUsers() {
		updateUsers frame = new updateUsers();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genUpdatePurchases() {
		updatePurchases frame = new updatePurchases();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genDeletePet() {
		deletePet frame = new deletePet();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genDeleteUser() {
		deleteUser frame = new deleteUser();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void genDeletePurchase() {
		
	}
}
