package ui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class AddMemberUI extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public AddMemberUI() {
		setBackground(SystemColor.window);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 109, 687, 37);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(17, 87, 91, 16);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Add New Member");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(17, 6, 676, 37);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(6, 180, 687, 37);
		add(textField_1);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(17, 158, 91, 16);
		add(lblLastName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(17, 229, 234, 16);
		add(lblPhoneNumber);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(6, 251, 687, 37);
		add(textField_2);
		
		JLabel lblPhoneNumber_1 = new JLabel("Phone Number");
		lblPhoneNumber_1.setBounds(17, 307, 234, 16);
		add(lblPhoneNumber_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(6, 335, 554, 27);
		add(comboBox);
		
		JButton btnNewButton = new JButton("New Address");
		btnNewButton.setBounds(572, 334, 117, 29);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Member");
		btnNewButton_1.setBounds(475, 479, 218, 75);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(105, 386, 61, 16);
		add(lblNewLabel_2);

	}
}
