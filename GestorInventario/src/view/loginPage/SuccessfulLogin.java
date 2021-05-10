package view.loginPage;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sounds.Sound;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SuccessfulLogin extends JFrame {

	private JPanel contentPane;

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
	public SuccessfulLogin() {
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
		
		/*Labels*/
		
		JLabel lblBird = new JLabel("");
		lblBird.setIcon(new ImageIcon(SuccessfulLogin.class.getResource("/images/littleBird.gif")));
		lblBird.setBounds(240, 151, 343, 192);
		panel.add(lblBird);
		
		JLabel lblSucessful = new JLabel("SUCCESSFUL LOGIN");
		lblSucessful.setForeground(Color.DARK_GRAY);
		lblSucessful.setFont(new Font("Open Sans", Font.BOLD, 36));
		lblSucessful.setBounds(193, 46, 390, 28);
		panel.add(lblSucessful);
			
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(0, 0, 742, 192);
		panel.add(panel_1);
				
		JButton btnContinue = new JButton("Continue");
				
		/*Buttons and actions*/
		
		btnContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					dispose();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnContinue.setForeground(Color.BLACK);
		btnContinue.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnContinue.setBackground(Color.WHITE);
		btnContinue.setBounds(308, 109, 118, 31);
		panel.add(btnContinue);
		
		/*Constructor*/
		
		Sound sound = new Sound();
		sound.successfulLogin();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.show();
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("Succesful Login !");
		
	}
}
