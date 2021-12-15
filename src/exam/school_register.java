
package exam;

import java.sql.*;

public class school_register {
    Connection conn = null;
    public  school_register(Connection conn) {
        this.conn = conn;
    }

    public void createTable() {
        try {
            Statement stmt = conn.createStatement();
            String sql = "create table School(School_id varchar(20),School_Name varchar(50),state varchar(25), City char(50),Pincode int ,"
            		+ "email varchar(20),primary key(School_id))";
            stmt.executeUpdate(sql);
            String userName = conn.getMetaData().getUserName();
            sql = "GRANT ALL PRIVILEGES ON TABLE School to " + userName +";";
            stmt.executeUpdate(sql);    
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}