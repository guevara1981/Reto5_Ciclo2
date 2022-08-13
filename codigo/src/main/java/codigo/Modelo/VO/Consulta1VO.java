package codigo.Modelo.VO;

import java.sql.ResultSet;
import java.util.ArrayList;
import codigo.Modelo.DAO.Consulta1DAO;

public class Consulta1VO {
    public static ArrayList<String[]> valores() {
        ResultSet rs=null;
        ArrayList<String []> salida = new ArrayList<String[]>();
        try {
            rs = Consulta1DAO.consulta();
            while (rs.next()){
                int ID=rs.getInt("ID_lider");
                String nombre=rs.getString("Nombre");
                String apellido=rs.getString("Primer_apellido");
                String ciudad=rs.getString("Ciudad_Residencia");
                salida.add(new String []{ID+"",nombre,apellido,ciudad});
                
            
            }

            
        } catch (Exception e) {
          
        }
        return salida;
        
    }
    
}
