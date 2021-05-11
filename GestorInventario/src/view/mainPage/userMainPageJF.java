package view.mainPage;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.User;
import sounds.Sound;
import view.dataPage.listPets;
import view.dataPage.listPurchasesByUser;
import view.dataPage.listUsers;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class userMainPageJF extends JFrame {

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
	public userMainPageJF(User user) {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBounds(0, 0, 742, 83);
		panel.add(panel_1);
		
		/*Buttons and actions*/
		
		JButton btnPets = new JButton("");
		btnPets.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
				btnPets.setSize(128, 165);
			}
			public void mouseExited(MouseEvent e) {
				btnPets.setSize(128, 151);
			}
		});
		btnPets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Sound().enteredOption();
				new listPets();
			}
		});
		btnPets.setIcon(new ImageIcon(userMainPageJF.class.getResource("/images/buttonPetsRedo.png")));
		btnPets.setContentAreaFilled(false);
		btnPets.setBorder(BorderFactory.createEmptyBorder());
		btnPets.setBounds(66, 156, 128, 151);
		panel.add(btnPets);
		
		JButton btnPurchases = new JButton("");
		btnPurchases.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
				btnPurchases.setSize(128, 165);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPurchases.setSize(128, 151);
			}
		});
		btnPurchases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Sound().enteredOption();
				new listPurchasesByUser(user);
			}
		});
		btnPurchases.setIcon(new ImageIcon(userMainPageJF.class.getResource("/images/buttonPurchasesRedo.png")));
		btnPurchases.setContentAreaFilled(false);
		btnPurchases.setBorder(BorderFactory.createEmptyBorder());
		btnPurchases.setBounds(538, 156, 128, 151);
		panel.add(btnPurchases);
		
		
		/*Labels*/
		
		JLabel lblUserMode = new JLabel("USER MODE");
		lblUserMode.setForeground(Color.WHITE);
		lblUserMode.setFont(new Font("Open Sans", Font.BOLD, 36));
		lblUserMode.setBounds(264, 11, 222, 66);
		panel_1.add(lblUserMode);
		
		JPanel panel_right = new JPanel();
		panel_right.setBackground(new Color(152, 251, 152));
		panel_right.setBounds(538, 156, 128, 151);
		panel.add(panel_right);
		
		JPanel panel_left = new JPanel();
		panel_left.setBackground(new Color(152, 251, 152));
		panel_left.setBounds(66, 156, 128, 151);
		panel.add(panel_left);
		
		JLabel lblPets = new JLabel("Pets");
		lblPets.setForeground(Color.DARK_GRAY);
		lblPets.setFont(new Font("Open Sans Semibold", Font.PLAIN, 22));
		lblPets.setBounds(101, 124, 54, 21);
		panel.add(lblPets);
		
		JLabel lblPurchases = new JLabel("Purchases");
		lblPurchases.setForeground(Color.DARK_GRAY);
		lblPurchases.setFont(new Font("Open Sans Semibold", Font.PLAIN, 22));
		lblPurchases.setBounds(538, 124, 128, 21);
		panel.add(lblPurchases);
		
		JLabel lblGIF = new JLabel("");
		lblGIF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Sound().barkClicked();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
				lblGIF.setCursor(cursor);
			}
		});
		lblGIF.setIcon(new ImageIcon(userMainPageJF.class.getResource("/images/doggieUserPage.gif")));
		lblGIF.setBounds(237, 108, 271, 229);
		panel.add(lblGIF);
		
		
		/*Constructor*/
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("Main Page");
	}
}
