package loginPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SucessfulLogin extends JFrame {

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
	public SucessfulLogin() {
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
		
		JLabel lblBird = new JLabel("");
		lblBird.setIcon(new ImageIcon(SucessfulLogin.class.getResource("/loginPage/littleBird.gif")));
		lblBird.setBounds(240, 112, 343, 192);
		panel.add(lblBird);
		
		JLabel lblSucessful = new JLabel("SUCCESSFUL LOGIN");
		lblSucessful.setForeground(Color.DARK_GRAY);
		lblSucessful.setFont(new Font("Open Sans", Font.BOLD, 36));
		lblSucessful.setBounds(193, 46, 390, 28);
		panel.add(lblSucessful);
		
		JButton btnContinue = new JButton("Continue");
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
		btnContinue.setBounds(308, 85, 118, 31);
		panel.add(btnContinue);
	}
}
