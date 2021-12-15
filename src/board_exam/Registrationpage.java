package board_exam;

import exam.check;
import exam.utility;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class Registrationpage {


    public JFrame frame;

    Connection con;

    /**
     * Launch the application.
     */

    /**
     * Create the application.
     */
    public Registrationpage(Connection con) {
        this.con = con;
        initialize();
    }

    public static void main(String[] args) {

        String jdbcURL = "jdbc:postgresql://localhost:5432/project";
        String username = "postgres";
        String password = "2002";
        utility utility = new utility(username, password, jdbcURL);
        Connection con = utility.getConnection();
        Registrationpage registrationpage = new Registrationpage(con);
        registrationpage.frame.setVisible(true);

    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(139, 0, 139));
        frame.setBounds(100, 100, 850, 520);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton_3_2 = new JButton("Student Registration");
        btnNewButton_3_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentregistration stuobj = new studentregistration(con);
                stuobj.frame.setVisible(true);
                frame.dispose();
            }
        });
        btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton_3_2.setBackground(new Color(240, 248, 255));
        btnNewButton_3_2.setBounds(36, 160, 233, 60);
        frame.getContentPane().add(btnNewButton_3_2);

        JButton btnNewButton_3_1 = new JButton("Examiner Registration");
        btnNewButton_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Examinerregistration exobj = new Examinerregistration(con);
                exobj.frame.setVisible(true);
                frame.dispose();

            }
        });
        btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnNewButton_3_1.setBackground(new Color(240, 248, 255));
        btnNewButton_3_1.setBounds(497, 160, 233, 60);
        frame.getContentPane().add(btnNewButton_3_1);

        JButton btnNewButton_3 = new JButton("School Registration");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Schoolregistration sobj = new Schoolregistration(con);
                sobj.frame.setVisible(true);
                frame.dispose();
            }
        });
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton_3.setBackground(new Color(240, 248, 255));
        btnNewButton_3.setBounds(36, 308, 233, 66);
        frame.getContentPane().add(btnNewButton_3);

        JButton btnNewButton_3_1_1 = new JButton("Marks Registration");
        btnNewButton_3_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Paperid marobj = new Paperid(con);
                marobj.frame.setVisible(true);
                frame.dispose();
            }
        });
        btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton_3_1_1.setBackground(new Color(240, 248, 255));
        btnNewButton_3_1_1.setBounds(497, 308, 233, 60);
        frame.getContentPane().add(btnNewButton_3_1_1);

        JButton btnNewButton_1 = new JButton("EXIT");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1.setBackground(new Color(224, 255, 255));
        btnNewButton_1.setBounds(300, 407, 169, 50);
        frame.getContentPane().add(btnNewButton_1);

        JLabel lblNewLabel_1_1 = new JLabel("      BOARD EXAM MANAGEMENT SYSTEM");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 33));
        lblNewLabel_1_1.setBackground(SystemColor.info);
        lblNewLabel_1_1.setBounds(60, 10, 719, 71);
        frame.getContentPane().add(lblNewLabel_1_1);

        JLabel lblNewLabel_1 = new JLabel("REGISTRATION");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 28));
        lblNewLabel_1.setBackground(SystemColor.info);
        lblNewLabel_1.setBounds(293, 91, 328, 41);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(new Color(230, 230, 250));
        lblNewLabel.setIcon(new ImageIcon("src\\board_exam\\picture.jpeg"));
        lblNewLabel.setBounds(0, 0, 836, 483);
        frame.getContentPane().add(lblNewLabel);
    }

}
