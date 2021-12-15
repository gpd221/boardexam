package board_exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Markregistration {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Markregistration frame = new Markregistration();
				     frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		

	/**
	 * Create the application.
	 */
	public Markregistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 224, 208));
		frame.setBounds(100, 100, 890, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMarkRegistration = new JLabel("MARK REGISTRATION");
		lblMarkRegistration.setForeground(Color.WHITE);
		lblMarkRegistration.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblMarkRegistration.setBackground(Color.BLACK);
		lblMarkRegistration.setBounds(315, 12, 432, 91);
		frame.getContentPane().add(lblMarkRegistration);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setForeground(Color.WHITE);
		lblStudentid.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblStudentid.setBackground(Color.BLACK);
		lblStudentid.setBounds(27, 104, 151, 40);
		frame.getContentPane().add(lblStudentid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(164, 113, 220, 29);
		frame.getContentPane().add(textField);
		
		JLabel lblEnterMarks = new JLabel("Enter Marks ");
		lblEnterMarks.setForeground(new Color(220, 20, 60));
		lblEnterMarks.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterMarks.setBounds(27, 165, 166, 29);
		frame.getContentPane().add(lblEnterMarks);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setForeground(Color.WHITE);
		lblMaths.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblMaths.setBackground(Color.BLACK);
		lblMaths.setBounds(27, 204, 151, 40);
		frame.getContentPane().add(lblMaths);
		
		JLabel lblSocial = new JLabel("Social");
		lblSocial.setForeground(Color.WHITE);
		lblSocial.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblSocial.setBackground(Color.BLACK);
		lblSocial.setBounds(27, 245, 151, 40);
		frame.getContentPane().add(lblSocial);
		
		JLabel lblScience = new JLabel("Science");
		lblScience.setForeground(Color.WHITE);
		lblScience.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblScience.setBackground(Color.BLACK);
		lblScience.setBounds(27, 289, 151, 40);
		frame.getContentPane().add(lblScience);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setForeground(Color.WHITE);
		lblEnglish.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblEnglish.setBackground(Color.BLACK);
		lblEnglish.setBounds(27, 326, 151, 40);
		frame.getContentPane().add(lblEnglish);
		
		JLabel lblHindi = new JLabel("Hindi");
		lblHindi.setForeground(Color.WHITE);
		lblHindi.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblHindi.setBackground(Color.BLACK);
		lblHindi.setBounds(27, 365, 151, 40);
		frame.getContentPane().add(lblHindi);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setForeground(Color.WHITE);
		lblMalayalam.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblMalayalam.setBackground(Color.BLACK);
		lblMalayalam.setBounds(27, 415, 151, 40);
		frame.getContentPane().add(lblMalayalam);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(164, 213, 220, 29);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(164, 254, 220, 29);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(164, 298, 220, 29);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(164, 335, 220, 29);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(164, 376, 220, 29);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(164, 424, 220, 29);
		frame.getContentPane().add(textField_6);
		
		JButton btnNewButton_3_1 = new JButton("REGISTER");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_1.setBackground(SystemColor.activeCaption);
		btnNewButton_3_1.setBounds(593, 354, 212, 51);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src\\board_exam\\picture.jpeg"));
		lblNewLabel.setBounds(0, 0, 876, 492);
		frame.getContentPane().add(lblNewLabel);
	}
}
