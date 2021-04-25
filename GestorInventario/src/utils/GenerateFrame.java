package utils;

import java.awt.Image;
import java.awt.Toolkit;

import view.loginPage.*;
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
}
