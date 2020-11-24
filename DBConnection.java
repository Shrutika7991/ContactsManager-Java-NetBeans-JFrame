
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author shrut
 */
public class DBConnection {
    public static Connection connect(){
        Connection conn = null;
        try{
           String url = "jdbc:sqlite:C:\\database\\contacts.db";
           conn = DriverManager.getConnection(url);
            System.out.println("Connected");
        } catch(Exception e){
            System.out.println("Something went wrong!!!" + e);
        }
        return conn;
    }
}
