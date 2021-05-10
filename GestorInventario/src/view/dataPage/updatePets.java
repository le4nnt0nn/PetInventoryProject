package view.dataPage;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.Pet;
import controller.Table;
import model.Pets;
import sounds.Sound;
import view.mainPage.successfulAction;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class updatePets extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSearch;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
	public updatePets() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 758, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(144, 238, 144));
		panel.setBounds(0, 0, 742, 387);
		contentPane.add(panel);
			
		/*Table*/
		table = new JTable();
		table.setBounds(10, 109, 509, 241);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model2 = (DefaultTableModel)table.getModel();
				int selectedRowIndex = table.getSelectedRow();
				
				textField_1.setText(model2.getValueAt(selectedRowIndex, 0).toString());
				textField_2.setText(model2.getValueAt(selectedRowIndex, 1).toString());
				textField_3.setText(model2.getValueAt(selectedRowIndex, 2).toString());
				textField_4.setText(model2.getValueAt(selectedRowIndex, 3).toString());
				textField_5.setText(model2.getValueAt(selectedRowIndex, 4).toString());
				textField_6.setText(model2.getValueAt(selectedRowIndex, 5).toString());
			}
		});
		/*Edit model to table*/
		String[] petsColumns = {"idPet","Species","Breed","Sex","Age","Price"};
		new Table().showTable(table, "SELECT * FROM pets;",petsColumns);
		
		/*Scroll to table*/
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 509, 241);
		panel.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setViewportView(table);
		
	
		/*Lables*/
		
		JLabel lblListPetsMODE = new JLabel("Update Pets MODE");
		lblListPetsMODE.setForeground(Color.DARK_GRAY);
		lblListPetsMODE.setFont(new Font("Open Sans", Font.BOLD, 24));
		lblListPetsMODE.setBounds(253, 11, 237, 38);
		panel.add(lblListPetsMODE);
		
		JLabel lblIdpet = new JLabel("idPet");
		lblIdpet.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblIdpet.setBounds(560, 112, 46, 14);
		panel.add(lblIdpet);
		
		JLabel lblSpecies = new JLabel("Species");
		lblSpecies.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblSpecies.setBounds(560, 143, 60, 14);
		panel.add(lblSpecies);
		
		JLabel lblBreed = new JLabel("Breed");
		lblBreed.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblBreed.setBounds(560, 171, 55, 14);
		panel.add(lblBreed);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblSex.setBounds(560, 197, 46, 14);
		panel.add(lblSex);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblAge.setBounds(560, 225, 46, 14);
		panel.add(lblAge);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblPrice.setBounds(560, 253, 60, 14);
		panel.add(lblPrice);
		
		/*TextFields*/
		
		textFieldSearch = new JTextField();
		textFieldSearch.setColumns(10);
		textFieldSearch.setBounds(235, 60, 255, 20);
		panel.add(textFieldSearch);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(619, 109, 55, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(619, 140, 89, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(619, 168, 89, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(619, 194, 55, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(619, 222, 89, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(619, 250, 89, 20);
		panel.add(textField_6);
		
		/*Buttons and actions*/
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM pets where idPet='"+textFieldSearch.getText()+"' OR Species='"+textFieldSearch.getText()+"' OR Breed='"+textFieldSearch.getText()+"' OR Sex='"+textFieldSearch.getText()+"' OR Age='"+textFieldSearch.getText()+"' OR Price='"+textFieldSearch.getText()+"';",petsColumns);
			}
		});
		btnSearch.setBackground(Color.WHITE);
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnSearch.setBounds(508, 59, 89, 23);
		panel.add(btnSearch);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*Info to pet object*/
				int idPet = Integer.parseInt(textField_1.getText());
				String species = textField_2.getText();
				String breed = textField_3.getText();
				String sex = textField_4.getText();
				int age = Integer.parseInt(textField_5.getText());
				double price = Double.parseDouble(textField_6.getText());
				
				Pet pet = new Pet(idPet,species,breed,sex,age,price);
				new Pets().updatePet(pet);
				
				new successfulAction();
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnUpdate.setBounds(577, 302, 89, 23);
		panel.add(btnUpdate);
		
		JLabel lblOrderBy = new JLabel("Order by");
		lblOrderBy.setFont(new Font("Open Sans", Font.BOLD, 14));
		lblOrderBy.setBounds(71, 16, 112, 20);
		panel.add(lblOrderBy);
		
		JButton btnAge = new JButton("Age");
		btnAge.setBackground(Color.WHITE);
		btnAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM pets order by Age;",petsColumns);
			}
		});
		btnAge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnAge.setForeground(Color.BLACK);
		btnAge.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnAge.setBounds(109, 37, 89, 23);
		panel.add(btnAge);
		
		JButton btnPrice = new JButton("Price");
		btnPrice.setBackground(Color.WHITE);
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM pets order by Price;",petsColumns);
			}
		});
		btnPrice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnPrice.setForeground(Color.BLACK);
		btnPrice.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnPrice.setBounds(59, 75, 89, 23);
		panel.add(btnPrice);
		
		JButton btnSpecies = new JButton("Species");
		btnSpecies.setBackground(Color.WHITE);
		btnSpecies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM pets order by Species;",petsColumns);
			}
		});
		btnSpecies.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnSpecies.setForeground(Color.BLACK);
		btnSpecies.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnSpecies.setBounds(10, 37, 89, 23);
		panel.add(btnSpecies);
		
		/*Constructor*/
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("Update Pets Page");
	}
}
