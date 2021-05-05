package view.dataPage;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import controller.Table;
import bbdd.conexion;
import beans.Pet;
import model.Pets;
import sounds.Sound;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class listPets extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSearch;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblIdpet;
	private JLabel lblSpecies;
	private JLabel lblBreed;
	private JLabel lblSex;
	private JLabel lblAge;
	private JLabel lblPrice;
	private JScrollPane scrollPane;

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
	public listPets() {
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
		
		JLabel lblListPetsMODE = new JLabel("List Pets MODE");
		lblListPetsMODE.setBounds(276, 11, 189, 20);
		lblListPetsMODE.setForeground(Color.DARK_GRAY);
		lblListPetsMODE.setFont(new Font("Open Sans", Font.BOLD, 24));
		panel.add(lblListPetsMODE);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(235, 60, 255, 20);
		panel.add(textFieldSearch);
		textFieldSearch.setColumns(10);
			
		table = new JTable();
		table.setBounds(10, 109, 509, 241);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model2 = (DefaultTableModel)table.getModel();
				int selectedRowIndex = table.getSelectedRow();
				
				textField.setText(model2.getValueAt(selectedRowIndex, 0).toString());
				textField_1.setText(model2.getValueAt(selectedRowIndex, 1).toString());
				textField_2.setText(model2.getValueAt(selectedRowIndex, 2).toString());
				textField_3.setText(model2.getValueAt(selectedRowIndex, 3).toString());
				textField_4.setText(model2.getValueAt(selectedRowIndex, 4).toString());
				textField_5.setText(model2.getValueAt(selectedRowIndex, 5).toString());
			}
		});
		
		//Modelo
		String[] petsColumns = {"idPet","Species","Breed","Sex","Age","Price"};
		new Table().showTable(table, "SELECT * FROM pets;",petsColumns);
		//panel.add(table);
		
		//Scroll
		scrollPane = new JScrollPane();
		panel.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 109, 509, 241);
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(619, 109, 55, 20);
		textField.setColumns(10);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(619, 140, 89, 20);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(619, 168, 89, 20);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(619, 194, 55, 20);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(619, 222, 89, 20);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(619, 250, 89, 20);
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		lblIdpet = new JLabel("idPet");
		lblIdpet.setBounds(560, 112, 46, 14);
		lblIdpet.setFont(new Font("Open Sans", Font.BOLD, 11));
		panel.add(lblIdpet);
		
		lblSpecies = new JLabel("Species");
		lblSpecies.setBounds(560, 143, 60, 14);
		lblSpecies.setFont(new Font("Open Sans", Font.BOLD, 11));
		panel.add(lblSpecies);
		
		lblBreed = new JLabel("Breed");
		lblBreed.setBounds(560, 171, 55, 14);
		lblBreed.setFont(new Font("Open Sans", Font.BOLD, 11));
		panel.add(lblBreed);
		
		lblSex = new JLabel("Sex");
		lblSex.setBounds(560, 197, 46, 14);
		lblSex.setFont(new Font("Open Sans", Font.BOLD, 11));
		panel.add(lblSex);
		
		lblAge = new JLabel("Age");
		lblAge.setBounds(560, 225, 46, 14);
		lblAge.setFont(new Font("Open Sans", Font.BOLD, 11));
		panel.add(lblAge);
		
		lblPrice = new JLabel("Price");
		lblPrice.setBounds(560, 253, 60, 14);
		lblPrice.setFont(new Font("Open Sans", Font.BOLD, 11));
		panel.add(lblPrice);
		
		JLabel lblOrderBy = new JLabel("Order by");
		lblOrderBy.setBounds(71, 16, 112, 20);
		lblOrderBy.setFont(new Font("Open Sans", Font.BOLD, 14));
		panel.add(lblOrderBy);
		
		
		//Search
		String value = textFieldSearch.getText();
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(508, 59, 89, 23);
		btnSearch.setBackground(Color.WHITE);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().findPets(table, value, petsColumns);
			}
		});
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		panel.add(btnSearch);
		
		JButton btnAge = new JButton("Age");
		btnAge.setBounds(109, 37, 89, 23);
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
		panel.add(btnAge);
		
		JButton btnPrice = new JButton("Price");
		btnPrice.setBounds(59, 75, 89, 23);
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
		panel.add(btnPrice);
		
		JButton btnSpecies = new JButton("Species");
		btnSpecies.setBounds(10, 37, 89, 23);
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
		panel.add(btnSpecies);
		
		
	}
}
