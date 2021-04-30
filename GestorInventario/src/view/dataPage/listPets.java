package view.dataPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import beans.Pet;
import model.Pets;

public class listPets extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSearch;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listPets frame = new listPets();
					frame.setVisible(true);
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
		lblListPetsMODE.setForeground(Color.DARK_GRAY);
		lblListPetsMODE.setFont(new Font("Open Sans", Font.BOLD, 24));
		lblListPetsMODE.setBounds(276, 11, 189, 20);
		panel.add(lblListPetsMODE);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(235, 60, 255, 20);
		panel.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnSearch.setBounds(508, 59, 89, 23);
		panel.add(btnSearch);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Pet[][] {
				
				//COMPLETAR TABLA
			},
			new String[] {
				"idPet", "Species", "Breed", "Sex", "Age", "Price"
			}
		));
		table.setBounds(45, 109, 552, 241);
		panel.add(table);
	}
}
