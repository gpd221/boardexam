package board_exam;

import java.awt.EventQueue;

import exam.utility;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class studentregistration {

    public JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_2;

    Connection con;

    /**
     * Launch the application.
     */

    /**
     * Create the application.
     */
    public studentregistration(Connection con) {
        this.con = con;
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(64, 224, 208));
        frame.setBounds(100, 100, 861, 538);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblStudentRegistration = new JLabel("STUDENT REGISTRATION");
        lblStudentRegistration.setForeground(Color.WHITE);
        lblStudentRegistration.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 31));
        lblStudentRegistration.setBackground(Color.WHITE);
        lblStudentRegistration.setBounds(206, 10, 414, 91);
        frame.getContentPane().add(lblStudentRegistration);

        JLabel lblRegisterNo = new JLabel("Student_ID");
        lblRegisterNo.setForeground(Color.WHITE);
        lblRegisterNo.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblRegisterNo.setBackground(Color.BLACK);
        lblRegisterNo.setBounds(28, 111, 151, 40);
        frame.getContentPane().add(lblRegisterNo);

        JLabel lblFullName = new JLabel("Student_Name");
        lblFullName.setForeground(Color.WHITE);
        lblFullName.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblFullName.setBackground(Color.BLACK);
        lblFullName.setBounds(445, 116, 151, 40);
        frame.getContentPane().add(lblFullName);

        JLabel lblFathersName = new JLabel("Father's_Name");
        lblFathersName.setForeground(Color.WHITE);
        lblFathersName.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblFathersName.setBackground(Color.BLACK);
        lblFathersName.setBounds(10, 191, 131, 40);
        frame.getContentPane().add(lblFathersName);

        JLabel lblMothersName = new JLabel("Mother's_Name");
        lblMothersName.setForeground(Color.WHITE);
        lblMothersName.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblMothersName.setBackground(Color.BLACK);
        lblMothersName.setBounds(445, 190, 151, 40);
        frame.getContentPane().add(lblMothersName);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblEmail.setBackground(Color.BLACK);
        lblEmail.setBounds(445, 327, 151, 40);
        frame.getContentPane().add(lblEmail);

        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(138, 120, 220, 29);
        frame.getContentPane().add(textField);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(138, 200, 220, 29);
        frame.getContentPane().add(textField_1);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(590, 202, 220, 29);
        frame.getContentPane().add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(590, 268, 220, 29);
        frame.getContentPane().add(textField_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(590, 125, 220, 29);
        frame.getContentPane().add(textField_5);

        JButton btnNewButton_3 = new JButton("REGISTER");
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton_3.setBackground(new Color(224, 255, 255));
        btnNewButton_3.setBounds(70, 424, 166, 51);
        frame.getContentPane().add(btnNewButton_3);

        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 String student_id = textField.getText();
                 String  fathers_name= textField_1.getText();
                 String  gender= textField_2.getText();
                 String mothers_name = textField_3.getText();
                 SimpleDateFormat formatter1=new SimpleDateFormat("yyyy/mm/dd"); 
                 java.util.Date date1 ;
                 java.sql.Date sqlDate;
                 try {
					date1 =formatter1.parse(textField_4.getText());
					sqlDate = new java.sql.Date(date1.getTime());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					date1 =new java.util.Date();
				}  
                 
                 
                 String student_name = textField_5.getText();
                 String e_mail  =  textField_6.getText();
                 sqlDate = new java.sql.Date(date1.getTime());
                 try {


                 	PreparedStatement preparedStatement = con.prepareStatement("insert into Student(student_id,student_name,fathers_name,mothers_name,gender,dob,e_mail) values (?,?,?,?,?,?,?);");
                 	preparedStatement.setString(1, student_id);
                    preparedStatement.setString(2, student_name);
                    preparedStatement.setString(3, fathers_name);
                    preparedStatement.setString(4, mothers_name);
                    preparedStatement.setString(5, gender);
                    preparedStatement.setDate(6, sqlDate);
                    preparedStatement.setString(7, e_mail);

                 preparedStatement.executeUpdate();
                 JOptionPane.showMessageDialog(null, "REGISTERED SUCCESSFULLY", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                 } catch (SQLException ex) {
                     ex.printStackTrace();
                 }
             }

            
        });

        JButton btnNewButton_3_1 = new JButton("EXIT");
        btnNewButton_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });
        btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton_3_1.setBackground(new Color(224, 255, 255));
        btnNewButton_3_1.setBounds(629, 424, 158, 51);
        frame.getContentPane().add(btnNewButton_3_1);

        JLabel lblSchoolId_2_1 = new JLabel("Gender");
        lblSchoolId_2_1.setForeground(Color.WHITE);
        lblSchoolId_2_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblSchoolId_2_1.setBackground(Color.BLACK);
        lblSchoolId_2_1.setBounds(28, 264, 151, 40);
        frame.getContentPane().add(lblSchoolId_2_1);

        JLabel lblDob = new JLabel("DOB");
        lblDob.setForeground(Color.WHITE);
        lblDob.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblDob.setBackground(Color.BLACK);
        lblDob.setBounds(445, 259, 151, 40);
        frame.getContentPane().add(lblDob);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(590, 336, 220, 29);
        frame.getContentPane().add(textField_6);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(138, 273, 220, 29);
        frame.getContentPane().add(textField_2);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("src\\board_exam\\picture.jpeg"));
        lblNewLabel.setBounds(0, 0, 847, 501);
        frame.getContentPane().add(lblNewLabel);
    }
}
