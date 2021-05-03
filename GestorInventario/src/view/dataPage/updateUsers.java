package view.dataPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.User;
import controller.Table;
import model.Users;
import sounds.Sound;
import utils.GenerateFrame;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class updateUsers extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
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
	public updateUsers() {
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
		
		JLabel lblUpdateUsersmode = new JLabel("Update Users MODE");
		lblUpdateUsersmode.setForeground(Color.DARK_GRAY);
		lblUpdateUsersmode.setFont(new Font("Open Sans", Font.BOLD, 24));
		lblUpdateUsersmode.setBounds(253, 11, 255, 38);
		panel.add(lblUpdateUsersmode);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(235, 60, 255, 20);
		panel.add(textField);
		
		JButton btnSearch = new JButton("Search");
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
				textField_7.setText(model2.getValueAt(selectedRowIndex, 6).toString());
				textField_8.setText(model2.getValueAt(selectedRowIndex, 7).toString());
				textField_9.setText(model2.getValueAt(selectedRowIndex, 8).toString());
			}
		});
		//Modelo
		String[] usersColumns = {"idUser","Username","Passwrod","Role","Name","Lastname","Address","Birth","Phone"};
		new Table().showTable(table, "SELECT * FROM users;",usersColumns);
		
		table.setBounds(10, 109, 509, 241);
		panel.add(table);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Info to Object User
				
				//User Zone
				int idUser = Integer.parseInt(textField_1.getText());
				String role = textField_2.getText();
				String username = textField_3.getText();
				String password = textField_4.getText();
				
				//Client Zone
				String name = textField_5.getText();
				String lastname = textField_6.getText();
				String address = textField_7.getText();
				String birth = textField_8.getText();
				int phone = Integer.parseInt(textField_9.getText());
				
				User user = new User(idUser,username,password,role,name,lastname,address,birth,phone);
				new Users().updateUser(user);
				
				new GenerateFrame().genSucAction();
				
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnUpdate.setBounds(589, 353, 89, 23);
		panel.add(btnUpdate);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(625, 93, 55, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(625, 124, 89, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(625, 152, 89, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(625, 178, 55, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(625, 206, 89, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(625, 234, 89, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(625, 261, 89, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(625, 290, 89, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(625, 321, 89, 20);
		panel.add(textField_9);
		
		JLabel lblIdUser = new JLabel("idUser");
		lblIdUser.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblIdUser.setBounds(566, 96, 46, 14);
		panel.add(lblIdUser);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblUsername.setBounds(566, 127, 60, 14);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblPassword.setBounds(566, 155, 55, 14);
		panel.add(lblPassword);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblRole.setBounds(566, 181, 46, 14);
		panel.add(lblRole);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblName.setBounds(566, 209, 46, 14);
		panel.add(lblName);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblLastname.setBounds(566, 237, 60, 14);
		panel.add(lblLastname);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblAddress.setBounds(566, 264, 46, 14);
		panel.add(lblAddress);
		
		JLabel lblBirth = new JLabel("Birth");
		lblBirth.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblBirth.setBounds(566, 293, 46, 14);
		panel.add(lblBirth);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Open Sans", Font.BOLD, 11));
		lblPhone.setBounds(566, 324, 46, 14);
		panel.add(lblPhone);
	}

}
