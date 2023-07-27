
package studentrecordsystem;

import java.sql.*;

public class connector{
    
    public Connection c;
    public Statement s;
 
    public connector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","azrielbarcelona00");    
            s =c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    ResultSet executeQuery(String q) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
   

   