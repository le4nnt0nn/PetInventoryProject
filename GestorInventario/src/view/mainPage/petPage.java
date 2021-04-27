package view.mainPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sounds.Sound;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class petPage extends JFrame {

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
	public petPage() {
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
		
		JLabel lblGIF = new JLabel("");
		lblGIF.setIcon(new ImageIcon(petPage.class.getResource("/images/doggie_petPage.gif")));
		lblGIF.setBounds(21, 59, 373, 258);
		panel.add(lblGIF);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(416, 0, 326, 387);
		panel.add(panel_1);
		
		JButton btnShow = new JButton("");
		btnShow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Sound sound = new Sound();
				sound.button_sound();
				btnShow.setSize(122, 90);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnShow.setSize(122, 100);
			}
		});
		btnShow.setIcon(new ImageIcon(petPage.class.getResource("/images/ShowSearchRedo.png")));
		btnShow.setBounds(107, 276, 122, 100);
		btnShow.setContentAreaFilled(false);
		btnShow.setBorder(BorderFactory.createEmptyBorder());
		panel_1.add(btnShow);
		
		JButton btnAddPet = new JButton("Add Pet");
		btnAddPet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Sound sound = new Sound();
				sound.button_sound();
			}
		});
		btnAddPet.setForeground(Color.BLACK);
		btnAddPet.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnAddPet.setBackground(Color.WHITE);
		btnAddPet.setBounds(41, 87, 241, 29);
		panel_1.add(btnAddPet);
		
		JButton btnUpdatePet = new JButton("Update Pet");
		btnUpdatePet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Sound sound = new Sound();
				sound.button_sound();
			}
		});
		btnUpdatePet.setForeground(Color.BLACK);
		btnUpdatePet.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnUpdatePet.setBackground(Color.WHITE);
		btnUpdatePet.setBounds(41, 152, 241, 29);
		panel_1.add(btnUpdatePet);
		
		JButton btnDeletePet = new JButton("Delete Pet");
		btnDeletePet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Sound sound = new Sound();
				sound.button_sound();
			}
		});
		btnDeletePet.setForeground(Color.BLACK);
		btnDeletePet.setFont(new Font("Open Sans Semibold", Font.BOLD, 14));
		btnDeletePet.setBackground(Color.WHITE);
		btnDeletePet.setBounds(41, 220, 241, 29);
		panel_1.add(btnDeletePet);
	}
}