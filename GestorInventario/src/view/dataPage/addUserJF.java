package view.dataPage;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Pet;
import beans.User;
import model.Pets;
import model.Users;
import view.mainPage.successfulAction;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addUserJF extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldRole;
	private JTextField textFieldUsername;
	private JTextField textFieldPassw;
	private JTextField textFieldName;
	private JTextField textFieldLastName;
	private JTextField textFieldAddress;
	private JTextField textFieldBirth;
	private JTextField textFieldPhone;

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
	public addUserJF() {
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
		
		/*Labels*/
		
		JLabel lblAddUser = new JLabel("Add User MODE");
		lblAddUser.setForeground(Color.DARK_GRAY);
		lblAddUser.setFont(new Font("Open Sans", Font.BOLD, 24));
		lblAddUser.setBounds(271, 11, 208, 20);
		panel.add(lblAddUser);
		
		JLabel lblUserZone = new JLabel("USER ZONE");
		lblUserZone.setForeground(new Color(0, 100, 0));
		lblUserZone.setFont(new Font("Open Sans", Font.BOLD, 16));
		lblUserZone.setBounds(312, 55, 96, 14);
		panel.add(lblUserZone);
		
		JLabel lblClientZone = new JLabel("CLIENT ZONE");
		lblClientZone.setForeground(new Color(0, 100, 0));
		lblClientZone.setFont(new Font("Open Sans", Font.BOLD, 16));
		lblClientZone.setBounds(312, 172, 103, 14);
		panel.add(lblClientZone);
		
		JLabel lblRole = new JLabel("ROLE");
		lblRole.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblRole.setBounds(338, 80, 38, 14);
		panel.add(lblRole);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblUsername.setBounds(250, 126, 77, 14);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblPassword.setBounds(402, 126, 77, 14);
		panel.add(lblPassword);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblName.setBounds(250, 191, 45, 14);
		panel.add(lblName);
		
		JLabel lblLastname = new JLabel("LASTNAME");
		lblLastname.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblLastname.setBounds(405, 191, 74, 14);
		panel.add(lblLastname);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblAddress.setBounds(250, 237, 68, 14);
		panel.add(lblAddress);
		
		JLabel lblBirth = new JLabel("BIRTH");
		lblBirth.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblBirth.setBounds(422, 238, 45, 14);
		panel.add(lblBirth);
		
		JLabel lblPhone = new JLabel("PHONE");
		lblPhone.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblPhone.setBounds(338, 283, 53, 14);
		panel.add(lblPhone);
		
		
		/*TextFields*/
		
		textFieldRole = new JTextField();
		textFieldRole.setColumns(10);
		textFieldRole.setBounds(311, 95, 86, 20);
		panel.add(textFieldRole);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(217, 141, 124, 20);
		panel.add(textFieldUsername);
		
		textFieldPassw = new JTextField();
		textFieldPassw.setColumns(10);
		textFieldPassw.setBounds(381, 141, 124, 20);
		panel.add(textFieldPassw);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(217, 207, 124, 20);
		panel.add(textFieldName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(381, 207, 124, 20);
		panel.add(textFieldLastName);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(217, 252, 124, 20);
		panel.add(textFieldAddress);
		
		textFieldBirth = new JTextField();
		textFieldBirth.setColumns(10);
		textFieldBirth.setBounds(381, 252, 124, 20);
		panel.add(textFieldBirth);
			
		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(294, 299, 124, 20);
		panel.add(textFieldPhone);
		
		/*Buttons and actions*/
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.setBackground(Color.WHITE);
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*Info to user Object*/
				
				/*User zone*/
				String role = textFieldRole.getText();
				String username = textFieldUsername.getText();
				String password = textFieldPassw.getText();
				
				/*Client zone*/
				String name = textFieldName.getText();
				String lastname = textFieldLastName.getText();
				String address = textFieldAddress.getText();
				String birth = textFieldBirth.getText();
				int phone = Integer.parseInt(textFieldPhone.getText());
				
				User user = new User(username,password,role,name,lastname,address,birth,phone);
				new Users().addUser(user);
				
				new successfulAction();
				
			}
		});
		btnFinish.setForeground(Color.BLACK);
		btnFinish.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnFinish.setBounds(312, 342, 89, 23);
		panel.add(btnFinish);
		
		/*Constructor*/
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("Add User Page");
	}

}
