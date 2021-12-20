package board_exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;

import exam.check;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class Login {

	public JFrame frame;
	public JTextField textField;
	public JPasswordField passwordField;
Connection con;
	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the application.
	 */
	public Login(Connection con) {
		this.con =con;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(139, 0, 139));
		frame.setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBounds(100, 100, 865, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Arial Black", Font.PLAIN, 26));
		lblUsername.setBackground(Color.BLACK);
		lblUsername.setBounds(221, 155, 217, 100);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial Black", Font.PLAIN, 26));
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setBounds(221, 243, 217, 92);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(469, 183, 323, 37);
		frame.getContentPane().add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(469, 271, 323, 37);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin_1 = new JButton("LOGIN");
		btnLogin_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin_1.setBackground(new Color(224, 255, 255));
		btnLogin_1.setBounds(97, 385, 181, 66);
		frame.getContentPane().add(btnLogin_1);
		btnLogin_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            String username = textField.getText();
            String password = passwordField.getText();
            if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            }
            else {
                String query = "select * from Admin where username = '" + username + "' and password = '" + password + "'";
                check check = new check(con);
                if (check.check_data(query)){
                	 {
    					Registrationpage window = new Registrationpage(con);
    					window.frame.setVisible(true);
    					frame.dispose();
    				} 
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "Login Failed");
                }
            }
            }
            
        });
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.setBounds(582, 385, 181, 66);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("                     LOGIN");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBackground(SystemColor.info);
		lblNewLabel_1.setBounds(214, 95, 522, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("      BOARD EXAM MANAGEMENT SYSTEM");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel_1_1.setBackground(SystemColor.info);
		lblNewLabel_1_1.setBounds(66, 10, 719, 71);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src\\board_exam\\picture.jpeg"));
		lblNewLabel.setBounds(0, 0, 851, 478);
		frame.getContentPane().add(lblNewLabel);
	}
}
