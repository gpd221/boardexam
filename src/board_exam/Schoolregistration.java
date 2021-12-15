package board_exam;

import java.awt.EventQueue;

import exam.school_register;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.ImageIcon;

public class Schoolregistration {

    public JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    Connection con;

    /**
     * Create the application.
     */
    public Schoolregistration(Connection con) {
        this.con = con;
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(102, 205, 170));
        frame.setBounds(100, 100, 774, 510);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblSchoolRegistration = new JLabel("SCHOOL REGISTRATION");
        lblSchoolRegistration.setForeground(Color.WHITE);
        lblSchoolRegistration.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblSchoolRegistration.setBackground(Color.BLACK);
        lblSchoolRegistration.setBounds(185, 10, 431, 100);
        frame.getContentPane().add(lblSchoolRegistration);

        JLabel lblSchoolId = new JLabel("School _Id");
        lblSchoolId.setForeground(Color.WHITE);
        lblSchoolId.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblSchoolId.setBackground(Color.BLACK);
        lblSchoolId.setBounds(28, 128, 151, 40);
        frame.getContentPane().add(lblSchoolId);

        JLabel lblState = new JLabel("State");
        lblState.setForeground(Color.WHITE);
        lblState.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblState.setBackground(Color.BLACK);
        lblState.setBounds(28, 223, 151, 40);
        frame.getContentPane().add(lblState);

        JLabel lblDistrict = new JLabel("City");
        lblDistrict.setForeground(Color.WHITE);
        lblDistrict.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblDistrict.setBackground(Color.BLACK);
        lblDistrict.setBounds(416, 223, 151, 40);
        frame.getContentPane().add(lblDistrict);

        JLabel lblSchoolName = new JLabel("School Name");
        lblSchoolName.setForeground(Color.WHITE);
        lblSchoolName.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblSchoolName.setBackground(new Color(255, 0, 0));
        lblSchoolName.setBounds(396, 129, 151, 40);
        frame.getContentPane().add(lblSchoolName);

        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(146, 132, 197, 40);
        frame.getContentPane().add(textField);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(540, 132, 197, 40);
        frame.getContentPane().add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(146, 226, 197, 40);
        frame.getContentPane().add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(540, 223, 197, 40);
        frame.getContentPane().add(textField_3);

        JLabel lblEmail = new JLabel("E-mail");
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblEmail.setBackground(Color.BLACK);
        lblEmail.setBounds(28, 324, 151, 40);
        frame.getContentPane().add(lblEmail);

        JLabel lblPincode = new JLabel("Pincode");
        lblPincode.setForeground(Color.WHITE);
        lblPincode.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblPincode.setBackground(Color.BLACK);
        lblPincode.setBounds(416, 324, 151, 40);
        frame.getContentPane().add(lblPincode);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(146, 324, 197, 40);
        frame.getContentPane().add(textField_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(540, 327, 197, 40);
        frame.getContentPane().add(textField_5);

        JButton btnNewButton_3 = new JButton("REGISTER");
        btnNewButton_3.setForeground(new Color(0, 0, 0));
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String school_id = textField.getText();
                String school_name = textField_1.getText();
                String state = textField_2.getText();
                String city = textField_3.getText();
                String email = textField_4.getText();
                String pincode = textField_5.getText();

                try {


                	PreparedStatement preparedStatement = con.prepareStatement("insert into School (School_id,school_name,state,city,pincode,e_mail) values (?,?,?,?,?,?);");
                    preparedStatement.setString(1, school_id);
                    preparedStatement.setString(2, school_name);
                    preparedStatement.setString(3,state);
                    preparedStatement.setString(4, city);
                    preparedStatement.setInt(5, Integer.parseInt(pincode));
                    preparedStatement.setString(6, email);

                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTERED SUCCESSFULLY", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton_3.setBackground(new Color(224, 255, 255));
        btnNewButton_3.setBounds(43, 395, 159, 51);
        frame.getContentPane().add(btnNewButton_3);

        JButton btnNewButton_3_1 = new JButton("EXIT");
        btnNewButton_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton_3_1.setBackground(new Color(224, 255, 255));
        btnNewButton_3_1.setBounds(586, 395, 151, 51);
        frame.getContentPane().add(btnNewButton_3_1);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("src\\board_exam\\picture.jpeg"));
        lblNewLabel.setBounds(0, 0, 775, 473);
        frame.getContentPane().add(lblNewLabel);
    }
}
