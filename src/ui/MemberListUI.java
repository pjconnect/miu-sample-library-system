package ui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

public class MemberListUI extends JPanel {
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public MemberListUI() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("List of Members");
		lblNewLabel.setBounds(27, 24, 301, 22);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("+ Add Member");
		btnNewButton.setBackground(new Color(72, 61, 139));
		btnNewButton.setBounds(527, 18, 148, 40);
		add(btnNewButton);
					
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 79, 648, 415);
		add(scrollPane);
		
	
		String[][] data = {
	        { "00001", "John", "Doe", "098719823" },
	        { "00002", "Jane", "Doe", "879876872" },
	        { "00003", "Baby", "Doe", "984798344" },
        };
        String[] columnNames = { "Member ID", "First Name", "Last Name", "Phone #" };
		table = new JTable(data, columnNames);
		table.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		table.getTableHeader().setFont(new Font("Lucida Grande", Font.BOLD, 13));
		MatteBorder border = new MatteBorder(1, 1, 1, 1, Color.BLACK);
		table.setBorder(border);		
		table.setColumnSelectionAllowed(true);
		scrollPane.setViewportView(table);

	}
}
