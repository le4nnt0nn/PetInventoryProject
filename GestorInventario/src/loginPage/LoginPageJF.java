package loginPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPageJF extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPageJF frame = new LoginPageJF();
					Image icon = Toolkit.getDefaultToolkit().getImage("\\icon.png"); 
					frame.setIconImage(icon);
					frame.getContentPane().setLayout(null);
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
	public LoginPageJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Open Sans", Font.BOLD, 36));
		lblLogin.setBounds(113, 39, 275, 66);
		panel.add(lblLogin);
		
		JLabel lblGIF = new JLabel("");
		lblGIF.setIcon(new ImageIcon(LoginPageJF.class.getResource("/loginPage/GIF_EddieCoghlan.gif")));
		lblGIF.setBounds(0, 0, 363, 387);
		panel.add(lblGIF);
		
		JLabel lblSignIn = new JLabel("Sign In");
		lblSignIn.setForeground(Color.DARK_GRAY);
		lblSignIn.setFont(new Font("Open Sans", Font.BOLD, 36));
		lblSignIn.setBounds(495, 39, 275, 66);
		panel.add(lblSignIn);
		
		usernameField = new JTextField();
		usernameField.setBounds(473, 149, 186, 26);
		panel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(473, 228, 186, 26);
		panel.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Open Sans", Font.PLAIN, 13));
		lblUsername.setBounds(529, 124, 83, 14);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Open Sans", Font.PLAIN, 13));
		lblPassword.setBounds(529, 203, 83, 14);
		panel.add(lblPassword);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					//open connection
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gi_project?useLegacyDatetimeCode=false&serverTimezone=UTC","root","manolo");
					
					String username = usernameField.getText();
					String password = passwordField.getText();
					
					Statement stm = con.createStatement();
					//consulta mysql para poder iniciar
					String sql = "select * from logins where username='"+username+"' and password='"+password+"'";
					ResultSet rs = stm.executeQuery(sql);
					
					if(rs.next()) {
						dispose();
						
						passwordField.setText(null);
						usernameField.setText(null);
					}else {
						JOptionPane.showMessageDialog(null, "Detalles de logueo invalidos","Error de logueo",JOptionPane.ERROR_MESSAGE);
						passwordField.setText(null);
						usernameField.setText(null);
					}
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		});
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setForeground(Color.BLACK);
		btnSignUp.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnSignUp.setBounds(523, 310, 89, 31);
		panel.add(btnSignUp);
		
		JCheckBox chckbxShowPssw = new JCheckBox("Show Password");
		chckbxShowPssw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(chckbxShowPssw.isSelected()) {
					passwordField.setEchoChar((char)0);
				} else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxShowPssw.setFont(new Font("Open Sans Light", Font.PLAIN, 11));
		chckbxShowPssw.setBounds(473, 261, 101, 23);
		panel.add(chckbxShowPssw);
	}
}
