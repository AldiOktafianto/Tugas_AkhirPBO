package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class mysqlconnect {
    public static Connection ConnectDb(){
        Connection conn ;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/datalogin","root","");
            JOptionPane.showMessageDialog(null, "terhubung ke database");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
