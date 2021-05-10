package view.mainPage;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import sounds.Sound;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainPageJF extends JFrame {

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
	public MainPageJF() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 742, 83);
		panel_1.setBackground(new Color(60, 179, 113));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
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
				new petPage();
			}
		});
		
		
		JButton btnClients = new JButton("");
		btnClients.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
				btnClients.setSize(128, 165);
			}
			public void mouseExited(MouseEvent e) {
				btnClients.setSize(128, 151);
			}
		});
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Sound().enteredOption();
				new clientPage();
			}
		});
		btnClients.setIcon(new ImageIcon(MainPageJF.class.getResource("/images/ButtonClientsRedo.png")));
		btnClients.setContentAreaFilled(false);
		btnClients.setBorder(BorderFactory.createEmptyBorder());
		btnClients.setBounds(301, 156, 128, 151);
		panel.add(btnClients);
		btnPets.setIcon(new ImageIcon(MainPageJF.class.getResource("/images/buttonPetsRedo.png")));
		btnPets.setBounds(66, 156, 128, 151);
		btnPets.setBorder(BorderFactory.createEmptyBorder());
		btnPets.setContentAreaFilled(false);
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
				new purchasePage();
			}
		});
		btnPurchases.setIcon(new ImageIcon(MainPageJF.class.getResource("/images/buttonPurchasesRedo.png")));
		btnPurchases.setContentAreaFilled(false);
		btnPurchases.setBorder(BorderFactory.createEmptyBorder());
		btnPurchases.setBounds(538, 156, 128, 151);
		panel.add(btnPurchases);
		
		/*Labels*/
		
		JPanel panel_right = new JPanel();
		panel_right.setBackground(new Color(152, 251, 152));
		panel_right.setBounds(538, 156, 128, 151);
		panel.add(panel_right);
		
		JPanel panel_left = new JPanel();
		panel_left.setBackground(new Color(152, 251, 152));
		panel_left.setBounds(66, 156, 128, 151);
		panel.add(panel_left);
		
		JPanel panel_center = new JPanel();
		panel_center.setBackground(new Color(152, 251, 152));
		panel_center.setBounds(301, 156, 128, 151);
		panel.add(panel_center);
		
		JLabel lblAdminMode = new JLabel("ADMIN MODE");
		lblAdminMode.setForeground(Color.WHITE);
		lblAdminMode.setFont(new Font("Open Sans", Font.BOLD, 36));
		lblAdminMode.setBounds(248, 11, 275, 66);
		panel_1.add(lblAdminMode);
		
		JLabel lblPets = new JLabel("Pets");
		lblPets.setForeground(Color.DARK_GRAY);
		lblPets.setFont(new Font("Open Sans Semibold", Font.PLAIN, 22));
		lblPets.setBounds(101, 124, 54, 21);
		panel.add(lblPets);
		
		JLabel lblClients = new JLabel("Clients");
		lblClients.setForeground(Color.DARK_GRAY);
		lblClients.setFont(new Font("Open Sans Semibold", Font.PLAIN, 22));
		lblClients.setBounds(328, 124, 73, 21);
		panel.add(lblClients);
		
		JLabel lblPurchases = new JLabel("Purchases");
		lblPurchases.setForeground(Color.DARK_GRAY);
		lblPurchases.setFont(new Font("Open Sans Semibold", Font.PLAIN, 22));
		lblPurchases.setBounds(538, 124, 128, 21);
		panel.add(lblPurchases);
		
		/*Constructor*/
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("Main Page");
		
		
	}
}
