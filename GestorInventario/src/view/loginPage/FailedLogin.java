package view.loginPage;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sounds.Sound;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FailedLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FailedLogin frame = new FailedLogin();
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
	public FailedLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 99, 71));
		panel.setBounds(0, 0, 742, 387);
		contentPane.add(panel);
		panel.setLayout(null);
		
		/*Labels*/
		
		JLabel lblFailedLogin = new JLabel("FAILED LOGIN");
		lblFailedLogin.setForeground(Color.DARK_GRAY);
		lblFailedLogin.setFont(new Font("Open Sans", Font.BOLD, 36));
		lblFailedLogin.setBounds(466, 52, 266, 28);
		panel.add(lblFailedLogin);
		
		JLabel lblDog = new JLabel("");
		lblDog.setIcon(new ImageIcon(FailedLogin.class.getResource("/images/failed.gif")));
		lblDog.setBounds(10, 11, 426, 365);
		panel.add(lblDog);
		
		JLabel lblErrorDesc = new JLabel("Error: Invalid login data");
		lblErrorDesc.setForeground(new Color(255, 255, 255));
		lblErrorDesc.setFont(new Font("Open Sans", Font.PLAIN, 14));
		lblErrorDesc.setBounds(506, 200, 171, 40);
		panel.add(lblErrorDesc);
	
		/*Buttons and actions*/
		
		JButton btnRetry = new JButton("Retry");
		btnRetry.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnRetry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnRetry.setForeground(Color.BLACK);
		btnRetry.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnRetry.setBackground(Color.WHITE);
		btnRetry.setBounds(525, 112, 118, 31);
		panel.add(btnRetry);
		
		/*Constructor*/
		
		Sound sound = new Sound();
		sound.fail_login();
		this.show();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("Failed Login ...");
		
	}
}
