package ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;

public class ReturnBookUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public ReturnBookUI() {
		setBackground(SystemColor.window);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select book to checkout");
		lblNewLabel.setBounds(17, 87, 178, 16);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Checkout");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(17, 6, 676, 37);
		add(lblNewLabel_1);
		
		JLabel lblLastName = new JLabel("Select a Member");
		lblLastName.setBounds(17, 158, 178, 16);
		add(lblLastName);
		
		JComboBox cmbBookList = new JComboBox();
		cmbBookList.setEditable(true);
		cmbBookList.setBounds(6, 109, 544, 37);
		add(cmbBookList);
		
		JButton btnAddBook = new JButton("(+) Add Book");
		btnAddBook.setBounds(562, 109, 127, 29);
		add(btnAddBook);
		
		JButton btnCheckoutBook = new JButton("Checkout Book");
		btnCheckoutBook.setBounds(475, 479, 218, 75);
		add(btnCheckoutBook);
		
		JComboBox cmbMemberList = new JComboBox();
		cmbMemberList.setEditable(true);
		cmbMemberList.setBounds(6, 180, 544, 37);
		add(cmbMemberList);
		
		JButton btnAddA = new JButton("(+) Add Member");
		btnAddA.setBounds(562, 180, 130, 29);
		add(btnAddA);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setBounds(433, 252, 117, 29);
		add(btnCheckout);

	}
}
