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

public class listPurchases extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listPurchases frame = new listPurchases();
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
	public listPurchases() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel lblListPurchasesMode = new JLabel("List Purchases MODE");
		lblListPurchasesMode.setForeground(Color.DARK_GRAY);
		lblListPurchasesMode.setFont(new Font("Open Sans", Font.BOLD, 24));
		lblListPurchasesMode.setBounds(214, 11, 251, 20);
		panel.add(lblListPurchasesMode);
		
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
		table.setBounds(45, 109, 552, 241);
		panel.add(table);
	}

}
