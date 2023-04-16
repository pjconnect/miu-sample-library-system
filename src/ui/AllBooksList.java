package ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AllBooksList extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTable jtblBookList;
	private JTable tblBookList;

	/**
	 * Create the panel.
	 */
	public AllBooksList() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(26, 10, 125, 32);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Id :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.BOLD, 17));
		lblNewLabel_1.setBounds(26, 71, 108, 32);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(138, 71, 150, 29);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("ISBN :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Lucida Bright", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(26, 113, 108, 32);
		add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 117, 150, 32);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(317, 122, 114, 27);
		add(btnNewButton); 
		
		String[][] data = {
		        { "10001", "Software", "CSE0999", "Joe", "12"}
	        };
	        String[] columnNames = { "Book ID", "Title", "ISBN","Authors", "Availability" };
	        tblBookList = new JTable(data,columnNames); 
		tblBookList.setBounds(26, 207, 664, 277);
		
		
		add(tblBookList);

	}
}
