package board_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exam.utility;

public class postgresql {


    public static void main(String[] args) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/project";
        String username = "postgres";
        String password = "2002";
        utility utility = new utility(username, password, jdbcURL);
        Connection con = utility.getConnection();

        try {
            Login window = new Login(con);
            window.frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;
    }
}
