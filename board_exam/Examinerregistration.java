package board_exam;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;

public class Examinerregistration {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	Connection con;


	/**
	 * Create the application.
	 */
	public Examinerregistration(Connection con) {
		this.con = con;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 224, 208));
		frame.setBounds(100, 100, 881, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblExaminerRegistration = new JLabel("EXAMINER  REGISTRATION");
		lblExaminerRegistration.setForeground(Color.WHITE);
		lblExaminerRegistration.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblExaminerRegistration.setBackground(Color.BLACK);
		lblExaminerRegistration.setBounds(217, 23, 432, 91);
		frame.getContentPane().add(lblExaminerRegistration);
		
		JLabel lblExaminerId = new JLabel("Examiner_id");
		lblExaminerId.setForeground(Color.WHITE);
		lblExaminerId.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblExaminerId.setBackground(Color.BLACK);
		lblExaminerId.setBounds(30, 115, 151, 40);
		frame.getContentPane().add(lblExaminerId);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(183, 124, 220, 29);
		frame.getContentPane().add(textField);
		
		JLabel lblName = new JLabel("Examiner_Name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblName.setBackground(Color.BLACK);
		lblName.setBounds(30, 181, 151, 40);
		frame.getContentPane().add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 190, 220, 29);
		frame.getContentPane().add(textField_1);
		
		JLabel lblCenter = new JLabel("Center");
		lblCenter.setForeground(Color.WHITE);
		lblCenter.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblCenter.setBackground(Color.BLACK);
		lblCenter.setBounds(30, 310, 151, 40);
		frame.getContentPane().add(lblCenter);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblGender.setBackground(Color.BLACK);
		lblGender.setBounds(528, 124, 151, 40);
		frame.getContentPane().add(lblGender);
		
		JLabel lblEmail = new JLabel("E_mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblEmail.setBackground(Color.BLACK);
		lblEmail.setBounds(30, 247, 151, 40);
		frame.getContentPane().add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 256, 220, 29);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(183, 319, 220, 29);
		frame.getContentPane().add(textField_3);
		
		JButton btnNewButton_3 = new JButton("REGISTER");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Examiner_id = textField.getText();
                String Examiner_name = textField_1.getText();
                String  e_mail= textField_2.getText();
                String center = textField_3.getText();
                String  state= textField_4.getText();
                String subject = textField_5.getText();
                String Mobile_no = textField_6.getText();
                String Qualification = textField_7.getText();
                String Gender = textField_8.getText();
                try {


                	PreparedStatement preparedStatement = con.prepareStatement("insert into examiner(Examiner_id,Examiner _Name,Gender,State,Subject,Mobile_no,Center,E_mail,Qualification)   values (?,?,?,?,?,?,?,?);");
                    preparedStatement.setString(1, Examiner_id);
                    preparedStatement.setString(2, Examiner_name);
                    preparedStatement.setString(9, Gender);
                    preparedStatement.setString(5,(state));
                    preparedStatement.setString(6, subject);
                    preparedStatement.setInt(7,Integer.parseInt( Mobile_no));
                    preparedStatement.setString(4, center);
                    preparedStatement.setString(3,e_mail);
                    preparedStatement.setString(8, Qualification);
                    
                   
                   
                    
                   
                    

                preparedStatement.executeUpdate();

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBackground(new Color(224, 255, 255));
		btnNewButton_3.setBounds(30, 428, 158, 51);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("EXIT");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_1.setBackground(new Color(224, 255, 255));
		btnNewButton_3_1.setBounds(689, 428, 151, 51);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JLabel lblState = new JLabel("State");
		lblState.setForeground(Color.WHITE);
		lblState.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblState.setBackground(Color.BLACK);
		lblState.setBounds(539, 186, 151, 40);
		frame.getContentPane().add(lblState);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(620, 195, 220, 29);
		frame.getContentPane().add(textField_4);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setForeground(Color.WHITE);
		lblSubject.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblSubject.setBackground(Color.BLACK);
		lblSubject.setBounds(539, 247, 151, 40);
		frame.getContentPane().add(lblSubject);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(620, 256, 220, 29);
		frame.getContentPane().add(textField_5);
		
		JLabel lblMobileNo = new JLabel("Mobile_no");
		lblMobileNo.setForeground(Color.WHITE);
		lblMobileNo.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblMobileNo.setBackground(Color.BLACK);
		lblMobileNo.setBounds(528, 297, 151, 40);
		frame.getContentPane().add(lblMobileNo);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(620, 308, 220, 29);
		frame.getContentPane().add(textField_6);
		
		JLabel lblQualification = new JLabel("Qualification");
		lblQualification.setForeground(Color.WHITE);
		lblQualification.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblQualification.setBackground(Color.BLACK);
		lblQualification.setBounds(30, 360, 151, 40);
		frame.getContentPane().add(lblQualification);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(183, 374, 220, 29);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(620, 129, 220, 29);
		frame.getContentPane().add(textField_8);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src\\board_exam\\picture.jpeg"));
		lblNewLabel.setBounds(0, 0, 867, 489);
		frame.getContentPane().add(lblNewLabel);
	}

}
