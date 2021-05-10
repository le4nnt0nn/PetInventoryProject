package view.dataPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.Table;
import sounds.Sound;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class listUsers extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSearch;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblOrderBy;
	private JButton btnLastname;
	private JButton btnBirth;
	private JButton btnRole;

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
	public listUsers() {
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
		table.setBounds(10, 109, 535, 241);
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
				textField_7.setText(model2.getValueAt(selectedRowIndex, 6).toString());
				textField_8.setText(model2.getValueAt(selectedRowIndex, 7).toString());
				textField_9.setText(model2.getValueAt(selectedRowIndex, 8).toString());
			}
		});
		/*Edit model to table*/
		String[] usersColumns = {"idUser","Username","Passwrod","Role","Name","Lastname","Address","Birth","Phone"};
		new Table().showTable(table, "SELECT * FROM users;",usersColumns);
		
		/*Scroll to table*/
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 535, 241);
		panel.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setViewportView(table);
			
		/*Labels*/
		
		JLabel lblListUsersMode = new JLabel("List Users MODE");
		lblListUsersMode.setForeground(Color.DARK_GRAY);
		lblListUsersMode.setFont(new Font("Open Sans", Font.BOLD, 24));
		lblListUsersMode.setBounds(253, 11, 212, 20);
		panel.add(lblListUsersMode);
		
		JLabel lblIdUser = new JLabel("idUser");
		lblIdUser.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblIdUser.setBounds(564, 109, 46, 14);
		panel.add(lblIdUser);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblUsername.setBounds(564, 140, 60, 14);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblPassword.setBounds(564, 168, 55, 14);
		panel.add(lblPassword);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblRole.setBounds(564, 194, 46, 14);
		panel.add(lblRole);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblName.setBounds(564, 222, 46, 14);
		panel.add(lblName);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblLastname.setBounds(564, 250, 60, 14);
		panel.add(lblLastname);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblAddress.setBounds(564, 277, 46, 14);
		panel.add(lblAddress);
		
		JLabel lblBirth = new JLabel("Birth");
		lblBirth.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblBirth.setBounds(564, 306, 46, 14);
		panel.add(lblBirth);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblPhone.setBounds(564, 337, 46, 14);
		panel.add(lblPhone);
		
		lblOrderBy = new JLabel("Order by");
		lblOrderBy.setFont(new Font("Open Sans", Font.BOLD, 14));
		lblOrderBy.setBounds(71, 16, 112, 20);
		panel.add(lblOrderBy);
		

		/*TextFields*/
		
		textFieldSearch = new JTextField();
		textFieldSearch.setColumns(10);
		textFieldSearch.setBounds(235, 60, 255, 20);
		panel.add(textFieldSearch);
		
		textField_1 = new JTextField();
		textField_1.setBounds(623, 106, 55, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(623, 137, 89, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(623, 165, 89, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(623, 191, 55, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(623, 219, 89, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(623, 247, 89, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(623, 274, 89, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(623, 303, 89, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(623, 334, 89, 20);
		panel.add(textField_9);
		
		/*Buttons and actions*/
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM users where idUser='"+textFieldSearch.getText()+"' OR username='"+textFieldSearch.getText()+"' OR password='"+textFieldSearch.getText()+"' OR role='"+textFieldSearch.getText()+"' OR name='"+textFieldSearch.getText()+"' OR lastname='"+textFieldSearch.getText()+"' OR address='"+textFieldSearch.getText()+"' OR birth='"+textFieldSearch.getText()+"' OR phone='"+textFieldSearch.getText()+"';",usersColumns);
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
		
		btnLastname = new JButton("Lastname");
		btnLastname.setBackground(Color.WHITE);
		btnLastname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM users order by Lastname;",usersColumns);
			}
		});
		btnLastname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnLastname.setForeground(Color.BLACK);
		btnLastname.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnLastname.setBounds(109, 37, 112, 23);
		panel.add(btnLastname);
		
		btnBirth = new JButton("Birth");
		btnBirth.setBackground(Color.WHITE);
		btnBirth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM users order by Birth;",usersColumns);
			}
		});
		btnBirth.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnBirth.setForeground(Color.BLACK);
		btnBirth.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnBirth.setBounds(59, 75, 89, 23);
		panel.add(btnBirth);
		
		btnRole = new JButton("Role");
		btnRole.setBackground(Color.WHITE);
		btnRole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Table().showTable(table, "SELECT * FROM users order by Role;",usersColumns);
			}
		});
		btnRole.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnRole.setForeground(Color.BLACK);
		btnRole.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnRole.setBounds(10, 37, 89, 23);
		panel.add(btnRole);
		
		/*Constructor*/
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("List Users Page");
		
	}
}
