import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Final extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Final dialog = new Final();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Final() {
		setBounds(100, 100, 450, 408);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(" Title :");
			lblNewLabel.setBounds(27, 10, 57, 15);
			getContentPane().add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(96, 7, 334, 21);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uD560\uC77C");
			lblNewLabel_1.setBounds(27, 43, 57, 15);
			getContentPane().add(lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(96, 40, 334, 21);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_2.setBounds(27, 74, 57, 15);
			getContentPane().add(lblNewLabel_2);
		}
		{
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setBounds(96, 71, 334, 21);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("\uC124\uBA85");
			lblNewLabel_3.setBounds(27, 107, 57, 15);
			getContentPane().add(lblNewLabel_3);
		}
		{
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setBounds(96, 104, 334, 21);
			getContentPane().add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(27, 138, 57, 15);
			getContentPane().add(lblNewLabel_4);
		}
		{
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setBounds(96, 135, 116, 21);
			getContentPane().add(textField_4);
			textField_4.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(27, 169, 57, 15);
			getContentPane().add(lblNewLabel_5);
		}
		{
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setBounds(96, 166, 116, 21);
			getContentPane().add(textField_5);
			textField_5.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Day");
			lblNewLabel_6.setBounds(27, 200, 57, 15);
			getContentPane().add(lblNewLabel_6);
		}
		{
			textField_6 = new JTextField();
			textField_6.setEditable(false);
			textField_6.setColumns(10);
			textField_6.setBounds(96, 197, 116, 21);
			getContentPane().add(textField_6);
		}
		{
			JLabel lblDay = new JLabel("Week");
			lblDay.setBounds(27, 231, 57, 15);
			getContentPane().add(lblDay);
		}
		{
			textField_7 = new JTextField();
			textField_7.setEditable(false);
			textField_7.setColumns(10);
			textField_7.setBounds(96, 228, 116, 21);
			getContentPane().add(textField_7);
		}
		
		JLabel lblNewLabel_7 = new JLabel("\uC2DC\uAC04");
		lblNewLabel_7.setBounds(27, 256, 57, 15);
		getContentPane().add(lblNewLabel_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(96, 253, 116, 21);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\uB54C");
		lblNewLabel_8.setBounds(27, 281, 57, 15);
		getContentPane().add(lblNewLabel_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(96, 284, 116, 21);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
	}
}
