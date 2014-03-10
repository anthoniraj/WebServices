
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test 
{
    public static void main(String a[])
    {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from users where name='Raja1' and pwd='internet'";
        String host = "jdbc:derby://localhost:1527/student_details";
        try {
            con = DriverManager.getConnection(host, "webservice", "authentication");
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                System.out.println("Welcome");
            }
            else
            {
                System.out.println("InValid Ueer");
            }   
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }
        
    }
}
