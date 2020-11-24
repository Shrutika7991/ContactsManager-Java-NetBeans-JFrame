import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author shrut
 */
public class MainClass {
    public static void main(String[] args) {
        // TODO code application logic here
        insertContact(001,"Shrutika","Sawant",23,12345678);
        insertContact(002,"Ashlesha","Sawant",25,98765435);
        insertContact(003,"Heramb","Sawant",19,56294638);
        insertContact(004,"Swati","Sawant",50,97653648);
        
        ContactsManager contact = new ContactsManager();
    }
    
    private static void insertContact(int ID,String fname, String lname, int age, int phone){
        Connection conn = DBConnection.connect();
        PreparedStatement ps = null;
        try{
        String sql = "INSERT INTO contacts(ID, FIRSTNAME, LASTNAME, AGE, PHONE) VALUES (?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, ID);
        ps.setString(2, fname);
        ps.setString(3, lname);
        ps.setInt(4, age);
        ps.setInt(5, phone);
        ps.execute();
        System.out.println("Data successfully inserted");
        }
        catch (Exception e){
            System.out.println("Data not inserted"+e);
        }
     }
}
