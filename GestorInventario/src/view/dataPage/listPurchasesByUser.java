package view.dataPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.Purchase;
import beans.User;
import controller.Table;
import sounds.Sound;
import utils.FileGen;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTable;

public class listPurchasesByUser extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSearch;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

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
	public listPurchasesByUser(User user) {
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
			
		/*Edit model to table*/
		String[] purchasesColumns = {"idPurchase","idUser","idPet","datePurchase","TotalPrice"};
		new Table().showTable(table,"SELECT * FROM purchases where idUser='"+user.getIdUser()+"'",purchasesColumns);
		
		/*Scroll to table*/
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 109, 509, 241);
		scrollPane.setViewportView(table);
		panel.add(scrollPane);
		
		
		/*Labels*/
		
		JLabel lblListPurchasesMode = new JLabel("List Purchases MODE");
		lblListPurchasesMode.setForeground(Color.DARK_GRAY);
		lblListPurchasesMode.setFont(new Font("Open Sans", Font.BOLD, 24));
		lblListPurchasesMode.setBounds(239, 11, 251, 20);
		panel.add(lblListPurchasesMode);
		
		JLabel lblIdpurchase = new JLabel("idPurchase");
		lblIdpurchase.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblIdpurchase.setBounds(551, 112, 68, 14);
		panel.add(lblIdpurchase);
		
		JLabel lblIduser = new JLabel("idUser");
		lblIduser.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblIduser.setBounds(559, 143, 60, 14);
		panel.add(lblIduser);
		
		JLabel lblIdpet = new JLabel("idPet");
		lblIdpet.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblIdpet.setBounds(559, 171, 55, 14);
		panel.add(lblIdpet);
		
		JLabel lblDatepurchase = new JLabel("Date");
		lblDatepurchase.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblDatepurchase.setBounds(558, 197, 39, 14);
		panel.add(lblDatepurchase);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblPrice.setBounds(559, 225, 46, 14);
		panel.add(lblPrice);
		
		JLabel lblOrderBy = new JLabel("Order by");
		lblOrderBy.setFont(new Font("Open Sans", Font.BOLD, 14));
		lblOrderBy.setBounds(71, 11, 112, 20);
		panel.add(lblOrderBy);
		
		
		/*TextFields*/
		
		textFieldSearch = new JTextField();
		textFieldSearch.setColumns(10);
		textFieldSearch.setBounds(235, 60, 255, 20);
		panel.add(textFieldSearch);
		
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
		
		
		/*Button to actions*/
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM purchases where idPurchase='"+textFieldSearch.getText()+"' OR idUser='"+textFieldSearch.getText()+"' OR idPet='"+textFieldSearch.getText()+"' OR datePurchase='"+textFieldSearch.getText()+"' OR totalPrice='"+textFieldSearch.getText()+"';",purchasesColumns);
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
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setBounds(508, 59, 89, 23);
		panel.add(btnSearch);
		
		JButton btnPrice = new JButton("Price");
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM purchases where idUser='"+user.getIdUser()+"' order by TotalPrice;",purchasesColumns);
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
		btnPrice.setBackground(Color.WHITE);
		btnPrice.setBounds(109, 32, 112, 23);
		panel.add(btnPrice);
		
		JButton btnDate = new JButton("Date");
		btnDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM purchases where idUser='"+user.getIdUser()+"' order by datePurchase;",purchasesColumns);
			}
		});
		btnDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnDate.setForeground(Color.BLACK);
		btnDate.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnDate.setBackground(Color.WHITE);
		btnDate.setBounds(59, 70, 89, 23);
		panel.add(btnDate);
		
		JButton btnIdpet = new JButton("idPet");
		btnIdpet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM purchases where idUser='"+user.getIdUser()+"' order by idPet;",purchasesColumns);
			}
		});
		btnIdpet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnIdpet.setForeground(Color.BLACK);
		btnIdpet.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnIdpet.setBackground(Color.WHITE);
		btnIdpet.setBounds(10, 32, 89, 23);
		panel.add(btnIdpet);
		
		JButton btnExport = new JButton("Export");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Compra seleccionada a objeto
				Purchase selectedPurchase = new Purchase(Integer.parseInt(textField_3.getText()),textField_4.getText(),Double.parseDouble(textField_5.getText()));
				FileGen filegen = new FileGen();
				filegen.newFileGen(selectedPurchase, user);
			}
		});
		btnExport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnExport.setForeground(Color.BLACK);
		btnExport.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnExport.setBackground(Color.WHITE);
		btnExport.setBounds(580, 321, 112, 29);
		panel.add(btnExport);
		
		JLabel lblExportText = new JLabel("Select a purchase \r\nand export it !");
		lblExportText.setForeground(Color.DARK_GRAY);
		lblExportText.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblExportText.setBounds(551, 287, 181, 34);
		panel.add(lblExportText);
		
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("List Purchases Page");
	}
}
