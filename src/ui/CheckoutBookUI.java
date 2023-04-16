package ui;

import controller.SystemController;
import data.Book;
import data.Member;

import javax.swing.*;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckoutBookUI extends JPanel {

	private SystemController controller = SystemController.getInstance();
	
	/**
	 * Create the panel.
	 */
	public CheckoutBookUI() {
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
		cmbBookList.setBounds(6, 109, 544, 37);
		for(Book book: controller.getBooks()){
			cmbBookList.addItem(book.toString());
		}
		add(cmbBookList);

		JComboBox cmbMemberList = new JComboBox();
		cmbMemberList.setBounds(6, 180, 544, 37);
		for(Member member: controller.getMembers()){
			cmbMemberList.addItem(member.firstName);
		}
		add(cmbMemberList);

		JButton btnAddBook = new JButton("(+) Add Book");
		btnAddBook.setBounds(562, 109, 127, 29);
		add(btnAddBook);
		
		JButton btnCheckoutBook = new JButton("Checkout Book");
		btnCheckoutBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var result = controller.checkoutBook(controller.getBooks().get(cmbBookList.getSelectedIndex()), controller.getMembers().get(cmbMemberList.getSelectedIndex()));
				if(!result){
					JOptionPane.showMessageDialog(null, "No available copies of this book", "Not available", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnCheckoutBook.setBounds(475, 479, 218, 75);
		add(btnCheckoutBook);
		

		
		JButton btnAddA = new JButton("(+) Add Member");
		btnAddA.setBounds(562, 180, 130, 29);
		add(btnAddA);

	}
}
