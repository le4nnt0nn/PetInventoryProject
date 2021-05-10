package view.dataPage;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.Pet;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.Pets;

import view.mainPage.successfulAction;

public class addPetJF extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldSpecies;
	private JTextField textFieldBreed;
	private JTextField textFieldAge;
	private JTextField textFieldPrice;
	private JTextField textFieldSex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addPetJF() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 758, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(144, 238, 144));
		panel.setBounds(0, 0, 742, 387);
		contentPane.add(panel);
		panel.setLayout(null);
		
		/*TextFields*/
		
		textFieldSex = new JTextField();
		textFieldSex.setBounds(254, 224, 212, 20);
		panel.add(textFieldSex);
		textFieldSex.setColumns(10);
		
		textFieldSpecies = new JTextField();
		textFieldSpecies.setBounds(259, 126, 207, 20);
		panel.add(textFieldSpecies);
		textFieldSpecies.setColumns(10);
		
		textFieldBreed = new JTextField();
		textFieldBreed.setBounds(259, 175, 207, 20);
		panel.add(textFieldBreed);
		textFieldBreed.setColumns(10);
		
		textFieldAge = new JTextField();
		textFieldAge.setBounds(254, 276, 86, 20);
		panel.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setText("");
		textFieldPrice.setBounds(380, 276, 86, 20);
		panel.add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		/*Labels*/
		
		JLabel lblAddPet = new JLabel("Add Pet MODE");
		lblAddPet.setForeground(Color.DARK_GRAY);
		lblAddPet.setFont(new Font("Open Sans", Font.BOLD, 24));
		lblAddPet.setBounds(275, 11, 178, 20);
		panel.add(lblAddPet);
		
		JLabel lblSpecies = new JLabel("SPECIES");
		lblSpecies.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblSpecies.setBounds(330, 107, 70, 14);
		panel.add(lblSpecies);
		
		JLabel lblBreed = new JLabel("BREED");
		lblBreed.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblBreed.setBounds(330, 157, 70, 14);
		panel.add(lblBreed);
		
		JLabel lblSex = new JLabel("SEX");
		lblSex.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblSex.setBounds(337, 206, 35, 14);
		panel.add(lblSex);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblAge.setBounds(284, 255, 35, 14);
		panel.add(lblAge);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblPrice.setBounds(397, 255, 50, 14);
		panel.add(lblPrice);
		
		/*Buttons and actions*/
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.setBackground(Color.WHITE);
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*Info to object*/
				String species = textFieldSpecies.getText();
				String breed = textFieldBreed.getText();
				String sex = textFieldSex.getText();
				int age = Integer.parseInt(textFieldAge.getText());
				double price = Double.parseDouble(textFieldPrice.getText());
				
				Pet pet = new Pet(species,breed,sex,age,price);
				new Pets().addPet(pet);
				
				new successfulAction();
			}
		});
		btnFinish.setForeground(Color.BLACK);
		btnFinish.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnFinish.setBounds(311, 324, 89, 23);
		panel.add(btnFinish);
		
		/*Constructor*/
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("Add Pet Page");
		
	}
}
