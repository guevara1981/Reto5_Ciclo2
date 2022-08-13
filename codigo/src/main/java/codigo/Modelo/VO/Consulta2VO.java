package codigo.Modelo.VO;

import java.sql.ResultSet;
import java.util.ArrayList;
import codigo.Modelo.DAO.Consulta2DAO;

public class Consulta2VO {

    public static ArrayList<String[]> valores() {
        ResultSet rs=null;
        ArrayList<String []> salida = new ArrayList<String[]>();
        try {
            rs = Consulta2DAO.consulta();
            while (rs.next()){
                int ID=rs.getInt("ID_Proyecto");
                String constructora=rs.getString("Constructora");
                String nh=rs.getString("Numero_Habitaciones");
                String ciudad=rs.getString("Ciudad");
                salida.add(new String []{ID+"",constructora,nh,ciudad});
                
            
            }

            
        } catch (Exception e) {
            
        }
        return salida;
    }   
    
}
