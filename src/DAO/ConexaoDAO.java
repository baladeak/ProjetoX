
package DAO;



import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    
    public Connection conectaDB(){
        Connection conn = null;
        
        try {
        //usa //   String url = "jdbc:mysql://34.28.200.161:3306/mcnet?user=root&password=root&useSSL=false";
        // String url = "jdbc:mysql://localhost:3306/mcnet?user=root&password=&useSSL=false"; local  //
           //  String url = "jdbc:mysql://35.247.247.189:3306/mcnet?user=root&password=root&useSSL=false";    //br-sp  //
             String url = "jdbc:mysql://localhost:3306/feira?user=root&password=&useSSL=false";    //hostinger //
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ConexãoDAO"+ erro.getMessage());
            
        }
        
        
        return conn;
        
    };
    
}
