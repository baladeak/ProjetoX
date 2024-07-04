
package DAO;
import com.mysql.jdbc.PreparedStatement;
import DTO.VendedorDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AutenticarVendedorDAO {
     Connection conn;

    
    public ResultSet autenticacaoVendedor(VendedorDTO vendedorDTO){
        
        conn = new ConexaoDAO().conectaDB();
        vendedorDTO = new VendedorDTO();
        try{
            
            String sql = "Select * from vendedor where binary nm_login = ? and nm_senha = ?";
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, vendedorDTO.getNm_login());
            pstm.setString(2, vendedorDTO.getNm_senha());
           
            
            ResultSet rs = pstm.executeQuery();

            return rs;
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"UsuárioDAO: "+ e);
            return null;
        }
  
  
}
}
