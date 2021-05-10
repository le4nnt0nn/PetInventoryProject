package view.mainPage;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sounds.Sound;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class successfulAction extends JFrame {

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
	public successfulAction() {
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
	
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 204, 102));
		panel_1.setBounds(336, 11, 396, 365);
		panel.add(panel_1);
		panel_1.setLayout(null);
			
		/*Labels*/
		
		JLabel lblSucText = new JLabel("SUCCESSFUL ACTION");
		lblSucText.setForeground(Color.DARK_GRAY);
		lblSucText.setFont(new Font("Open Sans", Font.BOLD, 36));
		lblSucText.setBounds(18, 39, 368, 50);
		panel_1.add(lblSucText);
		
		JLabel lblSuccDesc = new JLabel("Action completed successfully");
		lblSuccDesc.setForeground(Color.WHITE);
		lblSuccDesc.setFont(new Font("Open Sans", Font.PLAIN, 14));
		lblSuccDesc.setBounds(105, 164, 209, 40);
		panel_1.add(lblSuccDesc);
		
		JLabel lblGIF = new JLabel("");
		lblGIF.setIcon(new ImageIcon(successfulAction.class.getResource("/images/doggieSuccAction.gif")));
		lblGIF.setBounds(34, 29, 402, 300);
		panel.add(lblGIF);
		
		
		/*Buttons and actions*/
		
		JButton btnOK = new JButton("OK");
		btnOK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnOK.setForeground(Color.BLACK);
		btnOK.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnOK.setBackground(Color.WHITE);
		btnOK.setBounds(145, 106, 118, 31);
		panel_1.add(btnOK);
		
		/*Constructor*/
		
		Sound sound = new Sound();
		sound.successfulLogin();
		this.show();
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("Successful Action !");
	}
}
