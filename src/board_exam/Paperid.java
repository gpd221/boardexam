package board_exam;

import exam.utility;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import javax.swing.ImageIcon;

public class Paperid {

	public  JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

Connection con;


	public static void main(String[] args) {
		String jdbcURL = "jdbc:postgresql://localhost:5432/project";
		String username = "postgres";
		String password = "2002";
		utility utility = new utility(username, password, jdbcURL);
		Connection con = utility.getConnection();
		Paperid paperid = new Paperid(con);
		paperid.frame.setVisible(true);
	}
	/**
	 * Create the application.
	 */
	public Paperid(Connection con) {
		this.con = con;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 224, 208));
		frame.setBounds(100, 100, 892, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMarkRegistration = new JLabel("PAPER ID");
		lblMarkRegistration.setForeground(Color.WHITE);
		lblMarkRegistration.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblMarkRegistration.setBackground(Color.BLACK);
		lblMarkRegistration.setBounds(388, 10, 432, 91);
		frame.getContentPane().add(lblMarkRegistration);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setForeground(Color.WHITE);
		lblStudentid.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblStudentid.setBackground(Color.BLACK);
		lblStudentid.setBounds(20, 94, 151, 40);
		frame.getContentPane().add(lblStudentid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(153, 103, 220, 29);
		frame.getContentPane().add(textField);
		
		JLabel lblMaths = new JLabel("Maths_Id");
		lblMaths.setForeground(Color.WHITE);
		lblMaths.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblMaths.setBackground(Color.BLACK);
		lblMaths.setBounds(20, 198, 151, 40);
		frame.getContentPane().add(lblMaths);
		
		JLabel lblSocial = new JLabel("Social_Id");
		lblSocial.setForeground(Color.WHITE);
		lblSocial.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblSocial.setBackground(Color.BLACK);
		lblSocial.setBounds(20, 248, 151, 40);
		frame.getContentPane().add(lblSocial);
		
		JLabel lblScience = new JLabel("Science_Id");
		lblScience.setForeground(Color.WHITE);
		lblScience.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblScience.setBackground(Color.BLACK);
		lblScience.setBounds(20, 296, 151, 40);
		frame.getContentPane().add(lblScience);
		
		JLabel lblEnglish = new JLabel("English_Id");
		lblEnglish.setForeground(Color.WHITE);
		lblEnglish.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblEnglish.setBackground(Color.BLACK);
		lblEnglish.setBounds(20, 341, 151, 40);
		frame.getContentPane().add(lblEnglish);
		
		JLabel lblHindi = new JLabel("Hindi_Id");
		lblHindi.setForeground(Color.WHITE);
		lblHindi.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblHindi.setBackground(Color.BLACK);
		lblHindi.setBounds(20, 385, 151, 40);
		frame.getContentPane().add(lblHindi);
		
		JLabel lblMalayalam = new JLabel("Malayalam_Id");
		lblMalayalam.setForeground(Color.WHITE);
		lblMalayalam.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblMalayalam.setBackground(Color.BLACK);
		lblMalayalam.setBounds(20, 435, 151, 40);
		frame.getContentPane().add(lblMalayalam);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 207, 220, 29);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 257, 220, 29);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(153, 305, 220, 29);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(153, 348, 220, 29);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(153, 394, 220, 29);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(153, 444, 220, 29);
		frame.getContentPane().add(textField_6);
		
		JButton btnNewButton_3_1 = new JButton("Enter Marks");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Markregistration markobj = new Markregistration();
				markobj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_1.setBackground(SystemColor.activeCaption);
		btnNewButton_3_1.setBounds(603, 292, 212, 51);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JLabel lblNewLabel = new JLabel("PAPER ID");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(20, 160, 166, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("src\\board_exam\\picture.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 925, 503);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_3_1_1 = new JButton("REGISTER");
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_1_1.setBackground(SystemColor.activeCaption);
		btnNewButton_3_1_1.setBounds(603, 167, 212, 51);
		frame.getContentPane().add(btnNewButton_3_1_1);
	}
}
