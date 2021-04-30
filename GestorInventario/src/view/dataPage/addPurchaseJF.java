package view.dataPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Pet;
import beans.Purchase;
import model.Pets;
import model.Purchases;
import utils.GenerateFrame;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class addPurchaseJF extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDatePurchase;
	private JTextField textFieldTotalPrice;
	private JTextField textFieldIdUser;
	private JTextField textFieldIdPet;

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
	public addPurchaseJF() {
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
		
		JLabel lblAddPurchase = new JLabel("Add Purchase MODE");
		lblAddPurchase.setForeground(Color.DARK_GRAY);
		lblAddPurchase.setFont(new Font("Open Sans", Font.BOLD, 24));
		lblAddPurchase.setBounds(238, 11, 251, 20);
		panel.add(lblAddPurchase);
		
		textFieldDatePurchase = new JTextField();
		textFieldDatePurchase.setColumns(10);
		textFieldDatePurchase.setBounds(256, 203, 207, 20);
		panel.add(textFieldDatePurchase);
		
		textFieldTotalPrice = new JTextField();
		textFieldTotalPrice.setColumns(10);
		textFieldTotalPrice.setBounds(256, 252, 207, 20);
		panel.add(textFieldTotalPrice);
		
		JLabel lblIduser = new JLabel("ID USER");
		lblIduser.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblIduser.setBounds(271, 127, 57, 14);
		panel.add(lblIduser);
		
		JLabel lblIdPet = new JLabel("ID PET");
		lblIdPet.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblIdPet.setBounds(395, 127, 44, 14);
		panel.add(lblIdPet);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblDate.setBounds(339, 187, 44, 14);
		panel.add(lblDate);
		
		JLabel lblTotalPrice = new JLabel("TOTAL PRICE");
		lblTotalPrice.setFont(new Font("Open Sans", Font.BOLD, 13));
		lblTotalPrice.setBounds(313, 234, 81, 14);
		panel.add(lblTotalPrice);
		
		textFieldIdUser = new JTextField();
		textFieldIdUser.setColumns(10);
		textFieldIdUser.setBounds(256, 142, 86, 20);
		panel.add(textFieldIdUser);
		
		textFieldIdPet = new JTextField();
		textFieldIdPet.setColumns(10);
		textFieldIdPet.setBounds(377, 142, 86, 20);
		panel.add(textFieldIdPet);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.UK);
				//Info to Object Purchase
				Date datePurchase =  null;
				int idUser = Integer.parseInt(textFieldIdUser.getText());
				int idPet = Integer.parseInt(textFieldIdPet.getText());
				try {
					datePurchase = formatter.parse(textFieldDatePurchase.getText());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				double totalPrice = Double.parseDouble(textFieldTotalPrice.getText());
		
				Purchase purchase = new Purchase(idUser, idPet, datePurchase, totalPrice);
				new Purchases().addPurchase(purchase);
				
				new GenerateFrame().genSucAction();
			}
		});
		btnFinish.setForeground(Color.BLACK);
		btnFinish.setFont(new Font("Open Sans Semibold", Font.PLAIN, 14));
		btnFinish.setBounds(313, 312, 89, 23);
		panel.add(btnFinish);
	}
}
