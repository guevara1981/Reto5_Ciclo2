package codigo.Modelo.DAO;

import java.sql.*;
import codigo.Utilidades.*;

public class Consulta3DAO {
    public static ResultSet consulta(){
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String csql="select ID_Compra, Constructora, Banco_Vinculado from Compra JOIN Proyecto using (ID_Proyecto) WHERE Proveedor = 'Homecenter' and Ciudad = 'Salento';";
        try {
            conn=JDBCUtilities.conexion();
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);
    
    
        }catch (Exception e) {
            System.out.println(e);
    
        }  
        return  rs;
    }
    
}
