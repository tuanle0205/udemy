package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/udemy", "root", "root");
//here sonoo is database name, root is username and password
            System.out.println(con);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
