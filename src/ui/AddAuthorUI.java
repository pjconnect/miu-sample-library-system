package ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class AddAuthorUI extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public AddAuthorUI() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(27, 79, 126, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Add Author");
		lblNewLabel.setBounds(27, 24, 99, 22);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setBounds(27, 159, 126, 16);
		add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(27, 107, 284, 40);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(27, 181, 284, 40);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("+ Add Author");
		btnNewButton.setBackground(new Color(72, 61, 139));
		btnNewButton.setBounds(27, 236, 148, 40);
		add(btnNewButton);

	}
}
