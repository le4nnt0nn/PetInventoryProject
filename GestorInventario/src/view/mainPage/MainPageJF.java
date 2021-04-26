package view.mainPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JLabel lblAdminMode = new JLabel("ADMIN MODE");
		lblAdminMode.setForeground(Color.WHITE);
		lblAdminMode.setFont(new Font("Open Sans", Font.BOLD, 36));
		lblAdminMode.setBounds(248, 11, 275, 66);
		panel_1.add(lblAdminMode);
		
		JButton btnPets = new JButton("");
		btnPets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPets.setIcon(new ImageIcon(MainPageJF.class.getResource("/images/buttonPetsRedo.png")));
		btnPets.setBounds(66, 156, 128, 151);
		btnPets.setBorder(BorderFactory.createEmptyBorder());
		btnPets.setContentAreaFilled(false);
		panel.add(btnPets);
		
		JButton btnClients = new JButton("");
		btnClients.setIcon(new ImageIcon(MainPageJF.class.getResource("/images/ButtonClientsRedo.png")));
		btnClients.setContentAreaFilled(false);
		btnClients.setBorder(BorderFactory.createEmptyBorder());
		btnClients.setBounds(301, 156, 128, 151);
		panel.add(btnClients);
		
		JButton btnPurchases = new JButton("");
		btnPurchases.setIcon(new ImageIcon(MainPageJF.class.getResource("/images/buttonPurchasesRedo.png")));
		btnPurchases.setContentAreaFilled(false);
		btnPurchases.setBorder(BorderFactory.createEmptyBorder());
		btnPurchases.setBounds(538, 156, 128, 151);
		panel.add(btnPurchases);
	}
}
