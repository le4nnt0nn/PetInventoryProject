package view.dataPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.Table;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class listPurchases extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblIdpurchase;
	private JLabel lblIduser;
	private JLabel lblIdpet;
	private JLabel lblDatepurchase;
	private JLabel lblPrice;

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
	public listPurchases() {
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
			}
		});
		
		//Modelo
		String[] purchasesColumns = {"idPurchase","idUser","idPet","datePurchase","TotalPrice"};
		new Table().showTable(table, "SELECT * FROM purchases;",purchasesColumns);
		
		table.setBounds(10, 109, 509, 241);
		panel.add(table);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(618, 109, 55, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(618, 140, 55, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(618, 168, 55, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(618, 194, 89, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(618, 222, 89, 20);
		panel.add(textField_5);
		
		lblIdpurchase = new JLabel("idPurchase");
		lblIdpurchase.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblIdpurchase.setBounds(551, 112, 68, 14);
		panel.add(lblIdpurchase);
		
		lblIduser = new JLabel("idUser");
		lblIduser.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblIduser.setBounds(559, 143, 60, 14);
		panel.add(lblIduser);
		
		lblIdpet = new JLabel("idPet");
		lblIdpet.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblIdpet.setBounds(559, 171, 55, 14);
		panel.add(lblIdpet);
		
		lblDatepurchase = new JLabel("Date");
		lblDatepurchase.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblDatepurchase.setBounds(558, 197, 39, 14);
		panel.add(lblDatepurchase);
		
		lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblPrice.setBounds(559, 225, 46, 14);
		panel.add(lblPrice);
	}
}
