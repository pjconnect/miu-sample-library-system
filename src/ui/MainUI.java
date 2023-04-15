package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class MainUI extends JFrame {

	private JPanel contentPane;
	private JPanel loader;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 620);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		panel.setBounds(6, 6, 285, 580);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		loader = new JPanel();
		loader.setBackground(UIManager.getColor("Button.disabledText"));
		loader.setBounds(303, 6, 691, 580);
		contentPane.add(loader);
		loader.setLayout(new BoxLayout(loader, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("James - Librarian  ");
		lblNewLabel.setForeground(UIManager.getColor("CheckBox.background"));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblNewLabel);
		
		JButton btnNewMember = new JButton("Add new member");
		btnNewMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadUI(new AddMemberUI());
			}
		});
		btnNewMember.setBackground(UIManager.getColor("CheckBox.background"));
		btnNewMember.setOpaque(true);
		panel.add(btnNewMember);
		
		JButton btnExistingMember = new JButton("Edit existing member");
		btnExistingMember.setBackground(UIManager.getColor("CheckBox.background"));
		btnExistingMember.setBorderPainted(false);
		btnExistingMember.setOpaque(true);
		panel.add(btnExistingMember);
		
		JButton btnViewAllMembers = new JButton("View All Members");
		btnViewAllMembers.setBackground(UIManager.getColor("CheckBox.background"));
		btnViewAllMembers.setBorderPainted(false);
		btnViewAllMembers.setOpaque(true);
		panel.add(btnViewAllMembers);
		
		JButton btnAddNewAuthor = new JButton("Add New Author");
		btnAddNewAuthor.setBackground(UIManager.getColor("CheckBox.background"));
		btnAddNewAuthor.setBorderPainted(false);
		btnAddNewAuthor.setOpaque(true);
		panel.add(btnAddNewAuthor);
		
		JButton btnNewBook = new JButton("Add New Book");
		btnNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadUI(new AddBookUI());
			}
		});
		btnNewBook.setBackground(UIManager.getColor("CheckBox.background"));
		btnNewBook.setBorderPainted(false);
		btnNewBook.setOpaque(true);
		panel.add(btnNewBook);
		
		JButton btnAllBooks = new JButton("All Books");
		btnAllBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadUI(new AllBooksList());
			}
		});
		btnAllBooks.setBackground(UIManager.getColor("CheckBox.background"));
		btnAllBooks.setBorderPainted(false);
		btnAllBooks.setOpaque(true);
		panel.add(btnAllBooks);
		
		JButton btnCheckoutBook = new JButton("Checkout Book");
		btnCheckoutBook.setBackground(UIManager.getColor("CheckBox.background"));
		btnCheckoutBook.setBorderPainted(false);
		btnCheckoutBook.setOpaque(true);
		panel.add(btnCheckoutBook);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.setBackground(UIManager.getColor("CheckBox.background"));
		btnReturnBook.setBorderPainted(false);
		btnReturnBook.setOpaque(true);
		panel.add(btnReturnBook);
		
		JButton btnViewCheckouts = new JButton("View Checkouts");
		btnViewCheckouts.setBackground(UIManager.getColor("CheckBox.background"));
		btnViewCheckouts.setBorderPainted(false);
		btnViewCheckouts.setOpaque(true);
		panel.add(btnViewCheckouts);
		
		JButton btnUpdateBookCopy = new JButton("Update Book Copy");
		btnUpdateBookCopy.setBackground(UIManager.getColor("CheckBox.background"));
		btnUpdateBookCopy.setBorderPainted(false);
		btnUpdateBookCopy.setOpaque(true);
		panel.add(btnUpdateBookCopy);
		
	}
	
	
	private void LoadUI(JPanel panel) {
		loader.removeAll();
		loader.add(panel);
		loader.revalidate();
		
	}
	
}
