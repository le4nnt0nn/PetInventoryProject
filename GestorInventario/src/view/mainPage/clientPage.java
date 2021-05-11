package view.mainPage;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sounds.Sound;
import view.dataPage.addPurchaseJF;
import view.dataPage.addUserJF;
import view.dataPage.deleteUser;
import view.dataPage.listUsers;
import view.dataPage.updateUsers;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class clientPage extends JFrame {

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
	public clientPage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 758, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 742, 387);
		contentPane.add(contentPane_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(144, 238, 144));
		panel.setBounds(0, 0, 742, 387);
		contentPane_1.add(panel);
			
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(416, 0, 326, 387);
		panel.add(panel_1);
		
		/*Labels*/
		
		JLabel lblGIF = new JLabel("");
		lblGIF.setIcon(new ImageIcon(clientPage.class.getResource("/images/doggie_clientPage.gif")));
		lblGIF.setBounds(23, 72, 373, 258);
		panel.add(lblGIF);
		
		
		/*Buttons and actions*/
		
		JButton btnShow = new JButton("");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new listUsers();
			}
		});
		btnShow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
				btnShow.setSize(122, 90);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnShow.setSize(122, 100);
			}
		});
		btnShow.setIcon(new ImageIcon(clientPage.class.getResource("/images/ShowSearchRedo.png")));
		btnShow.setContentAreaFilled(false);
		btnShow.setBorder(BorderFactory.createEmptyBorder());
		btnShow.setBounds(107, 276, 122, 100);
		panel_1.add(btnShow);
		
		JButton btnAddClient = new JButton("Add Client");
		btnAddClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new addUserJF();
			}
		});
		btnAddClient.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnAddClient.setForeground(Color.BLACK);
		btnAddClient.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnAddClient.setBackground(Color.WHITE);
		btnAddClient.setBounds(41, 87, 241, 29);
		panel_1.add(btnAddClient);
		
		JButton btnUpdateClient = new JButton("Update Client");
		btnUpdateClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new updateUsers();
			}
		});
		btnUpdateClient.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnUpdateClient.setForeground(Color.BLACK);
		btnUpdateClient.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnUpdateClient.setBackground(Color.WHITE);
		btnUpdateClient.setBounds(41, 152, 241, 29);
		panel_1.add(btnUpdateClient);
		
		JButton btnDeleteClient = new JButton("Delete Client");
		btnDeleteClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new deleteUser();
			}
		});
		btnDeleteClient.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnDeleteClient.setForeground(Color.BLACK);
		btnDeleteClient.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnDeleteClient.setBackground(Color.WHITE);
		btnDeleteClient.setBounds(41, 220, 241, 29);
		panel_1.add(btnDeleteClient);
		
		/*Constructor*/
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("Client Page");
	}

}
