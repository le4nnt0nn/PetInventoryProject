package utils;

import java.io.FileWriter;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import beans.Purchase;
import beans.User;

public class FileGen {

	/*Stores purchase information in a selected directory by user*/
	public void newFileGen(Purchase purchase, User user) {
		
		JFileChooser f = new JFileChooser();
		f.setDialogTitle("Select a directory and save the purchase");
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        f.showSaveDialog(null);
        try(FileWriter writer = new FileWriter(f.getSelectedFile()+".md")) {
        	writer.write("# Pet Inventory Bill\n");
            writer.write("## Personal Information\n");
            writer.write("|Username|Name|Lastname|\n");
            writer.write("|----|-----|-------|\n");
            writer.write("|"+user.getUsername()+"|"+user.getName()+"|"+user.getLastName()+"|\n");
            writer.write("***\n");
            writer.write("## Purchase Information\n");
            writer.write(">#### All Data\n");
            writer.write("> * **Pet ID**: "+purchase.getIdPet()+"\n");
            writer.write("> * **Date**: "+purchase.getDatePurchase()+"\n");
            writer.write("> * **Price**: "+purchase.getTotalPrice()+"\n");
            writer.write("***\n");
            writer.write("## Thank you for your purchase !!\n");
            writer.close();
        }catch(Exception e) {
        	e.printStackTrace();
        }
        System.out.println(f.getCurrentDirectory());
        System.out.println(f.getSelectedFile());
	}
}
