package ui;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.SystemController;
import data.Book;
import data.CheckoutBooks;
import data.Member;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnBookUI extends JPanel {

    private JTable table;
    private JTextField textField;
    private JTextField textField_1;
    private JTable tblBookList;
    SystemController controller = SystemController.getInstance();
    private JTextField textField_2;
    private JTextField textField_3;
    
	/**
	 * Create the panel.
	 */
	public ReturnBookUI() {
		setLayout(null);

        JLabel lblNewLabel = new JLabel("Return Book");
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
        btnNewButton.setBounds(336, 207, 114, 27);
        add(btnNewButton);

        var books = controller.getCheckoutBooks();
        String[][] data = new String[books.size()][5];

        var i = 0;
        for (CheckoutBooks checkout : books) {
            data[i][0] = checkout.book.title;
            data[i][1] = checkout.book.ISBN;
            data[i][2] = checkout.book.author.toString();
            data[i][3] = String.valueOf(checkout.member.MemberId);
            data[i][4] = checkout.member.toString();

            i++;
        }
        String[] columnNames = {"Book Title", "ISBN", "Author", "Member ID", "Member Name"};
        tblBookList = new JTable(data, columnNames);
        tblBookList.setBounds(26, 243, 664, 173);

        add(tblBookList);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Member Name");
        lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
        lblNewLabel_1_1_1.setBounds(26, 159, 125, 32);
        add(lblNewLabel_1_1_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(169, 161, 150, 32);
        add(textField_2);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("Member ID");
        lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
        lblNewLabel_1_1_1_1.setBounds(26, 203, 125, 32);
        add(lblNewLabel_1_1_1_1);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(169, 205, 150, 32);
        add(textField_3);
        
        JButton btnReturnBook = new JButton("Return Book");
        btnReturnBook.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		var selectedRow = tblBookList.getSelectedRow();
                if(selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "Select a book from the table to return");
                    return;
                }
                controller.returnBook(selectedRow);
        	}
        });
        btnReturnBook.setBounds(498, 438, 194, 82);
        add(btnReturnBook);
	}
}
