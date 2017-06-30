import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{
    //instance variable
static Connection conn = null;
    //return instance
    public static Connection getDBConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
