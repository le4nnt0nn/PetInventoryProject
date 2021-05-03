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
import utils.GenerateFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class updatePets extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
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
		
		JLabel lblListPetsMODE = new JLabel("Update Pets MODE");
		lblListPetsMODE.setForeground(Color.DARK_GRAY);
		lblListPetsMODE.setFont(new Font("Open Sans", Font.BOLD, 24));
		lblListPetsMODE.setBounds(253, 11, 237, 38);
		panel.add(lblListPetsMODE);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(235, 60, 255, 20);
		panel.add(textField);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnSearch.setBounds(508, 59, 89, 23);
		panel.add(btnSearch);
		
		table = new JTable();
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
		//Modelo
			String[] petsColumns = {"idPet","Species","Breed","Sex","Age","Price"};
			new Table().showTable(table, "SELECT * FROM pets;",petsColumns);
		
		table.setBounds(10, 109, 509, 241);
		panel.add(table);
		
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
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Info to Object Pet
				int idPet = Integer.parseInt(textField_1.getText());
				String species = textField_2.getText();
				String breed = textField_3.getText();
				String sex = textField_4.getText();
				int age = Integer.parseInt(textField_5.getText());
				double price = Double.parseDouble(textField_6.getText());
				
				Pet pet = new Pet(idPet,species,breed,sex,age,price);
				new Pets().updatePet(pet);
				
				new GenerateFrame().genSucAction();
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnUpdate.setBounds(577, 302, 89, 23);
		panel.add(btnUpdate);
	}
}
