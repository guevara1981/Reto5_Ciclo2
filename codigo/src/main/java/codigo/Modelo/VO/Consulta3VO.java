package codigo.Modelo.VO;

import java.sql.ResultSet;
import java.util.ArrayList;
import codigo.Modelo.DAO.Consulta3DAO;

public class Consulta3VO {

    public static ArrayList<String[]> valores() {
        ResultSet rs=null;
        ArrayList<String []> salida = new ArrayList<String[]>();
        try {
            rs = Consulta3DAO.consulta();
            while (rs.next()){
                int ID=rs.getInt("ID_compra");
                String constructora=rs.getString("Constructora");
                String banco=rs.getString("Banco_Vinculado");
                salida.add(new String []{ID+"",constructora,banco});
                
            
            }

            
        } catch (Exception e) {
           
        }
        return salida;
    }  
    
}
