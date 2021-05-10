package view.mainPage;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sounds.Sound;
import view.dataPage.addPurchaseJF;
import view.dataPage.deletePurchase;
import view.dataPage.listPurchases;
import view.dataPage.updatePurchases;

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

public class purchasePage extends JFrame {

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
	public purchasePage() {
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
		lblGIF.setIcon(new ImageIcon(purchasePage.class.getResource("/images/doggie_purchasePage.gif")));
		lblGIF.setBounds(53, 77, 373, 258);
		panel.add(lblGIF);
		
		/*Buttons and actions*/
		
		JButton btnShow = new JButton("");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new listPurchases();
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
		btnShow.setIcon(new ImageIcon(purchasePage.class.getResource("/images/ShowSearchRedo.png")));
		btnShow.setContentAreaFilled(false);
		btnShow.setBorder(BorderFactory.createEmptyBorder());
		btnShow.setBounds(107, 276, 122, 100);
		panel_1.add(btnShow);
		
		JButton btnAddPurchase = new JButton("Add Purchase");
		btnAddPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new addPurchaseJF();
			}
		});
		btnAddPurchase.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnAddPurchase.setForeground(Color.BLACK);
		btnAddPurchase.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnAddPurchase.setBackground(Color.WHITE);
		btnAddPurchase.setBounds(41, 87, 241, 29);
		panel_1.add(btnAddPurchase);
		
		JButton btnUpdatePurchase = new JButton("Update Purchase");
		btnUpdatePurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new updatePurchases();
			}
		});
		btnUpdatePurchase.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnUpdatePurchase.setForeground(Color.BLACK);
		btnUpdatePurchase.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnUpdatePurchase.setBackground(Color.WHITE);
		btnUpdatePurchase.setBounds(41, 152, 241, 29);
		panel_1.add(btnUpdatePurchase);
		
		JButton btnDeletePurchase = new JButton("Delete Purchase");
		btnDeletePurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new deletePurchase();
			}
		});
		btnDeletePurchase.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				new Sound().button_sound();
			}
		});
		btnDeletePurchase.setForeground(Color.BLACK);
		btnDeletePurchase.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnDeletePurchase.setBackground(Color.WHITE);
		btnDeletePurchase.setBounds(41, 220, 241, 29);
		panel_1.add(btnDeletePurchase);
		
		/*Constructor*/
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\icon.png"); 
		this.setIconImage(icon);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setTitle("Purchase Page");
	}

}
