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

public class MagicAnimation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					//frame.setVisible(true);
					for(int i=0; i<=100; i++) {
						MagicAnimation frame = new MagicAnimation();
						Thread.sleep(40);
						if(i==100) {
							System.exit(0);
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MagicAnimation() {
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
		lblBird.setIcon(new ImageIcon(MagicAnimation.class.getResource("/loginPage/littleBird.gif")));
		lblBird.setBounds(240, 112, 343, 192);
		panel.add(lblBird);
		
		JLabel lblLoading = new JLabel("LOADING");
		lblLoading.setForeground(Color.DARK_GRAY);
		lblLoading.setFont(new Font("Open Sans", Font.BOLD, 36));
		lblLoading.setBounds(273, 45, 185, 28);
		panel.add(lblLoading);
	}
}
