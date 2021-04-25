package utils;

import java.awt.Image;
import java.awt.Toolkit;

import view.loginPage.*;

public class GenerateFrame {

	public static void genLogin() {
		LoginPageJF frame = new LoginPageJF();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
}
