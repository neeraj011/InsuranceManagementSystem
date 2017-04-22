package oracleconnection;
import java.sql.*;
public class OracleConnection {
    public static void main(String[] args) {
        Connection conn=null;
        Connection conn1=null;
        try
        {
            String driverName= "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "localhost";
            String serverPort = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username = "JUHI_XE";
            String password = "oracle";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("System successfully connected to database");
            
        }
        catch(ClassNotFoundException e)
                {
                    System.out.println("Error 1");
                }
        catch(SQLException e)
                {
                    System.out.println("Error 2");
                }
        try
        {
            String driverName= "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "localhost";
            String serverPort = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username = "Aishu";
            String password = "oracle";
            conn1 = DriverManager.getConnection(url, username, password);
            System.out.println("System successfully connected to database");
            
        }
        catch(ClassNotFoundException e)
                {
                    System.out.println("Error 1");
                }
        catch(SQLException e)
                {
                    System.out.println("Error 2");
                }
        
        try
        {
            Statement st = conn1.createStatement();
            ResultSet rs = st.executeQuery("Select * from agent");
            while(rs.next())
            {
                int no = rs.getInt(1);
                String name=rs.getString(2).toString();
                System.out.println(" "+no+" "+name);
            }
            rs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
