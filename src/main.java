import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class main {

	private JFrame frame;
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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;

	// insert
	// yiss92
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;

	// update
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	
	// yiss92
	Today today = null;
	DayDao daydao = null;

	String comboModel = "";
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	//private JTextField textField_51;
	
	//title
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	// yiss92
	public void insert(String temp, String temp1) {
		// System.out.println("insert");
		// insert

		// yiss92
		today = new Today();
		daydao = new DayDao();
		JDialog dialog = new JDialog();
		if (daydao.select(temp, temp1) != null) {
			update(temp, temp1);
			dialog.setVisible(false);
			dialog.dispose();
			// System.exit(0);
			// dialog.exit(0);
			System.out.println("close dialog");
		} else {
			dialog.setVisible(true);
		}

		dialog.setBounds(100, 100, 450, 408);
		dialog.getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(" Title :");
			lblNewLabel.setBounds(27, 10, 57, 15);
			dialog.getContentPane().add(lblNewLabel);
		}
		{
			textField_25 = new JTextField();
			textField_25.setBounds(96, 7, 334, 21);
			dialog.getContentPane().add(textField_25);
			textField_25.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uD560\uC77C");
			lblNewLabel_1.setBounds(27, 43, 57, 15);
			dialog.getContentPane().add(lblNewLabel_1);
		}
		{
			textField_26 = new JTextField();
			textField_26.setBounds(96, 40, 334, 21);
			dialog.getContentPane().add(textField_26);
			textField_26.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_2.setBounds(27, 74, 57, 15);
			dialog.getContentPane().add(lblNewLabel_2);
		}
		{
			textField_27 = new JTextField();
			textField_27.setBounds(96, 71, 334, 21);
			dialog.getContentPane().add(textField_27);
			textField_27.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("\uC124\uBA85");
			lblNewLabel_3.setBounds(27, 107, 57, 15);
			dialog.getContentPane().add(lblNewLabel_3);
		}
		{
			textField_28 = new JTextField();
			textField_28.setBounds(96, 104, 334, 21);
			dialog.getContentPane().add(textField_28);
			textField_28.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(27, 138, 57, 15);
			dialog.getContentPane().add(lblNewLabel_4);
		}
		{
			textField_29 = new JTextField();
			textField_29.setBounds(96, 135, 116, 21);
			dialog.getContentPane().add(textField_29);
			textField_29.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(27, 169, 57, 15);
			dialog.getContentPane().add(lblNewLabel_5);
		}
		{
			textField_30 = new JTextField();
			textField_30.setBounds(96, 166, 116, 21);
			dialog.getContentPane().add(textField_30);
			textField_30.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Day");
			lblNewLabel_6.setBounds(27, 200, 57, 15);
			dialog.getContentPane().add(lblNewLabel_6);
		}
		{
			textField_31 = new JTextField();
			textField_31.setColumns(10);
			textField_31.setBounds(96, 197, 116, 21);
			dialog.getContentPane().add(textField_31);
		}
		{
			JLabel lblDay = new JLabel("Week");
			lblDay.setBounds(27, 231, 57, 15);
			dialog.getContentPane().add(lblDay);
		}
		{
			textField_32 = new JTextField();
			textField_32.setColumns(10);
			textField_32.setBounds(96, 228, 116, 21);
			dialog.getContentPane().add(textField_32);
		}
		{
			JButton btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// System.out.println("test");
					today.setTitle(textField_25.getText());
					today.setToDo(textField_26.getText());
					today.setLocation(textField_27.getText());
					today.setDescribed(textField_28.getText());
					today.setYear(textField_29.getText());
					today.setMonth(textField_30.getText());
					today.setDay(textField_31.getText());
					today.setWeek(textField_32.getText());
					today.setHours(temp);
					today.setEither(temp1);
					daydao.insert(today);
					// today = daydao.selectToday();
					// today = daydao.insert(today);
					// insert close
					dialog.setVisible(false);
					dialog.dispose();
				}
			});
			btnNewButton.setBounds(78, 322, 99, 25);
			dialog.getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dialog.setVisible(false);
					dialog.dispose();
					// dialog.EXIT_ON_CLOSE;
				}
			});
			btnNewButton_1.setBounds(287, 322, 99, 25);
			dialog.getContentPane().add(btnNewButton_1);
		}

		// dialog.setVisible(true);
		// yiss92

		// today.setTitle(textField_25.getText());
		// today.setToDo(textField_26.getText());
		// today.setLocation(textField_27.getText());
		// today.setDescribed(textField_28.getText());
		// today.setYear(textField_29.getText());
		// today.setMonth(textField_30.getText());
		// today.setWeek(textField_31.getText());
		// today.setDay(textField_32.getText());
		// today.setHours(temp);
		// today.setEither(temp1);
		// textField.setText("test");

	}

	public void update(String temp, String temp1) {
		JDialog dialog = new JDialog();
		System.out.println("update");
		// yiss92 ComboBox mode to String;

		dialog.setBounds(100, 100, 450, 408);
		dialog.getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(" Title :");
			lblNewLabel.setBounds(27, 10, 57, 15);
			dialog.getContentPane().add(lblNewLabel);
		}
		{
			textField_33 = new JTextField();
			textField_33.setBounds(96, 7, 334, 21);
			dialog.getContentPane().add(textField_33);
			textField_33.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uD560\uC77C");
			lblNewLabel_1.setBounds(27, 43, 57, 15);
			dialog.getContentPane().add(lblNewLabel_1);
		}
		{
			textField_34 = new JTextField();
			textField_34.setBounds(96, 40, 334, 21);
			dialog.getContentPane().add(textField_34);
			textField_34.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_2.setBounds(27, 74, 57, 15);
			dialog.getContentPane().add(lblNewLabel_2);
		}
		{
			textField_35 = new JTextField();
			textField_35.setBounds(96, 71, 334, 21);
			dialog.getContentPane().add(textField_35);
			textField_35.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("\uC124\uBA85");
			lblNewLabel_3.setBounds(27, 107, 57, 15);
			dialog.getContentPane().add(lblNewLabel_3);
		}
		{
			textField_36 = new JTextField();
			textField_36.setBounds(96, 104, 334, 21);
			dialog.getContentPane().add(textField_36);
			textField_36.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(27, 138, 57, 15);
			dialog.getContentPane().add(lblNewLabel_4);
		}
		{
			textField_37 = new JTextField();
			textField_37.setBounds(96, 135, 116, 21);
			dialog.getContentPane().add(textField_37);
			textField_37.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(27, 169, 57, 15);
			dialog.getContentPane().add(lblNewLabel_5);
		}
		{
			textField_38 = new JTextField();
			textField_38.setBounds(96, 166, 116, 21);
			dialog.getContentPane().add(textField_38);
			textField_38.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Week");
			lblNewLabel_6.setBounds(27, 200, 57, 15);
			dialog.getContentPane().add(lblNewLabel_6);
		}
		{
			textField_39 = new JTextField();
			textField_39.setColumns(10);
			textField_39.setBounds(96, 197, 116, 21);
			dialog.getContentPane().add(textField_39);
		}
		{
			JLabel lblDay = new JLabel("Day");
			lblDay.setBounds(27, 231, 57, 15);
			dialog.getContentPane().add(lblDay);
		}
		{
			textField_40 = new JTextField();
			textField_40.setColumns(10);
			textField_40.setBounds(96, 228, 116, 21);
			dialog.getContentPane().add(textField_40);
		}
		{
			JButton btnNewButton = new JButton("\uC218\uC815");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// System.out.println("update");
					today.setTitle(textField_33.getText());
					today.setToDo(textField_34.getText());
					today.setLocation(textField_35.getText());
					today.setDescribed(textField_36.getText());
					today.setYear(textField_37.getText());
					today.setMonth(textField_38.getText());
					today.setDay(textField_39.getText());
					today.setWeek(textField_40.getText());
					today.setHours(textField_41.getText());
					today.setEither(comboModel);
					// System.out.println(comboModel);
					// today.setEither((String)comboBox.;
					// System.out.println(today.getCount());
					// dialog.setVisible(false);
					// dialog.dispose();
					daydao.update(today);

					dialog.setVisible(false);
					dialog.dispose();
				}
			});
			btnNewButton.setBounds(78, 322, 99, 25);
			dialog.getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.setBounds(287, 322, 99, 25);
			dialog.getContentPane().add(btnNewButton_1);
		}

		JLabel lblNewLabel_7 = new JLabel("Hour");
		lblNewLabel_7.setBounds(27, 262, 57, 15);
		dialog.getContentPane().add(lblNewLabel_7);

		textField_41 = new JTextField();
		textField_41.setBounds(96, 259, 116, 21);
		dialog.getContentPane().add(textField_41);
		textField_41.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Am/Pm");
		lblNewLabel_8.setBounds(27, 287, 57, 15);
		dialog.getContentPane().add(lblNewLabel_8);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "AM", "PM" }));
		comboBox.setBounds(96, 290, 116, 23);
		dialog.getContentPane().add(comboBox);
		if (temp1 == "am") {
			comboBox.setSelectedIndex(0);
		} else {
			comboBox.setSelectedIndex(1);
		}
		comboBox.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JComboBox jcmbType = (JComboBox) e.getSource();
				String cmbType = (String) jcmbType.getSelectedItem();
				// System.out.println(cmbType);
				comboModel = cmbType;
			}
		});
		// comboBox.setSelectedItem((Object)temp1);
		// comboModel = (String)comboBox.getSelectedItem();

		dialog.setVisible(true);

		today = daydao.select(temp, temp1);
		textField_33.setText(today.getTitle());
		textField_34.setText(today.getToDo());
		textField_35.setText(today.getLocation());
		textField_36.setText(today.getDescribed());
		textField_37.setText(today.getYear());
		textField_38.setText(today.getMonth());
		textField_39.setText(today.getDay());
		textField_40.setText(today.getWeek());
		textField_41.setText(today.getHours());
		// comboBox.s;
		// textField_42.
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		today = new Today();
		daydao = new DayDao();
		String temp;

		frame = new JFrame();
		frame.setBounds(100, 100, 738, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "12";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				textField.setText(today.getTitle());
			}
		});
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(82, 95, 643, 21);
		frame.getContentPane().add(textField);
		// temp = textfieldSetText("12", "am");
		// textField.setText(temp);

		JLabel label = new JLabel("\uC624\uC804 12\uC2DC");
		label.setBounds(15, 98, 57, 15);
		frame.getContentPane().add(label);

		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "01";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				// insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_1.setText(today.getTitle());
				}
			}
		});
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(82, 126, 643, 21);
		frame.getContentPane().add(textField_1);

		JLabel label_1 = new JLabel("\uC624\uC804 01\uC2DC");
		label_1.setBounds(15, 129, 57, 15);
		frame.getContentPane().add(label_1);

		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "02";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_2.setText(today.getTitle());
				}
			}
		});
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(82, 157, 643, 21);
		frame.getContentPane().add(textField_2);

		JLabel label_2 = new JLabel("\uC624\uC804 02\uC2DC");
		label_2.setBounds(15, 160, 57, 15);
		frame.getContentPane().add(label_2);

		textField_3 = new JTextField();
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "03";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_3.setText(today.getTitle());
				}
			}
		});
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(82, 188, 643, 21);
		frame.getContentPane().add(textField_3);

		JLabel label_3 = new JLabel("\uC624\uC804 03\uC2DC");
		label_3.setBounds(15, 191, 57, 15);
		frame.getContentPane().add(label_3);

		textField_4 = new JTextField();
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "04";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_4.setText(today.getTitle());
				}
			}
		});
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(82, 219, 643, 21);
		frame.getContentPane().add(textField_4);

		JLabel label_4 = new JLabel("\uC624\uC804 04\uC2DC");
		label_4.setBounds(15, 222, 57, 15);
		frame.getContentPane().add(label_4);

		textField_5 = new JTextField();
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "05";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_5.setText(today.getTitle());
				}
			}
		});
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(82, 250, 643, 21);
		frame.getContentPane().add(textField_5);

		JLabel label_5 = new JLabel("\uC624\uC804 05\uC2DC");
		label_5.setBounds(15, 253, 57, 15);
		frame.getContentPane().add(label_5);

		textField_6 = new JTextField();
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "06";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_6.setText(today.getTitle());
				}
			}
		});
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(82, 281, 643, 21);
		frame.getContentPane().add(textField_6);

		JLabel label_6 = new JLabel("\uC624\uC804 06\uC2DC");
		label_6.setBounds(15, 284, 57, 15);
		frame.getContentPane().add(label_6);

		textField_7 = new JTextField();
		textField_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "07";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_7.setText(today.getTitle());
				}
			}
		});
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(82, 312, 643, 21);
		frame.getContentPane().add(textField_7);

		JLabel label_7 = new JLabel("\uC624\uC804 07\uC2DC");
		label_7.setBounds(15, 315, 57, 15);
		frame.getContentPane().add(label_7);

		textField_8 = new JTextField();
		textField_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "08";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_8.setText(today.getTitle());
				}
			}
		});
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(82, 343, 643, 21);
		frame.getContentPane().add(textField_8);

		JLabel label_8 = new JLabel("\uC624\uC804 08\uC2DC");
		label_8.setBounds(15, 346, 57, 15);
		frame.getContentPane().add(label_8);

		textField_9 = new JTextField();
		textField_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "09";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_9.setText(today.getTitle());
				}
			}
		});
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(82, 374, 643, 21);
		frame.getContentPane().add(textField_9);

		JLabel label_9 = new JLabel("\uC624\uC804 09\uC2DC");
		label_9.setBounds(15, 377, 57, 15);
		frame.getContentPane().add(label_9);

		textField_10 = new JTextField();
		textField_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "10";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_10.setText(today.getTitle());
				}
			}
		});
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(82, 405, 643, 21);
		frame.getContentPane().add(textField_10);

		JLabel label_10 = new JLabel("\uC624\uC804 10\uC2DC");
		label_10.setBounds(15, 408, 57, 15);
		frame.getContentPane().add(label_10);

		textField_11 = new JTextField();
		textField_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "11";
				String temp1 = "am";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_11.setText(today.getTitle());
				}
			}
		});
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(82, 436, 643, 21);
		frame.getContentPane().add(textField_11);

		JLabel label_11 = new JLabel("\uC624\uC804 11\uC2DC");
		label_11.setBounds(15, 439, 57, 15);
		frame.getContentPane().add(label_11);

		textField_12 = new JTextField();
		textField_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "12";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_12.setText(today.getTitle());
				}
			}
		});
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(82, 467, 643, 21);
		frame.getContentPane().add(textField_12);

		JLabel label_12 = new JLabel("\uC624\uD6C4 12\uC2DC");
		label_12.setBounds(15, 470, 57, 15);
		frame.getContentPane().add(label_12);

		textField_13 = new JTextField();
		textField_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "01";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_13.setText(today.getTitle());
				}
			}
		});
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(82, 495, 643, 21);
		frame.getContentPane().add(textField_13);

		JLabel label_13 = new JLabel("\uC624\uD6C4 01\uC2DC");
		label_13.setBounds(15, 498, 57, 15);
		frame.getContentPane().add(label_13);

		textField_14 = new JTextField();
		textField_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "02";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_14.setText(today.getTitle());
				}
			}
		});
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(82, 526, 643, 21);
		frame.getContentPane().add(textField_14);

		JLabel label_14 = new JLabel("\uC624\uD6C4 02\uC2DC");
		label_14.setBounds(15, 529, 57, 15);
		frame.getContentPane().add(label_14);

		textField_15 = new JTextField();
		textField_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "03";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_15.setText(today.getTitle());
				}
			}
		});
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(82, 557, 643, 21);
		frame.getContentPane().add(textField_15);

		JLabel label_15 = new JLabel("\uC624\uD6C4 03\uC2DC");
		label_15.setBounds(15, 560, 57, 15);
		frame.getContentPane().add(label_15);

		textField_16 = new JTextField();
		textField_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "04";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_16.setText(today.getTitle());
				}

			}
		});
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(82, 588, 643, 21);
		frame.getContentPane().add(textField_16);

		JLabel label_16 = new JLabel("\uC624\uD6C4 04\uC2DC");
		label_16.setBounds(15, 591, 57, 15);
		frame.getContentPane().add(label_16);

		textField_17 = new JTextField();
		textField_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "05";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_17.setText(today.getTitle());
				}
			}
		});
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(82, 619, 643, 21);
		frame.getContentPane().add(textField_17);

		JLabel label_17 = new JLabel("\uC624\uD6C4 05\uC2DC");
		label_17.setBounds(15, 622, 57, 15);
		frame.getContentPane().add(label_17);

		textField_18 = new JTextField();
		textField_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "06";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_18.setText(today.getTitle());
				}
			}
		});
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(82, 650, 643, 21);
		frame.getContentPane().add(textField_18);

		JLabel label_18 = new JLabel("\uC624\uD6C4 06\uC2DC");
		label_18.setBounds(15, 653, 57, 15);
		frame.getContentPane().add(label_18);

		textField_19 = new JTextField();
		textField_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "07";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_19.setText(today.getTitle());
				}
			}
		});
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(82, 681, 643, 21);
		frame.getContentPane().add(textField_19);

		JLabel label_19 = new JLabel("\uC624\uD6C4 07\uC2DC");
		label_19.setBounds(15, 684, 57, 15);
		frame.getContentPane().add(label_19);

		textField_20 = new JTextField();
		textField_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "08";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_20.setText(today.getTitle());
				}
			}
		});
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(82, 712, 643, 21);
		frame.getContentPane().add(textField_20);

		JLabel label_20 = new JLabel("\uC624\uD6C4 08\uC2DC");
		label_20.setBounds(15, 715, 57, 15);
		frame.getContentPane().add(label_20);

		textField_21 = new JTextField();
		textField_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "09";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_21.setText(today.getTitle());
				}
			}
		});
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(82, 743, 643, 21);
		frame.getContentPane().add(textField_21);

		JLabel label_21 = new JLabel("\uC624\uD6C4 09\uC2DC");
		label_21.setBounds(15, 746, 57, 15);
		frame.getContentPane().add(label_21);

		textField_22 = new JTextField();
		textField_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "10";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_22.setText(today.getTitle());
				}
			}
		});
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(82, 774, 643, 21);
		frame.getContentPane().add(textField_22);

		JLabel label_22 = new JLabel("\uC624\uD6C4 10\uC2DC");
		label_22.setBounds(15, 777, 57, 15);
		frame.getContentPane().add(label_22);

		textField_23 = new JTextField();
		textField_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "11";
				String temp1 = "pm";
				// insert(temp, temp1);
				insert(temp, temp1);
				today = daydao.select(temp, temp1);
				if (daydao.select(temp, temp1) != null) {
					textField_23.setText(today.getTitle());
				}
			}
		});
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(82, 805, 643, 21);
		frame.getContentPane().add(textField_23);

		JLabel label_23 = new JLabel("\uC624\uD6C4 11\uC2DC");
		label_23.setBounds(15, 808, 57, 15);
		frame.getContentPane().add(label_23);

		textField_24 = new JTextField();
		textField_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = null;
				String temp1 = "ti";
				insert(temp, temp1);
				//title();
				today = daydao.select(temp1);
				//System.out.println(today.getTitle());
				if (daydao.select(temp) != null) {
					//textField_24.setText(today.getTitle());
				}else{
					textField_24.setText(today.getTitle());
				}
					
				//System.out.println(today.getTitle());
			}
		});
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(82, 64, 643, 21);
		frame.getContentPane().add(textField_24);
		//textField_24.setText(today.getTitle());

		// yiss92 select
		// yiss92
		// String temp = "12";
		// String temp1 = "am";
		// today = daydao.select(temp, temp1);
		// textField.setText(today.getTitle());
		// textfieldSetText();
		temp = textfieldSetText("12", "am");
		textField.setText(temp);

		temp = textfieldSetText("01", "am");
		textField_1.setText(temp);

		temp = textfieldSetText("02", "am");
		textField_2.setText(temp);

		temp = textfieldSetText("03", "am");
		textField_3.setText(temp);

		temp = textfieldSetText("04", "am");
		textField_4.setText(temp);

		temp = textfieldSetText("05", "am");
		textField_5.setText(temp);

		temp = textfieldSetText("06", "am");
		textField_6.setText(temp);

		temp = textfieldSetText("07", "am");
		textField_7.setText(temp);

		temp = textfieldSetText("08", "am");
		textField_8.setText(temp);

		temp = textfieldSetText("09", "am");
		textField_9.setText(temp);

		temp = textfieldSetText("10", "am");
		textField_10.setText(temp);

		temp = textfieldSetText("11", "am");
		textField_11.setText(temp);

		temp = textfieldSetText("12", "pm");
		textField_12.setText(temp);

		temp = textfieldSetText("01", "pm");
		textField_13.setText(temp);

		temp = textfieldSetText("02", "pm");
		textField_14.setText(temp);

		temp = textfieldSetText("03", "pm");
		textField_15.setText(temp);

		temp = textfieldSetText("04", "pm");
		textField_16.setText(temp);

		temp = textfieldSetText("05", "pm");
		textField_17.setText(temp);

		temp = textfieldSetText("06", "pm");
		textField_18.setText(temp);

		temp = textfieldSetText("07", "pm");
		textField_19.setText(temp);

		temp = textfieldSetText("08", "pm");
		textField_20.setText(temp);

		temp = textfieldSetText("09", "pm");
		textField_21.setText(temp);

		temp = textfieldSetText("10", "pm");
		textField_22.setText(temp);

		temp = textfieldSetText("11", "pm");
		textField_23.setText(temp);
		
		temp = textfieldSetText("", "ti");
		textField_24.setText(temp);
	}

	public String textfieldSetText(String temp, String temp1) {
		String result = "";
		today = new Today();
		daydao = new DayDao();
		today = daydao.select(temp, temp1);

		if (daydao.select(temp, temp1) != null) {
			result = today.getTitle();
		} else {
			result = "";
		}
		// result = today.getTitle();
		return result;
	}
	
	public void title(){
		JDialog dialog = new JDialog();
		dialog.setBounds(100, 100, 450, 408);
		
		today = new Today();
		daydao = new DayDao();
		String temp="";
		String temp1="";
		if (daydao.select(temp, temp1) != null) {
			rmtitle(temp, temp1);
			dialog.setVisible(false);
			dialog.dispose();
			// System.exit(0);
			// dialog.exit(0);
			System.out.println("close dialog");
		} else {
			dialog.setVisible(true);
		}
		
		
		dialog.getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(" Title :");
			lblNewLabel.setBounds(27, 10, 57, 15);
			dialog.getContentPane().add(lblNewLabel);
		}
		{
			textField_42 = new JTextField();
			textField_42.setBounds(96, 7, 334, 21);
			dialog.getContentPane().add(textField_42);
			textField_42.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uD560\uC77C");
			lblNewLabel_1.setBounds(27, 43, 57, 15);
			dialog.getContentPane().add(lblNewLabel_1);
		}
		{
			textField_43 = new JTextField();
			textField_43.setBounds(96, 40, 334, 21);
			dialog.getContentPane().add(textField_43);
			textField_43.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_2.setBounds(27, 74, 57, 15);
			dialog.getContentPane().add(lblNewLabel_2);
		}
		{
			textField_44 = new JTextField();
			textField_44.setBounds(96, 71, 334, 21);
			dialog.getContentPane().add(textField_44);
			textField_44.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("\uC124\uBA85");
			lblNewLabel_3.setBounds(27, 107, 57, 15);
			dialog.getContentPane().add(lblNewLabel_3);
		}
		{
			textField_45 = new JTextField();
			textField_45.setBounds(96, 104, 334, 21);
			dialog.getContentPane().add(textField_45);
			textField_45.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(27, 138, 57, 15);
			dialog.getContentPane().add(lblNewLabel_4);
		}
		{
			textField_46 = new JTextField();
			textField_46.setBounds(96, 135, 116, 21);
			dialog.getContentPane().add(textField_46);
			textField_46.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(27, 169, 57, 15);
			dialog.getContentPane().add(lblNewLabel_5);
		}
		{
			textField_47 = new JTextField();
			textField_47.setBounds(96, 166, 116, 21);
			dialog.getContentPane().add(textField_47);
			textField_47.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Day");
			lblNewLabel_6.setBounds(27, 200, 57, 15);
			dialog.getContentPane().add(lblNewLabel_6);
		}
		{
			textField_48 = new JTextField();
			textField_48.setColumns(10);
			textField_48.setBounds(96, 197, 116, 21);
			dialog.getContentPane().add(textField_48);
		}
		{
			JLabel lblDay = new JLabel("Week");
			lblDay.setBounds(27, 231, 57, 15);
			dialog.getContentPane().add(lblDay);
		}
		{
			textField_49 = new JTextField();
			textField_49.setColumns(10);
			textField_49.setBounds(96, 228, 116, 21);
			dialog.getContentPane().add(textField_49);
		}
		{
			JButton btnNewButton = new JButton("저장");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					//System.out.println("title");
					System.out.println(textField_42.getText());
					today.setTitle(textField_42.getText());
					today.setToDo(textField_43.getText());
					today.setLocation(textField_44.getText());
					today.setDescribed(textField_45.getText());
					today.setYear(textField_46.getText());
					today.setMonth(textField_47.getText());
					today.setDay(textField_48.getText());
					today.setWeek(textField_49.getText());
					today.setHours(temp);
					today.setEither(temp1);
					daydao.insert(today);
					// today = daydao.selectToday();
					// today = daydao.insert(today);
					// insert close
					dialog.setVisible(false);
					dialog.dispose();					
				}
			});
			btnNewButton.setBounds(78, 322, 99, 25);
			dialog.getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("취소");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dialog.setVisible(false);
					dialog.dispose();
				}
			});
			btnNewButton_1.setBounds(287, 322, 99, 25);
			dialog.getContentPane().add(btnNewButton_1);
		}
		dialog.setVisible(true);		
	}
	
	public void rmtitle(String temp, String temp1){
		JDialog dialog = new JDialog();
		dialog.setBounds(100, 100, 450, 408);
		dialog.getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(" Title :");
			lblNewLabel.setBounds(27, 10, 57, 15);
			dialog.getContentPane().add(lblNewLabel);
		}
		{
			textField_51 = new JTextField();
			textField_51.setBounds(96, 7, 334, 21);
			dialog.getContentPane().add(textField_51);
			textField_51.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uD560\uC77C");
			lblNewLabel_1.setBounds(27, 43, 57, 15);
			dialog.getContentPane().add(lblNewLabel_1);
		}
		{
			textField_52 = new JTextField();
			textField_52.setBounds(96, 40, 334, 21);
			dialog.getContentPane().add(textField_52);
			textField_52.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_2.setBounds(27, 74, 57, 15);
			dialog.getContentPane().add(lblNewLabel_2);
		}
		{
			textField_53 = new JTextField();
			textField_53.setBounds(96, 71, 334, 21);
			dialog.getContentPane().add(textField_53);
			textField_53.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("\uC124\uBA85");
			lblNewLabel_3.setBounds(27, 107, 57, 15);
			dialog.getContentPane().add(lblNewLabel_3);
		}
		{
			textField_54 = new JTextField();
			textField_54.setBounds(96, 104, 334, 21);
			dialog.getContentPane().add(textField_54);
			textField_54.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(27, 138, 57, 15);
			dialog.getContentPane().add(lblNewLabel_4);
		}
		{
			textField_55 = new JTextField();
			textField_55.setBounds(96, 135, 116, 21);
			dialog.getContentPane().add(textField_55);
			textField_55.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(27, 169, 57, 15);
			dialog.getContentPane().add(lblNewLabel_5);
		}
		{
			textField_56 = new JTextField();
			textField_56.setBounds(96, 166, 116, 21);
			dialog.getContentPane().add(textField_56);
			textField_56.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Week");
			lblNewLabel_6.setBounds(27, 200, 57, 15);
			dialog.getContentPane().add(lblNewLabel_6);
		}
		{
			textField_57 = new JTextField();
			textField_57.setColumns(10);
			textField_57.setBounds(96, 197, 116, 21);
			dialog.getContentPane().add(textField_57);
		}
		{
			JLabel lblDay = new JLabel("Day");
			lblDay.setBounds(27, 231, 57, 15);
			dialog.getContentPane().add(lblDay);
		}
		{
			textField_58 = new JTextField();
			textField_58.setColumns(10);
			textField_58.setBounds(96, 228, 116, 21);
			dialog.getContentPane().add(textField_58);
		}
		{
			JButton btnNewButton = new JButton("\uC218\uC815");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnNewButton.setBounds(78, 322, 99, 25);
			dialog.getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnNewButton_1.setBounds(287, 322, 99, 25);
			dialog.getContentPane().add(btnNewButton_1);
		}

		
	}

}
